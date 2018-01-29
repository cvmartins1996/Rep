package com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Materia {

	String materia;
	private List<Nota> notas =  new ArrayList<>(); 
	
	public Materia(String materia) {
		this.materia = materia;
	}

	public void adicionarNotas(Nota nota) {
		notas.add(nota);
	}
	
	public float somatoriaDeNotas() {
		float somatoriaDeNotas = 0;
		for (Nota nota : notas) {
			somatoriaDeNotas = somatoriaDeNotas + nota.getValor();
		}
		return (somatoriaDeNotas/notas.size());
	}

	public float getMedia() {
		return somatoriaDeNotas();
	}

	public String getMateria() {
		return materia;
	}

}
