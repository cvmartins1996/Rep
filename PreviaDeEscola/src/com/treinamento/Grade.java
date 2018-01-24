package com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Grade {
	List<Materia> materias = new ArrayList<>();
	
	public void adicionarMaterias(Materia materia) {
		materias.add(materia);
	}
	
	public List<Materia> getMaterias(){
		return materias;
	}
	
	public float somatoriaTotal() {
		float somatoriaTotal = 0;
		for (Materia materia : materias) {
			somatoriaTotal =  somatoriaTotal + materia.getMedia();
		}
		return somatoriaTotal;
	}

	public float getMedia() {
		return somatoriaTotal();
	}

}
