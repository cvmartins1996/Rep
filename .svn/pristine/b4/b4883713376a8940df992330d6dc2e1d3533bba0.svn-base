package com.calculo;

import java.util.ArrayList;
import java.util.List;

public class Linha2D {

	private List<PontoA> valores = new ArrayList<>();
	private List<PontoB> valoresB = new ArrayList<>();

	public void adicionarValoresEmA(PontoA valor) {
		valores.add(valor);
	}

	public void adicionarValoresEmB(PontoB valor) {
		valoresB.add(valor);
	}

	public float getCalculo() {
		return somarPontosDeA() + somarPontosDeB();
	}

	private float somarPontosDeA() {
		float somarA = 0;
		for (PontoA pontoA : valores) {
			somarA = somarA + pontoA.getValor();
		}
		return somarA;
	}

	private float somarPontosDeB() {
		float somarB = 0;
		for (PontoB pontoB : valoresB) {
			somarB = somarB + pontoB.getValor();
		}
		return somarB;
	}

	public boolean isLinha() {
		return true;
	}


}
