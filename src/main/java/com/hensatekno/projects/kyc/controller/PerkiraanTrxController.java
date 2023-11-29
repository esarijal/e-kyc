package com.hensatekno.projects.kyc.controller;

import com.hensatekno.projects.kyc.model.PerkiraanTrx;
import com.hensatekno.projects.kyc.service.PerkiraanTrxService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/perkiraan_trx")
public class PerkiraanTrxController extends BaseRestController<PerkiraanTrx, Long, PerkiraanTrxService> {
}
