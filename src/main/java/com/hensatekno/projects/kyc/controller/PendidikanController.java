package com.hensatekno.projects.kyc.controller;

import com.hensatekno.projects.kyc.model.Pendidikan;
import com.hensatekno.projects.kyc.service.PendidikanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pendidikan")
public class PendidikanController extends BaseRestController<Pendidikan, Long, PendidikanService> {
}
