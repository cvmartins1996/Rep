package com.treinamento.desconto;

public class DescontoEmCarros {
	public static void main(String a[]) {
		Veiculo civic = new Veiculo("civic", 24000f, 2007);
		Desconto desconto = new Desconto();
		desconto.verificarDesconto(civic);
		civic.setDesconto(desconto);
		Resultado resultado = new Resultado();
		resultado.exibir(civic);
	}
	
}
