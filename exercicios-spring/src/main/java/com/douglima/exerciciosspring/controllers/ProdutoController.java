package com.douglima.exerciciosspring.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.douglima.exerciciosspring.model.entities.Produto;
import com.douglima.exerciciosspring.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path = "/pagina/{numeroPagina}")
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina) {
		Pageable page = PageRequest.of(numeroPagina, 2);
		return produtoRepository.findAll(page);
	}
	
	@GetMapping("/{id}")
	public Optional<Produto> obterPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	@GetMapping("/nome/{parteNome}")
	public Iterable<Produto> obterPorNome(@PathVariable String parteNome) {
		return produtoRepository.findByNomeContaining(parteNome);
	}
	
	@DeleteMapping("/{id}")
	public void deletarProdutoPorId(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
	
	
//	@PutMapping
//	public Produto atualizarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}

}
