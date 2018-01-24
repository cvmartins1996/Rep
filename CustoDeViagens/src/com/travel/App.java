package com.travel;
public class App {
	public static void main(String[] a) {
		Carro corolla = new Carro("corolla");
		corolla.adicionarDestino(new Destino("Pasadena", 500f));
		corolla.adicionarConsumo(new Consumo(8.2f));
		Desempenho desempenho = new Desempenho();
		desempenho.exibir(corolla);
		
	}
}
