package com.cadastro;

public class Visualizacao {

	public void cadastrosEfetuados(Pessoa pessoa) {
		informacoesNecessarias(pessoa);
		informacoesComplementares(pessoa);
		informacoesDeCredito(pessoa);
		compraEfetuada(pessoa);
	}

	private void compraEfetuada(Pessoa pessoa) {
		System.out.println("\nSaldo após efetuar a compra: " + pessoa.verificaCreditos());
	}

	private void informacoesDeCredito(Pessoa pessoa) {
		System.out.println("\nCrédito:" + pessoa.getInformacoesDeCredito());
	}

	private void informacoesNecessarias(Pessoa pessoa) {
		System.out.println("\nDados Pessoais: " + pessoa.getNome() +  " " + pessoa.getIdade() + "\nFinanceiro: " + pessoa.getScore() );
	}

	private void informacoesComplementares(Pessoa pessoa) {
		System.out.println("\nInformações Complementares: " + pessoa.demaisInformacoes());
	}

}
