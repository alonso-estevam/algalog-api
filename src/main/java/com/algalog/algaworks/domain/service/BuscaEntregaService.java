package com.algalog.algaworks.domain.service;

import org.springframework.stereotype.Service;

import com.algalog.algaworks.domain.exception.EntidadeNaoEncontradaException;
import com.algalog.algaworks.domain.model.Entrega;
import com.algalog.algaworks.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
	
}
