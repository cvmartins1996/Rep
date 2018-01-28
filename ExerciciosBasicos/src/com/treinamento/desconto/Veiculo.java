package com.treinamento.desconto;

public class Veiculo {

	private String nome;
	private float valor;
	private int ano;
	private Desconto desconto;

	public Veiculo(String nome, float valor, int ano) {
		this.nome = nome;
		this.valor = valor;
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public float getValor() {
		return valor;
	}

	public void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}
	
	public float getDesconto() {
		return desconto.verificarDesconto(this);
	}

	public String getNome() {
		return nome;
	}

}
