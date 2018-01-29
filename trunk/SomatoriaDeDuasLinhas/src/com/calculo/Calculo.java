package com.calculo;

public class Calculo {

	public void exibir(Linha2D linha2D) {
		calculoRealizado(linha2D);
	}

	private void calculoRealizado(Linha2D linha2D) {
		System.out.println("Somatoria de valores: " + linha2D.getCalculo());
	}

}
