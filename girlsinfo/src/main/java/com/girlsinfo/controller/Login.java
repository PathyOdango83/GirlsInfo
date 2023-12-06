package com.girlsinfo.controller;

	public class Login {

	 private String user;
	 private String senha;
	 
	 
	 public Login() {
	  super();
	  // TODO Auto-generated constructor stub
	 }
	 
	 public Login(String user, String senha) {
	  super();
	  this.user = user;
	  this.senha =senha;
	 }

	 public String getUser() {
	  return user;
	 }
	 public void setUser(String user) {
	  this.user = user;
	 }
	 public String getSenha() {
	  return senha;
	 }
	 public void setSenha(String senha) {
	  this.senha = senha;
	 }
	 
	}

