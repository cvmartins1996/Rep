package com.analise;

public class Pessoa {

	private String nome;
	private int idade;
	private Job job;
	private Renda renda;
	private Escolaridade escolaridade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void adicionarOcupacao(Job job) {
		this.job = job;
	}

	public void adicionarRenda(Renda renda) {
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public float getRenda() {
		return renda.getValor();
	}
	
	public String getJob() {
		return job.getJob();
	}

	public void adicionarEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	public String getEscolaridade() {
		return escolaridade.getEscolaridade();
	}

}
