package com.analise;
public class App {
	public static void main(String[] args) {
		Analise analise = new Analise();
		Score score = new Score();
		Pessoa pessoa = new Pessoa("Martins", 21);
		pessoa.adicionarOcupacao(new Job("Programador"));
		pessoa.adicionarEscolaridade(new Escolaridade("Superior Completo"));
		pessoa.adicionarRenda(new Renda(800f));
		pessoa.adicionarPatrimonio(new Patrimonio(0f));
		score.analisarPessoa(pessoa);
				
		pessoa = new Pessoa("Martins", 21, 444444445, 584564564);
		Banco banco = new Banco();
		Agencia agencia = new Agencia("Sao Vicente", 444);
		banco.cadastrarAgencia(agencia);
		agencia.cadastrarPessoa(pessoa);
		Extrato extrato = new Extrato();
		extrato.exibir(banco);
		Financeiro finasa = new Financeiro();
		finasa.emitirNotas(banco);
		score.verificarNotasEmitidasPelaFinasa(finasa);
		
		analise.exibir(score);
		
		
		Pessoa outra = new Pessoa("Neuza", 32);
		outra = new Pessoa("Neuza", 32, 123524151, 446546456);
		outra.adicionarEscolaridade(new Escolaridade("Ensino Medio Completo"));
		outra.adicionarOcupacao(new Job("Costureira"));
		outra.adicionarRenda(new Renda(2100f));
		outra.adicionarPatrimonio(new Patrimonio(120000f));
		score.analisarPessoa(outra);
		Banco inter = new Banco();
		Agencia saoBento =  new Agencia("Sao Bento", 456);
		inter.cadastrarAgencia(saoBento);
		saoBento.cadastrarPessoa(outra);
		extrato.exibir(inter);
		finasa.emitirNotas(inter);
		score.verificarNotasEmitidasPelaFinasa(finasa);
		
		analise.exibir(score);
	}
}
