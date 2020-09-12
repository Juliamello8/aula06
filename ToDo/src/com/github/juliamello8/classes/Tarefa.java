package com.github.juliamello8.classes;

import java.util.Scanner;

public class Tarefa extends Usuario{
	private int id;
	private char status;
	private String titulo;
	private String descricao; 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void CadastrarTarefa() {
		try (Scanner leitor = new Scanner(System.in)) {			
			System.out.println ("Título da tarefa: ");
			titulo = leitor.nextLine(); 

			System.out.println ("Descrição: ");
			descricao = leitor.nextLine(); 

			System.out.println ("Status: ");
			status = leitor.next().charAt(0); 

		} 
	} 	
}
