package design.abstractfactory;

public enum Verificacao implements Classificacao {
	
	MUITO_BOM {
		@Override
		public String verifica(Desempenho desempenho) {
			System.out.println("Desempenho: " + desempenho.getValor());
			return new MuitoBom().toAppend();
		}
	},
	BOM {
		@Override
		public String verifica(Desempenho desempenho) {
			System.out.println("Desempenho: " + desempenho.getValor());
			return new Bom().toAppend();
		}
	}
	;

	@Override
	public void resultado() {	
	}


}
