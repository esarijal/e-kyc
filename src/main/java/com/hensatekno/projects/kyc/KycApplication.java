package com.hensatekno.projects.kyc;

import com.hensatekno.projects.kyc.model.Pekerjaan;
import com.hensatekno.projects.kyc.model.User;
import com.hensatekno.projects.kyc.model.enums.Role;
import com.hensatekno.projects.kyc.repository.PekerjaanRepository;
import com.hensatekno.projects.kyc.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class KycApplication {

	public static void main(String[] args) {
		SpringApplication.run(KycApplication.class, args);
	}

	@Bean
	@Profile("!test")
	CommandLineRunner initDatabase(UserRepository userRepository,
								   PekerjaanRepository pekerjaanRepository,
								   PasswordEncoder passwordEncoder){
		return args -> {
			// Create a sample pekerjaan
			Pekerjaan pekerjaan = new Pekerjaan("PNS", 1);
			pekerjaanRepository.save(pekerjaan);

			pekerjaan = new Pekerjaan("Pegawai Swasta", 1);
			pekerjaanRepository.save(pekerjaan);

			// Create a sample admin
			User user = new User(1l, "admin", passwordEncoder.encode("password"), Collections.singleton(Role.ADMIN));
			userRepository.save(user);

			// Create a sample user
			user = new User(2l, "user", passwordEncoder.encode("password"), Collections.singleton(Role.USER));
			userRepository.save(user);

		};
	}

}
