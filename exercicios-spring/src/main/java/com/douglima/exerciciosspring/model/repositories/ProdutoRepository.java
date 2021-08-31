package com.douglima.exerciciosspring.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.douglima.exerciciosspring.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
	public Iterable<Produto> findByNomeContaining(String parteNome);
}
