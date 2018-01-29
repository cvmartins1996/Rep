package com.treinamento;

import java.util.List;

public class Desempenho {

	public void exibir(Aluno aluno) {
		exibirPorMateria(aluno);
		exibirGeral(aluno);
	}

	private void exibirGeral(Aluno aluno) {
		System.out.println("Nome da peste: " + aluno.getNome() + " Grade Escolar, média geral: " + aluno.getGrade().getMedia());
	}

	private void exibirPorMateria(Aluno aluno) {
		List<Materia> materias = aluno.getGrade().getMaterias();
		System.out.println("Nome da peste: " + aluno.getNome());
		for (Materia materia : materias) {
			System.out.println("Materia cursada: " + materia.getMateria() + " Média atribuida: " +  materia.getMedia());
		}
	}

}
