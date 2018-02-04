package com.analise;

public class Pessoa {

	private String nome;
	private int idade;
	private Job job;
	private Renda renda;
	private Escolaridade escolaridade;
	private Patrimonio patrimonio;
	private int cpf;
	private int rg;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa(String nome, int idade, int cpf, int rg) {
		this.nome = nome;
		this.idade =  idade;
		this.cpf = cpf;
		this.rg = rg;
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

	public Renda getRenda() {
		return renda;
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

	public void adicionarPatrimonio(Patrimonio patrimonio) {
		this.patrimonio = patrimonio;	
	}
	
	public float getPatrimonio() {
		return patrimonio.getValor();
	}

	public int getRg() {
		return rg;
	}

	public int getCpf() {
		return cpf;
	}


}
