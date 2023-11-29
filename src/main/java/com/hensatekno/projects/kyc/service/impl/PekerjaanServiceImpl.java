package com.hensatekno.projects.kyc.service.impl;

import com.hensatekno.projects.kyc.model.Pekerjaan;
import com.hensatekno.projects.kyc.repository.PekerjaanRepository;
import com.hensatekno.projects.kyc.service.PekerjaanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PekerjaanServiceImpl
        extends BaseService<Pekerjaan, Long, PekerjaanRepository>
        implements PekerjaanService {
    @Autowired
    public PekerjaanServiceImpl(PekerjaanRepository pekerjaanRepository) {
        super(pekerjaanRepository);
    }
}
