package com.analise;

public class Score {

	private int scoreInicial;
	private int scorePorMeioDaRenda;

	public void analisarPessoa(Pessoa pessoa) {
		scoreInicial(pessoa);
		scorePorMeioDaRenda(pessoa);
	}

	private void scorePorMeioDaRenda(Pessoa pessoa) {
		scorePorMeioDaRenda = 0;
		if (pessoa.getRenda() < 900f) {
			scorePorMeioDaRenda = 50;
		} else {
			scorePorMeioDaRenda = 120;
		}
	}

	private void scoreInicial(Pessoa pessoa) {
		scoreInicial = 0;
		if (pessoa.getIdade() > 20) {
			scoreInicial = 100;
		} else {
			scoreInicial = 0;
		}
	}

	public int getScoreInicial() {
		return scoreInicial;
	}

	public int getScorePorMeioDaRenda() {
		return scorePorMeioDaRenda;
	}

	public int getScoreTotal() {
		return getScoreInicial() + getScorePorMeioDaRenda();
	}

}
