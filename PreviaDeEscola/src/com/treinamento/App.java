package com.treinamento;

public class App {
	

	public static void main(String[] a) {
		Aluno aluno = new Aluno("Martins");
		Desempenho desempenho = new Desempenho();
		Materia ingles = new Materia("ingles");
		ingles.adicionarNotas(new Nota(8.2f));
		Grade grade = new Grade();
		grade.adicionarMaterias(ingles);
		aluno.setGrade(grade);
		desempenho.exibir(aluno);
	}
}
