package com.github.juliamello8.classes;

import java.util.Scanner;

public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String cargo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(this.email.length() != 0 && this.email.indexOf('@')==1) {
			if(this.email.indexOf('.')==1) {
				this.email = email;																		
			}
		}else {
			System.out.println ("E-mail inválido, favor conferir!");
		}
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void CadastrarUsuario() {
		try (Scanner leitor = new Scanner(System.in)) {			
			System.out.println ("Nome: ");
			nome = leitor.nextLine(); 

			System.out.println ("E-mail: ");
			email = leitor.nextLine(); 

			System.out.println ("Cargo: ");
			cargo = leitor.nextLine(); 

		} 
	} 	
	
}
