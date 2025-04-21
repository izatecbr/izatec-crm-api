package com.izatec.crm.api;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
    Optional<Cliente> findByNome(String nome);
}
