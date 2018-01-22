package com.treinamento;


public class Desempenho {

	public void exibir(Aluno aluno) {
		exibirPorMateria(aluno);
	}

	public void exibirPorMateria(Aluno aluno) {
		
		System.out.println("materia"+ aluno.getNome());
		
	}

}
