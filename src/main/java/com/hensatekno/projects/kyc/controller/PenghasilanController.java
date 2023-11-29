package com.hensatekno.projects.kyc.controller;

import com.hensatekno.projects.kyc.model.Penghasilan;
import com.hensatekno.projects.kyc.service.PenghasilanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/penghasilan")
public class PenghasilanController extends BaseRestController<Penghasilan, Long, PenghasilanService> {
}
