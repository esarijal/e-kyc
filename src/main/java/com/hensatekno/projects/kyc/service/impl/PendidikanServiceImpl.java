package com.hensatekno.projects.kyc.service.impl;

import com.hensatekno.projects.kyc.model.Pendidikan;
import com.hensatekno.projects.kyc.repository.PendidikanRepository;
import com.hensatekno.projects.kyc.service.PendidikanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PendidikanServiceImpl
        extends BaseService<Pendidikan, Long, PendidikanRepository>
        implements PendidikanService {
    @Autowired
    public PendidikanServiceImpl(PendidikanRepository pendidikanRepository) {
        super(pendidikanRepository);
    }
}
