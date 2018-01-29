package com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Resultado {

	List<Numero> numeros = new ArrayList<>();
	
	public void adicionarNumeros(Numero numero) {
		numeros.add(numero);
	}
	
	public String getSequenciaDeNumeros() {
		String message = ("\nValor minimo da lista: " +valorMinimo() + "\nValor máximo da lista: " +  valorMaximo() + "\nQuantidade de itens: " +  valorMaximoDeNumeros() + "\nValor medio da lista: " + verificaMedia());
		return message;
	}

	private int verificaMedia() {
		int verificaMedia = 0;
		for (Numero numero : numeros) {
			verificaMedia = verificaMedia + numero.getValor();
		}
		return (verificaMedia/numeros.size());
	}

	private int valorMaximoDeNumeros() {
		int contadorDeNumeros = 0;
		contadorDeNumeros =  numeros.size();
		return contadorDeNumeros;
	}

	private int valorMaximo() {
		int valorMaximo = 0;
		for (Numero numero : numeros) {
			if (numero.getValor() >= valorMaximo ) {
				valorMaximo = numero.getValor();
			}
		}
		return valorMaximo;
	}

	private int valorMinimo() {
		int valorMinimo = valorMaximo();
		for (Numero numero : numeros) {
			if (numero.getValor() < valorMinimo) {
				valorMinimo = numero.getValor();
			}
		}
		return valorMinimo;
	}
	
	

}
