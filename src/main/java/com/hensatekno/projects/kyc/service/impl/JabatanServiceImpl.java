package com.hensatekno.projects.kyc.service.impl;

import com.hensatekno.projects.kyc.model.Jabatan;
import com.hensatekno.projects.kyc.model.Pekerjaan;
import com.hensatekno.projects.kyc.repository.JabatanRepository;
import com.hensatekno.projects.kyc.repository.PekerjaanRepository;
import com.hensatekno.projects.kyc.service.JabatanService;
import com.hensatekno.projects.kyc.service.PekerjaanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JabatanServiceImpl
        extends BaseService<Jabatan, Long, JabatanRepository>
        implements JabatanService {
    @Autowired
    public JabatanServiceImpl(JabatanRepository jabatanRepository) {
        super(jabatanRepository);
    }
}
