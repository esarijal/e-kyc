package com.hensatekno.projects.kyc.service.impl;

import com.hensatekno.projects.kyc.model.Cabang;
import com.hensatekno.projects.kyc.repository.CabangRepository;
import com.hensatekno.projects.kyc.service.CabangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabangServiceImpl
        extends BaseService<Cabang, Long, CabangRepository>
        implements CabangService {
    private final CabangRepository cabangRepository;

    @Autowired
    public CabangServiceImpl(CabangRepository cabangRepository) {
        super(cabangRepository);
        this.cabangRepository = cabangRepository;
    }
}
