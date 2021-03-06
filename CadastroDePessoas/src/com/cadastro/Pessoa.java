package com.cadastro;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private String nome;
	private int idade;
	private Financeiro financeiro;
	private Email email;
	private Job job;
	private Credito credito;
	private List<Transacao> transacoes = new ArrayList<>();
	
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
		return ("Email do User: "+ emailDoUser.concat(" ") +  "Ocupa��o: " + jobDoUser);
	}

	public void setCredito(Credito credito) {
		this.credito = credito;
	}
	
	public String getInformacoesDeCredito() {
		String msg = ("\nCr�dito disp�nivel: " + creditoDisponivel() + "\nJuros Anual: " + jurosAnual());
		return msg;
	}

	private float jurosAnual() {
		return credito.getJuros();
	}

	private float creditoDisponivel() {
		return credito.getCredito();
	}

	public void adicionarTransacao(Transacao transacao) {
		transacoes.add(transacao);
	}

	public float verificaCreditos() {
		return compraEfetuadaNoCredito();
	}

	private float compraEfetuadaNoCredito() {
		float creditoRestante = creditoDisponivel();
		for (Transacao transacao : transacoes) {
			creditoRestante = creditoRestante - transacao.transacaoCredito();
		}
		return creditoRestante;
	}
}
