package br.edu.unifacisa.lojaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifacisa.lojaspring.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}
