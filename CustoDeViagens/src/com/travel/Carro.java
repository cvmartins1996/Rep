package com.travel;

import java.util.ArrayList;
import java.util.List;

public class Carro {

	String nome;
	private List<Destino> destinos = new ArrayList<>();
	Consumo consumo;
	
	public Carro(String nome) {
		this.nome = nome;
	}
	
	public void adicionarDestino(Destino destino) {
		destinos.add(destino);
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Destino> getDestino() {
		return destinos;
	}
	
	public void adicionarConsumo(Consumo consumo) {
		this.consumo = consumo;
	}
	

}
