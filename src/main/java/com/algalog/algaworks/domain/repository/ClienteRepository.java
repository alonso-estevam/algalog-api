package com.algalog.algaworks.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algalog.algaworks.domain.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
