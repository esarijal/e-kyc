package com.hensatekno.projects.kyc.controller;

import com.hensatekno.projects.kyc.model.Produk;
import com.hensatekno.projects.kyc.service.ProdukService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produk")
public class ProdukController extends BaseRestController<Produk, Long, ProdukService> {
}
