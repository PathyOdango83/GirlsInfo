package com.girlsinfo.Model;



import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "servicos" , schema = "girlsinfo")
public class ServicoModel {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "idserv")
		private Long id;
		
		@Column(name = "nome")
		private String nome;
		
		@Column(name = "tipo")
		private String tipo;
		
		@Column(name = "data")
		private Date data;
		
		@Column(name = "local")
		private String local;

		@Column(name = "cpffunc")
		private String cpfFuncionario;
		
		@Column(name = "nomecliente")
		private String nomeCliente;

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

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public String getLocal() {
			return local;
		}

		public void setLocal(String local) {
			this.local = local;
		}

		public String getCpfFuncionario() {
			return cpfFuncionario;
		}

		public void setCpfFuncionario(String cpfFuncionario) {
			this.cpfFuncionario = cpfFuncionario;
		}

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}


		
		
}