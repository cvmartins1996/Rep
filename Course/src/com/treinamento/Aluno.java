package com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private List<Nota> notas = new ArrayList<>();
	private Materia materia;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setMaterias(Materia materia) {
		this.materia = materia;
	}

	public float getMediaPorMateria() {
		return materia.getMedia();
	}
 
}
