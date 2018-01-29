package com.treinamento;
public class App {
	public static void main(String a[]) {
		Desempenho desempenho = new Desempenho();
		Resultado resultado = new Resultado();
		resultado.adicionarNumeros(new Numero(8));
		resultado.adicionarNumeros(new Numero(9));
		resultado.adicionarNumeros(new Numero(18));
		resultado.adicionarNumeros(new Numero(15));
		desempenho.exibir(resultado);
	}
}
