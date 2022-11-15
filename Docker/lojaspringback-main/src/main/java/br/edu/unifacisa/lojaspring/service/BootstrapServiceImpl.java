package br.edu.unifacisa.lojaspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unifacisa.lojaspring.model.Produto;

@Service
public class BootstrapServiceImpl implements BootstrapService {
	@Autowired
	private ProdutoService produtoService;
	
	@Override
	public void boot() {
		// se não há produtos no banco de dados
		if (produtoService.getQtdRegistros() == 0) {
			// vou cadastrar alguns produtos de exemplo
			produtoService.adicionar(new Produto("Fifa 23", "Jogo Fifa 2023 Português BR para PS4", 249, "https://images-submarino.b2w.io/produtos/01/00/img/5687479/0/5687479045G1.jpg"));
			produtoService.adicionar(new Produto("Smart TV Philco 43''", "Smart TV Philco 43'' Full HD 4K", 1799, "https://images-submarino.b2w.io/produtos/01/00/img/5822744/1/5822744105G1.jpg"));
			produtoService.adicionar(new Produto("Panela de Pressão", "Panela de Pressão Rochedo Turbo Top", 169, "https://images-submarino.b2w.io/produtos/01/00/img/5410668/4/5410668441G1.jpg"));
			produtoService.adicionar(new Produto("iPhone SE 64GB", "Apple iPhone SE 64GB 4,7''", 1999, "https://images-submarino.b2w.io/produtos/01/00/img/2449898/7/2449898703G1.jpg"));
			produtoService.adicionar(new Produto("Jogo de Toalhas", "Jogo de Toalhas 4 peças 100% algodão", 89, "https://images-submarino.b2w.io/produtos/01/00/img/1571842/4/1571842498G1.jpg"));
		}
	}
}
