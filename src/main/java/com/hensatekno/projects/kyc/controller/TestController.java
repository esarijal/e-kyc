package com.hensatekno.projects.kyc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @GetMapping
    public ResponseEntity<?> test() {
        return ResponseEntity.ok("OK You're got it");
    }

    @GetMapping("/secured")
    public ResponseEntity<?> testSecured() {
        return ResponseEntity.ok("This is secured");
    }
}
