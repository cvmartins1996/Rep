package com.analise;

public class Agencia {

	private String nome;
	private int numero;
	private Pessoa pessoa;

	public Agencia(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public void cadastrarPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

}
