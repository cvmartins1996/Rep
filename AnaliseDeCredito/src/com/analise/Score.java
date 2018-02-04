package com.analise;

public class Score {

	private int scoreInicial;
	private int scorePorMeioDaRenda;
	private Pessoa pessoa;
	private int scorePorPatrimonio;
	private int scorePeloBanco;

	public void analisarPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
		scoreInicial(pessoa);
		scorePorMeioDaRenda(pessoa);
		scorePorPatrimonio(pessoa);
	}

	private void scorePorPatrimonio(Pessoa pessoa) {
		scorePorPatrimonio = 0;
		if (pessoa.getPatrimonio() > 200000f) {
			scorePorPatrimonio = 100;
		} else if (pessoa.getPatrimonio() > 100000f ) {
			scorePorPatrimonio = 60;
		} else if(pessoa.getPatrimonio() > 40000f) {
			scorePorPatrimonio = 20;
		} else {
			scorePorPatrimonio = 10;
		}
	}

	private void scorePorMeioDaRenda(Pessoa pessoa) {
		scorePorMeioDaRenda = 0;
		if (pessoa.getRenda().getValor() < 900f) {
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
	
	private int getScorePorPatrimonio() {
		return scorePorPatrimonio;
	}
	
	
	public String getInformaçoesDoSolicitante() {
		String msg = "\nNome do solicitante: " + pessoa.getNome() +"\nIdade do solicitante: " + pessoa.getIdade() + "\nEscolaridade do solicitante: " + pessoa.getEscolaridade() + "\nOcupação do solicitante: " + pessoa.getJob();
		return msg;
	}

	public void verificarNotasEmitidasPelaFinasa(Financeiro finasa) {
		scorePeloBanco = 0;
		scorePeloBanco = finasa.certificarScore();
	}

	public int getScorePeloBanco() {
		return scorePeloBanco;
	}
	
	public int getScoreTotal() {
		return getScoreInicial() + getScorePorMeioDaRenda() + getScorePorPatrimonio() + getScorePeloBanco();
	}
}
