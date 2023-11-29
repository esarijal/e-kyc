package com.hensatekno.projects.kyc.security;

import com.hensatekno.projects.kyc.model.enums.Role;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final JwtRequestFilter jwtRequestFilter;
    private final AuthenticationConfiguration authenticationConfiguration;

    public SecurityConfig(JwtRequestFilter jwtRequestFilter, AuthenticationConfiguration authenticationConfiguration) {
        this.jwtRequestFilter = jwtRequestFilter;
        this.authenticationConfiguration = authenticationConfiguration;
    }

    @Bean
    protected UserDetailsService userDetailsService(){
        return new CustomUserDetailsService();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager() throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService());
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.
                authorizeHttpRequests(auth -> auth
                        .requestMatchers(HttpMethod.GET,
                                "/api/pekerjaan", "/api/pekerjaan/{id}",
                                "/api/pendidikan", "/api/pendidikan/{id}",
                                "/api/cabang", "/api/cabang/{id}",
                                "/api/jabatan", "/api/jabatan/{id}",
                                "/api/tujuan", "/api/tujuan/{id}",
                                "/api/perkiraan_trx", "/api/perkiraan_trx/{id}",
                                "/api/sumber_dana", "/api/sumber_dana/{id}",
                                "/api/bidang_usaha", "/api/bidang_usaha/{id}",
                                "/api/penghasilan", "/api/penghasilan/{id}",
                                "/api/produk", "/api/produk/{id}"
                        )
                            .permitAll()
                        .requestMatchers("/api/users", "/api/users/{id}")
                            .hasRole(Role.ADMIN.name())
                        .requestMatchers(HttpMethod.POST,
                                "/api/pekerjaan/**",
                                "/api/pendidikan/**",
                                "/api/cabang**",
                                "/api/jabatan/**",
                                "/api/tujuan/**",
                                "/api/perkiran_trx/**",
                                "/api/sumber_dana/**",
                                "/api/bidang_usaha/**",
                                "/api/penghasilan/**",
                                "/api/produk/**"
                        )
                            .hasRole(Role.ADMIN.name())
                        .requestMatchers(HttpMethod.PUT,
                                "/api/pekerjaan/**",
                                "/api/pendidikan/**",
                                "/api/cabang**",
                                "/api/jabatan/**",
                                "/api/tujuan/**",
                                "/api/perkiran_trx/**",
                                "/api/sumber_dana/**",
                                "/api/bidang_usaha/**",
                                "/api/penghasilan/**",
                                "/api/produk/**"
                        )
                            .hasRole(Role.ADMIN.name())
                        .requestMatchers(HttpMethod.DELETE,
                                "/api/pekerjaan/**",
                                "/api/pendidikan/**",
                                "/api/cabang**",
                                "/api/jabatan/**",
                                "/api/tujuan/**",
                                "/api/perkiran_trx/**",
                                "/api/sumber_dana/**",
                                "/api/bidang_usaha/**",
                                "/api/penghasilan/**",
                                "/api/produk/**"
                        )
                            .hasRole(Role.ADMIN.name())
                        .anyRequest().authenticated())
                .addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class)
                .exceptionHandling(exception -> exception.authenticationEntryPoint(new JwtAuthenticationEntryPoint()))
                .csrf(AbstractHttpConfigurer::disable)
                .httpBasic(AbstractHttpConfigurer::disable)
                .formLogin(AbstractHttpConfigurer::disable)
                .logout(AbstractHttpConfigurer::disable)
                .headers(head -> head.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable))
        ;

        return http.build();
    }

}
