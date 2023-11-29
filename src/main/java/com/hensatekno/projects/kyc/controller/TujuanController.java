package com.hensatekno.projects.kyc.controller;

import com.hensatekno.projects.kyc.model.Tujuan;
import com.hensatekno.projects.kyc.service.TujuanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tujuan")
public class TujuanController extends BaseRestController<Tujuan, Long, TujuanService> {
}
