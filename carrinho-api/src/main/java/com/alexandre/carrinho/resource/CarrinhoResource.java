package com.alexandre.carrinho.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alexandre.carrinho.model.Carrinho;
import com.alexandre.carrinho.model.Item;
import com.alexandre.carrinho.service.CarrinhoService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("ifood/carrinhos")
@RequiredArgsConstructor
public class CarrinhoResource {
	private final CarrinhoService carrinhoService = null;
	
	
	 @PostMapping
	public Item incluirItemNoCarrinho(@RequestBody ItemDto itemDto) {
		return carrinhoService.incluirItemNoCarrinho(itemDto);
		
	}
	 
	 @GetMapping("/{id}")
	 public Carrinho verCarrinho(@PathVariable() Long id) {
		 return carrinhoService.verCarrinho(id);
	 }
	 
	 @PatchMapping("/fecharCarrinho/{saccolaId}")
	 public Carrinho fecharCarrinho(@PathVariable("sacolaId") Long sacolaId, @RequestParam("formaPagamento") int formaPagamento) {
		 return carrinhoService.fecharCarrinho(sacolaId, formaPagamento);
	 }

}
