package design.abstractfactory;

public class Bom implements Classificacao {

	@Override
	public void resultado() {
		System.out.println("Bom");
	}

	@Override
	public String verifica(Desempenho desempenho) {
		return "";
	}

	public String toAppend() {
		return "Bom";
	}

}
