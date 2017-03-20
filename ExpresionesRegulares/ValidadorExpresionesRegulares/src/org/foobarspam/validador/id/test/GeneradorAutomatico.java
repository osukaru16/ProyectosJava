package org.foobarspam.validador.id.test;

import java.util.concurrent.ThreadLocalRandom;

public class GeneradorAutomatico {
	
	
	
	
	public static String genararDNIIncorrectos(){
		String dni ="";
		Integer numero = 0;
		String letras ="IOUÑ";
		
		
		for (int i = 0; i<8; i++){
			numero = ThreadLocalRandom.current().nextInt(10);
			dni += numero.toString();
		}
		
		
		numero = ThreadLocalRandom.current().nextInt(4);
		dni += letras.charAt(numero);
		
		return dni;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
