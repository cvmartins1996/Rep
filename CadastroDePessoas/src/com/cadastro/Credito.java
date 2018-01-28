package com.cadastro;

public class Credito {

	private float juros;
	private float valor;

	public Credito(float valor) {
		this.valor = valor;
	}

	public void setJuros(float juros) {
		this.juros = juros;
	}

	public float getCredito() {
		return valor;
	}

	public float getJuros() {
		return juros;
	}

}
