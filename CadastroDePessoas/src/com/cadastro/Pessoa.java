package com.cadastro;

public class Pessoa {

	private String nome;
	private int idade;
	private Financeiro financeiro;
	private Email email;
	private Job job;
	private Credito credito;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void adicionarOcupacao(Job job) {
		this.job = job;
	}

	public void adicionarEmail(Email email) {
		this.email = email;
	}

	public void setFinanceiro(Financeiro financeiro) {
		this.financeiro = financeiro;
	}
	
	public int getScore() {
		return financeiro.getScore();
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String demaisInformacoes() {
		String emailDoUser = email.getEmail();
		String jobDoUser = job.getJob();
		return ("Email do User: "+ emailDoUser.concat(" ") +  "Ocupação: " + jobDoUser);
	}

	public void setCredito(Credito credito) {
		this.credito = credito;
	}
	
	public String getInformacoesDeCredito() {
		String msg = ("\nCrédito dispónivel: " + creditoDisponivel() + "\nJuros Anual: " + jurosAnual());
		return msg;
	}

	private float jurosAnual() {
		return credito.getJuros();
	}

	private float creditoDisponivel() {
		return credito.getCredito();
	}
	
}
