package com.cadastro;
public class App {
	

	public static void main(String a[]) {
		Visualizacao visualizacao = new Visualizacao();
		Pessoa pessoa = new Pessoa("Martins", 21);
		pessoa.adicionarOcupacao(new Job("Programador"));
		pessoa.adicionarEmail(new Email("cv@cv.com"));
		Financeiro financeiro = new Financeiro();
		financeiro.setScore(500);
		pessoa.setFinanceiro(financeiro);
		Credito credito = new Credito(250f);
		credito.setJuros(420f);
		pessoa.setCredito(credito);
		visualizacao.cadastrosEfetuados(pessoa);
		
	}
}
