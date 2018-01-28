package com.cadastro;

public class Visualizacao {

	public void cadastrosEfetuados(Pessoa pessoa) {
		informacoesNecessarias(pessoa);
		complementares(pessoa);
		opcoesDeCredito(pessoa);
		compraEfetuada(pessoa);
	}

	private void compraEfetuada(Pessoa pessoa) {
		System.out.println("\nSaldo após efetuar a compra: " + pessoa.verificaCreditos());
	}

	private void opcoesDeCredito(Pessoa pessoa) {
		System.out.println("\nCrédito:" + pessoa.getInformacoesDeCredito());
	}

	private void informacoesNecessarias(Pessoa pessoa) {
		System.out.println("\nDados Pessoais: " + pessoa.getNome() +  " " + pessoa.getIdade() + "\nFinanceiro: " + pessoa.getScore() );
	}

	private void complementares(Pessoa pessoa) {
		System.out.println("\nInformações Complementares: " + pessoa.demaisInformacoes());
	}

}
