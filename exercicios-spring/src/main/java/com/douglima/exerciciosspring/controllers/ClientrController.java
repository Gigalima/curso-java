package com.douglima.exerciciosspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.douglima.exerciciosspring.model.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClientrController {
	
	@GetMapping(path= "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(10, "Arthur", "456.123.789-10");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClienteID(@PathVariable int id) {
		return new Cliente(id, "Ariel", "123.456.789-00");
	}
	
	@GetMapping
	public Cliente obterClienteID2(@RequestParam(name="id") int id) {
		return new Cliente(id, "Thor", "111.222.333-44");
	}

}
