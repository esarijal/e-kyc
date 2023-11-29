package com.hensatekno.projects.kyc.controller;

import com.hensatekno.projects.kyc.model.Jabatan;
import com.hensatekno.projects.kyc.service.JabatanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jabatan")
public class JabatanController extends BaseRestController<Jabatan, Long, JabatanService> {
}
