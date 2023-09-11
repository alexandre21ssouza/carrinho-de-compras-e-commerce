package com.alexandre.carrinho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandre.carrinho.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
