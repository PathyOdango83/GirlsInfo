package com.girlsinfo.Model;
	
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	@Table(name = "usuario" , schema = "girlsinfo")
	public class UsuarioModel {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Long id;
		
		@Column(name = "user")
		private String user;
		
		@Column(name = "senha")
		private String senha;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

	
		public String getUser() {
			return user;
		}

		public void setUsuario(String user) {
			this.user = user;
		}


		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}
		



}
