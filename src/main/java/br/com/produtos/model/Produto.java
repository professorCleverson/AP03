package br.com.produtos.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	private String nomeProduto;
	private Date dataCompra;
	private Date dataValidade;
	private Integer unidadeMedida;
	private Double quantEntradas;
	private Double quantSaidas;
	
	public Produto() {
		
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long id_produto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Integer getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(Integer unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Double getQuantEntradas() {
		return quantEntradas;
	}

	public void setQuantEntradas(Double quantEntradas) {
		this.quantEntradas = quantEntradas;
	}

	public Double getQuantSaidas() {
		return quantSaidas;
	}

	public void setQuantSaidas(Double quantSaidas) {
		this.quantSaidas = quantSaidas;
	}
	
	

}
