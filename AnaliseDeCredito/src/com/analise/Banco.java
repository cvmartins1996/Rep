package com.analise;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Agencia> agencias = new ArrayList<>();
	private float creditoInicial;

	public void cadastrarAgencia(Agencia agencia) {
		agencias.add(agencia);
	}
	
	public float disponibilizarCreditoInicial() {
		creditoInicial = 0;
		for (Agencia agencia : agencias) {
			if (agencia.getPessoa().getIdade() > 20)
					creditoInicial = 400f;
				else {
					creditoInicial = 0f;
				}
		}
		return creditoInicial;
	}
	
	
	
	public String dadosDaAgencia() {
		String msg = null;
		for (Agencia agencia : agencias) {
			msg = "Dados do Usu�rio: " + agencia.getPessoa().getNome() + "\n" + agencia.getPessoa().getRg() + "\n" + agencia.getPessoa().getCpf() + "\n"
					+ "Cr�dito Inicial Disponibilizado: " + disponibilizarCreditoInicial()  + "\n Referente a Agencia: "  + agencia.getNome() + " e n�mero: " + agencia.getNumero();
		}
		return msg;
		
	}

}
