package com.github.juliamello8.programa;
import com.github.juliamello8.classes.*;


public class Programa {
	public static void inicio() {
		System.out.println("\nCadastro do Usuário");
		Usuario user1 = new Usuario();
		user1.CadastrarUsuario();
		
	}
	
	public static void main(String[] args) {
		inicio();
		System.out.print("Cadastro realizado com sucesso!");
	}
}
