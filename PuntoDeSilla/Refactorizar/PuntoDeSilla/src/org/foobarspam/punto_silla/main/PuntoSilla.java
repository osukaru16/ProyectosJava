package org.foobarspam.punto_silla.main;

public class PuntoSilla {
	private int [][] matriz = new int [3][3];
	private String filaMenor = "";
	
	
	//private int contadorMatriz = 0;

	public PuntoSilla(int [][] matriz) {
		this.matriz = matriz;
		
	}
	
	
	
	
	
	
	
	//gets
	
	
	public int getRecoreMatriz(){
		
		return recoreMatriz();
	}
	
	
	public int[][] getMatriz(){
		return this.matriz;
	}
	
	
	
	public int getMenorFila() {
		
		return 145;   //AQUI MODIFICAR
	}
	
	
	
	
	
	// Metodos privados
	
	private int recoreMatriz(){
		int contador = 0;
		
		//contador = 9;
		
		for (int filas = 0; filas < matriz.length; filas++) {
			  for (int columnas=0; columnas < matriz[filas].length; columnas++) {
				  
				  
				  //matriz[fila][columna]
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
			    contador++;
			  }
			}
		
		//this.contadorMatriz = contador;
		return contador;
	}
	
	
	
	
	
	
	
	
	
	
	

}
