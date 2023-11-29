package com.hensatekno.projects.kyc.service.impl;

import com.hensatekno.projects.kyc.model.Tujuan;
import com.hensatekno.projects.kyc.repository.TujuanRepository;
import com.hensatekno.projects.kyc.service.TujuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TujuanServiceImpl
        extends BaseService<Tujuan, Long, TujuanRepository>
        implements TujuanService {
    @Autowired
    public TujuanServiceImpl(TujuanRepository tujuanRepository) {
        super(tujuanRepository);
    }
}
