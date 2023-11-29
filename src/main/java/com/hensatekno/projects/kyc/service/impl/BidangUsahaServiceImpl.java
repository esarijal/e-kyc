package com.hensatekno.projects.kyc.service.impl;

import com.hensatekno.projects.kyc.model.BidangUsaha;
import com.hensatekno.projects.kyc.repository.BidangUsahaRepository;
import com.hensatekno.projects.kyc.service.BidangUsahaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidangUsahaServiceImpl
        extends BaseService<BidangUsaha, Long, BidangUsahaRepository>
        implements BidangUsahaService {
    @Autowired
    public BidangUsahaServiceImpl(BidangUsahaRepository bidangUsahaRepository) {
        super(bidangUsahaRepository);
    }
}
