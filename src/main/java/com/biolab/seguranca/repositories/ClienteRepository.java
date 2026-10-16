package com.biolab.seguranca.repositories;

import com.biolab.seguranca.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
    Cliente findByEmail(String email);
}
