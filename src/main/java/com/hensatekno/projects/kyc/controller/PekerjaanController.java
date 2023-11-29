package com.hensatekno.projects.kyc.controller;

import com.hensatekno.projects.kyc.model.Pekerjaan;
import com.hensatekno.projects.kyc.service.PekerjaanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pekerjaan")
public class PekerjaanController extends BaseRestController<Pekerjaan, Long, PekerjaanService> {
}
