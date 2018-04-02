package design.abstractfactory;
public class App {
	public static void main(String[] args) {
		
		Classificacao classificacao  = new ClassificacaoFactory().toAppend(new Desempenho(8.5f));
		classificacao.resultado();
		
		
		
	}
}
