package com.girlsinfo.Model;



import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto" , schema = "girlsinfo")
public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProdut")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "dataentr")
	private Date dataEntra;

	@Column(name = "qtdade")
	private int quantidade;

	@Column(name = "descricao")
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDataEntra() {
		return dataEntra;
	}

	public void setDataEntra(Date dataEntra) {
		this.dataEntra = dataEntra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

	
}
	