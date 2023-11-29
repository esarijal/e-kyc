package com.hensatekno.projects.kyc.controller;

import com.hensatekno.projects.kyc.model.SumberDana;
import com.hensatekno.projects.kyc.service.SumberDanaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sumber_dana")
public class SumberDanaController extends BaseRestController<SumberDana, Long, SumberDanaService> {
}
