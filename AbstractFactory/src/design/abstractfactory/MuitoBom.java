package design.abstractfactory;

public class MuitoBom implements Classificacao {

	@Override
	public void resultado() {
		System.out.println("Muito Bom");
	}

	@Override
	public String verifica(Desempenho desempenho) {
		return "";
	}

	public String toAppend() {
		return "Muito Bom";
	}

}
