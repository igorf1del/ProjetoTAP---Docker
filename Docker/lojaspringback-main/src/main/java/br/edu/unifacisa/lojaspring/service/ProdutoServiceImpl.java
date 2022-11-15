package br.edu.unifacisa.lojaspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unifacisa.lojaspring.model.Produto;
import br.edu.unifacisa.lojaspring.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	@Autowired
	private ProdutoRepository repo;

	@Override
	public Produto adicionar(Produto produto) {
		return repo.save(produto);
	}

	@Override
	public Produto alterar(Long id, Produto alterado) {
		Produto salvo = repo.findById(id).get();
		salvo.setNome(alterado.getNome());
		salvo.setDescricao(alterado.getDescricao());
		salvo.setFoto(alterado.getFoto());
		salvo.setValor(alterado.getValor());
		return repo.save(salvo);
	}

	@Override
	public Produto remover(Long id) {
		Produto p = repo.findById(id).get();
		repo.delete(p);
		return p;
	}

	@Override
	public List<Produto> encontrarTodos() {
		return repo.findAll();
	}

	@Override
	public Produto encontrarPorId(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public long getQtdRegistros() {
		return repo.count();
	}
}
