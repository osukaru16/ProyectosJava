package org.ejercicios.arrays;

import java.util.Arrays;
import java.util.Random;

public class OrdenarArray {

	private Integer [] lista; 
	private String ordenado="";
	
	public OrdenarArray() {
		Integer [] lista = {3,5,4,2,1};
		this.lista = lista;
	}
	
	
	public OrdenarArray(int medida) {
		Integer [] lista = new Integer[medida];
		this.lista = lista;
		vectorAleatorio();
	}
	
	
	public String getOrdenaMenor(){
		String ordena = "";
		Arrays.sort(this.lista);
		for (Integer numero : this.lista){
			ordena += numero.toString();
			//ordena += "/";
		}
		this.ordenado = ordena;
		
		return this.ordenado;
	}
	
	
	
	
	
	
	
	public String getOrdenaMayor(){
		String lista = getOrdenaMenor().toString();
		String ordena2 = "";
		for(int i = lista.length()-1; i>=0; i--){
			
			ordena2 += lista.charAt(i);
			this.ordenado = ordena2;
		}
		return this.ordenado;
	}
	
	
	
	
	
	
	private void vectorAleatorio(){
		int maximoAleatorio= 20;
		Random aleatorio = new Random();
		for(int i=0; i< this.lista.length; i++){
			this.lista[i] = aleatorio.nextInt(maximoAleatorio)+1;
		}
	}
	
	
	
	
	
	
	

}
