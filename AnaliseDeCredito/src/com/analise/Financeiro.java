package com.analise;

import java.util.ArrayList;
import java.util.List;

public class Financeiro {
	
	List<Banco> bancos = new ArrayList<>();
	
	public void emitirNotas(Banco banco) {
		bancos.add(banco);
	}
	
	public int certificarScore() {
		int scorePeloBanco = scorePeloBanco();
		return scorePeloBanco;
	}

	private int scorePeloBanco() {
		int scorePeloBanco = 0;
		for (Banco banco : bancos) {
			if (banco.disponibilizarCreditoInicial() > 10000f) {
				scorePeloBanco = 70;
			} else if (banco.disponibilizarCreditoInicial() > 5000f) {
				scorePeloBanco = 40;
			} else if (banco.disponibilizarCreditoInicial() > 2000f) {
				scorePeloBanco = 25;
			} else if (banco.disponibilizarCreditoInicial() > 950f) {
				scorePeloBanco = 5;
			} else {
				scorePeloBanco = 0;
			}
		}
		return scorePeloBanco;
	}

}
