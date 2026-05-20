package br.com.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.produtos.model.Produto;

public interface ProdutosRepository extends JpaRepository<Produto, Long>{

}
