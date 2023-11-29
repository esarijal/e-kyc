package com.hensatekno.projects.kyc.repository;

import com.hensatekno.projects.kyc.model.Produk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdukRepository extends JpaRepository<Produk, Long> {
}
