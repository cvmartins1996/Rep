package com.oop.cast;

public class Cast {
	public static void main(String a[]) {
		Pessoa pessoa = new Pessoa();
		Nome nome = new Nome();
		Pessoa estranha = (Pessoa) nome;
		
		
		System.out.println("Primeiro: " + pessoa.nome());
		System.out.println("Segundo: " + nome.nome());
		System.out.println("Com cast: " + estranha.nome());
	}
}

class Pessoa{
	String nome() {
		return "hey";
	}
}

class Nome extends Pessoa{
	String nome() {
		return "as well";
	}
}