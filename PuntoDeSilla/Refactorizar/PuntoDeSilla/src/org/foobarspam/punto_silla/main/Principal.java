package org.foobarspam.punto_silla.main;

public class Principal {

	public static void main(String[] args) {
		
			int[][] matriz = {	{ 2, 1, 3 }, 
								{ 1, 3, 4 }, 
								{ 7, 5, 6 } };
			PuntoSilla puntosilla = new PuntoSilla(matriz);
			System.out.println(puntosilla.getMenorFila());

	}

}
