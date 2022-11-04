package com.algalog.algaworks.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algalog.algaworks.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente = new Cliente();
		cliente.setId(1L);
		cliente.setNome("Alonso");
		cliente.setEmail("calango@email.com");
		
		return Arrays.asList(cliente);
	}
	
}
