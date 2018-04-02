package design.abstractfactory;

public class ClassificacaoFactory extends AbstractFactory {

	@Override
	Classificacao toAppend(Desempenho desempenho) {
		if(desempenho.getValor() >= 8) {
			return new MuitoBom();
		}
		return new Bom();
	}


}
