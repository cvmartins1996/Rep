package com.oop.constructor;
public class App {
	public static void main(String a[]) {
		Nome caio = new Nome("Caio");
		System.out.println("\n Maneiras de pegar pelo Construtor: ");
		System.out.println(" " + caio.nome);
		System.out.println(" " + caio.getNome());
	}
}


class Nome {

	String nome;

	public Nome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
}