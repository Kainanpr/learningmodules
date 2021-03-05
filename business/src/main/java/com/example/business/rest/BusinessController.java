package com.example.business.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business")
public class BusinessController {

    @GetMapping
    public ResponseEntity<String> testBusiness() {
        return ResponseEntity.ok("Business OK");
    }
}
