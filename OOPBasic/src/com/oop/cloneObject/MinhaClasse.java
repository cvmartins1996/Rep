package com.oop.cloneObject;

public class MinhaClasse implements Cloneable {
	public MinhaClasse(){
	}
	
	public Object clone() {
		Cloneable oClone = new MinhaClasse();
		return oClone;
	}
	
	public static void main(String a[]) {
		MinhaClasse mc1 = new MinhaClasse();
		MinhaClasse mc2 = (MinhaClasse)mc1.clone();
		
		System.out.println("mc1==mc2: " + (mc1==mc2));
		System.out.println("mc1.getClass()==mc2.getClass(): " + (mc1.getClass()==mc2.getClass()));
	    System.out.println("mc1.equals(mc2): " + mc1.equals(mc2));
	}
}




