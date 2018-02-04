package com.analise;
public class App {
	public static void main(String[] args) {
		Analise analise = new Analise();
		Score score = new Score();
		Pessoa pessoa = new Pessoa("Martins", 21);
		pessoa.adicionarOcupacao(new Job("Programador"));
		pessoa.adicionarEscolaridade(new Escolaridade("Superior Completo"));
		pessoa.adicionarRenda(new Renda(800f));
		pessoa.adicionarPatrimonio(new Patrimonio(0f));
		score.analisarPessoa(pessoa);
		analise.exibir(score);
		Pessoa outra = new Pessoa("Neuza", 32);
		outra.adicionarEscolaridade(new Escolaridade("Ensino Medio Completo"));
		outra.adicionarOcupacao(new Job("Costureira"));
		outra.adicionarRenda(new Renda(2100f));
		outra.adicionarPatrimonio(new Patrimonio(120000f));
		score.analisarPessoa(outra);
		analise.exibir(score);
	}
}
