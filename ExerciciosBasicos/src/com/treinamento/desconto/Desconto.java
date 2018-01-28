package com.treinamento.desconto;

public class Desconto {
	public float verificarDesconto(Veiculo veiculo) {
		float desconto = 0;
		if(veiculo.getAno() > 2000) {
			desconto = 0.12f;
			return (desconto * veiculo.getValor()); 
		}
		desconto = 0.07f;
		return (desconto * veiculo.getValor());
	}
	
	
}
