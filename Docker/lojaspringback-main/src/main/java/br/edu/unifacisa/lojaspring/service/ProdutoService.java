package br.edu.unifacisa.lojaspring.service;

import java.util.List;

import br.edu.unifacisa.lojaspring.model.Produto;

public interface ProdutoService {
	public Produto adicionar(Produto produto);
	public Produto alterar(Long id, Produto produto);
	public Produto remover(Long id);
	public List<Produto> encontrarTodos();
	public Produto encontrarPorId(Long id);
	public long getQtdRegistros();
}
