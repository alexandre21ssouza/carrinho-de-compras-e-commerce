package com.alexandre.carrinho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandre.carrinho.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
