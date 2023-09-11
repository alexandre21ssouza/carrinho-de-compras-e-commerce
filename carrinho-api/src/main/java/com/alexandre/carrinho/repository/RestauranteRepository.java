package com.alexandre.carrinho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandre.carrinho.model.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

}
