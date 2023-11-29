package com.hensatekno.projects.kyc.service.impl;

import com.hensatekno.projects.kyc.model.Produk;
import com.hensatekno.projects.kyc.repository.ProdukRepository;
import com.hensatekno.projects.kyc.service.ProdukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdukServiceImpl
        extends BaseService<Produk, Long, ProdukRepository>
        implements ProdukService {
    @Autowired
    public ProdukServiceImpl(ProdukRepository produkRepository) {
        super(produkRepository);
    }
}
