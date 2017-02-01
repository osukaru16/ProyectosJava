package org.ejercicios.arrays;

public class Principal {

	public static void main(String[] args) {
		OrdenarArray ordenar = new OrdenarArray();
		System.out.println(ordenar.getOrdenaMenor());
		System.out.println(ordenar.getOrdenaMayor());
		
		/*
		String num = "12345";
		String contador= "";
		
		for(int i = num.length()-1; i>=0; i--){
			System.out.println(num.substring(i)+" "+num.length());
			contador += num.charAt(i);
		}
		System.out.println(contador);
		*/
		
		OrdenarArray ordenar2 = new OrdenarArray(30);
		System.out.println(ordenar2.getOrdenaMenor());
		System.out.println(ordenar2.getOrdenaMayor());
		
	}

}
