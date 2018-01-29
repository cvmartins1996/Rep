package com.travel;
public class App {
	public static void main(String a[]) {
		Carro corolla = new Carro("corolla");
		corolla.adicionarDestino(new Destino("Pasadena", 500f));
		corolla.adicionarDestino(new Destino("Pinheiros", 400f));
		corolla.adicionarConsumo(new Custo(8.2f));
		Desempenho desempenho = new Desempenho();
		desempenho.exibir(corolla);
	}
}
