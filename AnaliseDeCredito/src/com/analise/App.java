package com.analise;
public class App {
	public static void main(String[] args) {
		Analise analise = new Analise();
		Score score = new Score();
		Pessoa pessoa = new Pessoa("Martins", 21);
		pessoa.adicionarOcupacao(new Job("Programador"));
		pessoa.adicionarEscolaridade(new Escolaridade("Superior Completo"));
		pessoa.adicionarRenda(new Renda(800f));
		score.analisarPessoa(pessoa);
		analise.exibir(score);
	}
}
