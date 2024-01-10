package com.noturna.turistica.agencia.backendAgencia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Destinos")
public class Destinos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDestino;
	private String nome;

	@Column(columnDefinition = "TEXT")
	private String descricao;
	private Double preco;
	private String imgUrl;

	public Destinos() {
		super();
	}

	public Destinos(Long idDestino, String nome, String descricao, Double preco, String imgUrl) 
			{
		super();
		this.idDestino = idDestino;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.imgUrl = imgUrl;
	}

	public Long getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(Long idDestino) {
		this.idDestino = idDestino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}

