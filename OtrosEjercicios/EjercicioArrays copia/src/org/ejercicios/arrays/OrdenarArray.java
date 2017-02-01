package org.ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class OrdenarArray {

	private Integer [] lista; 
	
	public OrdenarArray() {
		Integer [] lista = {3,5,4,2,1};
		this.lista = lista;
	}
	
	
	public OrdenarArray(int medida) {
		Integer [] lista = new Integer[medida];
		this.lista = lista;
		vectorAleatorio();
	}
	
	
	public Integer getOrdenaMenor(){
		String ordena = "0";
		Arrays.sort(this.lista);
		for (Integer numero : this.lista){
			ordena += numero.toString();
		}
		
		
		return Integer.parseInt(ordena);
	}
	
	
	public Integer getOrdenaMayor(){
		String lista = getOrdenaMenor().toString();
		String ordena = "0";
		for(int i = lista.length()-1; i>=0; i--){
			
			ordena += lista.charAt(i);
		}
		return Integer.parseInt(ordena);
	}
	
	
	
	
	
	
	private void vectorAleatorio(){
		int maximoAleatorio= 20;
		Random aleatorio = new Random();
		for(int i=0; i< this.lista.length; i++){
			this.lista[i] = aleatorio.nextInt(maximoAleatorio)+1;
		}
	}
	
	
	
	
	
	
	

}
