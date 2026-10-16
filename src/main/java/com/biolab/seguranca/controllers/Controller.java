package com.biolab.seguranca.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/user")
    public ResponseEntity<?> publico(){
        return ResponseEntity.ok("user");
    }

    @GetMapping("/admin")
    public ResponseEntity<?> admin(){
        return ResponseEntity.ok("admin");
    }
}
