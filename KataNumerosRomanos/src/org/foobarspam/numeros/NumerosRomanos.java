package org.foobarspam.numeros;

public enum NumerosRomanos {
	I(1),
	V(5),
	X(10),
	L(50),
	C(100),
	D(500),
	M(1000);
	
	
	private int valor;
	
	private NumerosRomanos(int valor){
		this.valor = valor;
	}
	
	
	
	
	public int getValor(){
		return this.valor;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
