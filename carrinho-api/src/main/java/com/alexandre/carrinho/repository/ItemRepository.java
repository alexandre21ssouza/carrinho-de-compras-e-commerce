package com.alexandre.carrinho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandre.carrinho.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
