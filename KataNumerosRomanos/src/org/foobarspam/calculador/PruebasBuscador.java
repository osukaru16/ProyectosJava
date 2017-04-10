package org.foobarspam.calculador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PruebasBuscador {
	private String numeroRomano = "MDCCCLXXXVIII";
	private String patron = "C{3}";

	public PruebasBuscador() {
		numeroRomano = "MDCCCLXXXVIII";
		patron = "C{3}";
	}

	public static void main(String[] args) {
		  
		 
		 PruebasBuscador numRomano = new PruebasBuscador();
		
		
		//System.out.println(numRomano.comprova2());
		
		//System.out.println(numRomano.comprova3());
		 
		 
		 
		 
		 
		System.out.println(numRomano.getEncontradoStart()+" "+numRomano.getEncontradoEnd());

		System.out.println(numRomano.cojerEncontrado()+"\nNevo: "+numRomano.quitarEncontrado());
		
		
		//private String patronBusqueda ="(C[DM])|(X[LC])|(I[VX])"; 
		
		BuscaPatrones buscador = new BuscaPatrones("(C[DM])|(X[LC])|(I[VX])","IV");
		
		
		System.out.println("Test_________");

		System.out.println(buscador.getTexto());
		
		System.out.println(buscador.getEncontrado());
		
		System.out.println(buscador.getPrincipio());
		
		System.out.println(buscador.getFinal());
		
		System.out.println(buscador.getValorEncontrado());

		//System.out.println(buscador.getNuevoTexto());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 

	}
	
	public boolean comprova2() {
		return this.comprovador(this.patron, this.numeroRomano);
	}
	public boolean comprova3() {
		return this.comprovador2(this.patron, this.numeroRomano);
	}
	
	
	
	
	public int getEncontradoStart() {
		return this.encontradoStart(this.patron, this.numeroRomano);
	}
	
	
	public int getEncontradoEnd() {
		return this.encontradoEnd(this.patron, this.numeroRomano);
	}
	
	
	
	
	
	
	
	
	
	public String getNumeroRomano(){
		return this.numeroRomano;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean comprovador(String regex, String source) {
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(source);
		
		return m.find();
		//return m.start()==2;
	}
	
	

	public boolean comprovador2(String regex, String source) {

		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(source);




		return m.matches();
	}


	
	
	
	public int encontradoStart(String regex, String source) {

		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(source);


		if(m.find()){return m.start();}
		else{return 0;}
		
	}
	
	
	public int encontradoEnd(String regex, String source) {

		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(source);


		if(m.find()){return m.end();}
		else{return 0;}
		
	}
	
	public String cojerEncontrado(){
		String nuevoNumero = "";
		
		nuevoNumero = this.numeroRomano.substring(this.getEncontradoStart(), this.getEncontradoEnd());
		
		return nuevoNumero;
		
	}
	
	
	public String quitarEncontrado(){
		String nuevoNumero = "";
		
		//nuevoNumero = this.numeroRomano.replaceAll(cojerEncontrado(), "");
		
		nuevoNumero = this.numeroRomano.replaceFirst(this.cojerEncontrado(), "");
		
		return nuevoNumero;
		
	}
	
	
	
	
	
	
	
	
	
	

}
