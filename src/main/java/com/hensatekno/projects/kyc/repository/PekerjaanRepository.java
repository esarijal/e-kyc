package com.hensatekno.projects.kyc.repository;

import com.hensatekno.projects.kyc.model.Pekerjaan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PekerjaanRepository extends JpaRepository<Pekerjaan, Long> {
}
