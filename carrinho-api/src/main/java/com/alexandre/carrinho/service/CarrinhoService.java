package com.alexandre.carrinho.service;

import com.alexandre.carrinho.model.Carrinho;
import com.alexandre.carrinho.model.Item;
import com.alexandre.carrinho.resource.ItemDto;

public interface CarrinhoService {
	Item incluirItemNoCarrinho(ItemDto itemDto);
	Carrinho verCarrinho(Long id);
	Carrinho fecharCarrinho(Long id, int formaPagamento);
}
