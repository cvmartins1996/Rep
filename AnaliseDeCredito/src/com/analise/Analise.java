package com.analise;

public class Analise {

	public void exibir(Score score) {
		System.out.println("Dados do Cliente: " + score.getInforma�oesDoSolicitante());
		System.out.println("Analise do credito: "  + score.getScoreTotal());
	}

}
