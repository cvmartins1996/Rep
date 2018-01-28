package com.cadastro;

public class Visualizacao {

	public void cadastrosEfetuados(Pessoa pessoa) {
		informacoesNecessarias(pessoa);
		complementares(pessoa);
	}

	private void informacoesNecessarias(Pessoa pessoa) {
		System.out.println("\nDados Pessoais: " + pessoa.getNome() +  " " + pessoa.getIdade() + "\nFinanceiro: " + pessoa.getScore() );
	}

	private void complementares(Pessoa pessoa) {
		System.out.println("\nInforma��es Complementares: " + pessoa.demaisInformacoes());
	}

}
