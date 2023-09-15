package com.alexandre.carrinho.service;

import org.springframework.stereotype.Service;

import com.alexandre.carrinho.enumeration.FormaPagamento;
import com.alexandre.carrinho.model.Carrinho;
import com.alexandre.carrinho.model.Item;
import com.alexandre.carrinho.repository.CarrinhoRepository;
import com.alexandre.carrinho.resource.ItemDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarrinhoServiceImpl implements CarrinhoService {
	private final CarrinhoRepository carrinhoRepository = null;

	@Override
	public Item incluirItemNoCarrinho(ItemDto itemDto) {
		return null;
	}

	@Override
	public Carrinho verCarrinho(Long id) {
	    return carrinhoRepository.findById(id).orElseThrow(
	    		() -> {
	    throw new RuntimeException("Esse carrinho não existe!");
	    }
	  );
	}

	@Override
	public Carrinho fecharCarrinho(Long id, int numeroformaPagamento) {
		Carrinho carrinho = verCarrinho(id);
		
		
		if(carrinho.getItens().isEmpty()) {
			throw new RunTimeException("Inclua um item no carrinho");
			
		}
		FormaPagamento formaPagamento = 
		numeroformaPagamento == 0 ? FormaPagamento.DINHEIRO : FormaPagamento.MAQUINETA;
		
	}

}
