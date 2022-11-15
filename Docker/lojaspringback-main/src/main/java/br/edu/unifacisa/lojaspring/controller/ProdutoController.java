package br.edu.unifacisa.lojaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifacisa.lojaspring.model.Produto;
import br.edu.unifacisa.lojaspring.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService service;
	
	@GetMapping
	@CrossOrigin
	public List<Produto> getTodosOsProdutos() {
		return service.encontrarTodos();
	}
	
	@GetMapping("/{id}")
	@CrossOrigin
	public Produto getApenasUmProdutoPeloId(@PathVariable Long id) {
		return service.encontrarPorId(id);
	}
	
	@PostMapping
	@CrossOrigin
	public Produto adicionarProduto(@RequestBody Produto novo) {
		return service.adicionar(novo);
	}
	
	@PutMapping("/{id}")
	@CrossOrigin
	public Produto alterarUmProduto(@RequestBody Produto alterado,
			                        @PathVariable Long id) {
		return service.alterar(id, alterado);
	}
	
	@DeleteMapping("/{id}")
	@CrossOrigin
	public Produto removerUmProduto(@PathVariable  Long id) {
		return service.remover(id);
	}
}
