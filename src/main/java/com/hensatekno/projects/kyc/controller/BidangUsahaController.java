package com.hensatekno.projects.kyc.controller;

import com.hensatekno.projects.kyc.model.BidangUsaha;
import com.hensatekno.projects.kyc.service.BidangUsahaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bidang_usaha")
public class BidangUsahaController extends BaseRestController<BidangUsaha, Long, BidangUsahaService> {
}
