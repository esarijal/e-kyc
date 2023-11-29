package com.hensatekno.projects.kyc.service.impl;

import com.hensatekno.projects.kyc.model.SumberDana;
import com.hensatekno.projects.kyc.repository.SumberDanaRepository;
import com.hensatekno.projects.kyc.service.SumberDanaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SumberDanaServiceImpl
        extends BaseService<SumberDana, Long, SumberDanaRepository>
        implements SumberDanaService {
    @Autowired
    public SumberDanaServiceImpl(SumberDanaRepository sumberDanaRepository) {
        super(sumberDanaRepository);
    }
}
