package com.treinamento.desconto;

public class Resultado {

	public void exibir(Veiculo veiculo) {
		valorDoDesconto(veiculo);
		informacoesDoVeiculo(veiculo);
	}

	private void informacoesDoVeiculo(Veiculo veiculo) {
		System.out.println("\nInformações do Veiculo: "  + veiculo.getNome() + " Ano " + veiculo.getAno() + " Valor: " + veiculo.getValor());
	}

	private void valorDoDesconto(Veiculo veiculo) {
		System.out.println("Valor do desconto: " + veiculo.getDesconto());
	}

}
