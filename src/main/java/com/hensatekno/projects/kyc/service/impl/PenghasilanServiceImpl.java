package com.hensatekno.projects.kyc.service.impl;

import com.hensatekno.projects.kyc.model.Penghasilan;
import com.hensatekno.projects.kyc.repository.PenghasilanRepository;
import com.hensatekno.projects.kyc.service.PenghasilanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PenghasilanServiceImpl
        extends BaseService<Penghasilan, Long, PenghasilanRepository>
        implements PenghasilanService {
    @Autowired
    public PenghasilanServiceImpl(PenghasilanRepository penghasilanRepository) {
        super(penghasilanRepository);
    }
}
