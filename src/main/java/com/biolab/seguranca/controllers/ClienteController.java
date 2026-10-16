package com.biolab.seguranca.controllers;

import com.biolab.seguranca.DTOs.ClienteDTO;
import com.biolab.seguranca.services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> criarCliente (@RequestBody ClienteDTO dto){
        return ResponseEntity.ok(service.criarCliente(dto));
    }

    @GetMapping
    public ResponseEntity<?> ola(){
        return ResponseEntity.ok("ola");
    }
}
