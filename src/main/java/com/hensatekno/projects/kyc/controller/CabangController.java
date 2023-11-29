package com.hensatekno.projects.kyc.controller;

import com.hensatekno.projects.kyc.model.Cabang;
import com.hensatekno.projects.kyc.service.CabangService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cabang")
public class CabangController extends BaseRestController<Cabang, Long, CabangService> {
}
