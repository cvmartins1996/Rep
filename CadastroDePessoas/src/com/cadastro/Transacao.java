package com.cadastro;

public class Transacao {

	private Compra compra;

	public void efeturarTransacao(Compra compra) {
		this.compra = compra;
	}
	
	public float transacaoCredito() {
		
		return compra.getValor();
	}

}
