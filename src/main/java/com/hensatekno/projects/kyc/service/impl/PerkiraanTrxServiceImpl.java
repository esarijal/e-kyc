package com.hensatekno.projects.kyc.service.impl;

import com.hensatekno.projects.kyc.model.PerkiraanTrx;
import com.hensatekno.projects.kyc.repository.PerkiraanTrxRepository;
import com.hensatekno.projects.kyc.service.PerkiraanTrxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerkiraanTrxServiceImpl
        extends BaseService<PerkiraanTrx, Long, PerkiraanTrxRepository>
        implements PerkiraanTrxService {
    @Autowired
    public PerkiraanTrxServiceImpl(PerkiraanTrxRepository perkiraanTrxRepository) {
        super(perkiraanTrxRepository);
    }
}
