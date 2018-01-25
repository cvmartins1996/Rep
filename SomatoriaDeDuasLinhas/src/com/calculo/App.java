package com.calculo;
public class App {
	public static void main(String a[]) {
		Linha2D linha = new Linha2D();
		linha.adicionarValoresEmA(new PontoA(5f));
		linha.adicionarValoresEmA(new PontoA(8f));
		linha.adicionarValoresEmB(new PontoB(10f));
		linha.adicionarValoresEmB(new PontoB(12f));
		Calculo calculo = new Calculo();
		calculo.exibir(linha);
	}
}
