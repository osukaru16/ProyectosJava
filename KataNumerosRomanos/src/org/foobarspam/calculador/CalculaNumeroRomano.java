package org.foobarspam.calculador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.foobarspam.numeros.NumerosRomanos;

public class CalculaNumeroRomano {
	
	private String numeroRomano = "";
	//private int contadorGeneral=0;
	private String patronBusqueda ="(C[DM])|(X[LC])|(I[VX])"; 

	public CalculaNumeroRomano(String numeroRomano) {
		
		this.numeroRomano = numeroRomano;
		
	}
	
	
	
	
	
	
	public String getNumeroRomano(){
		return this.numeroRomano;
	}
	
	
	public void setNumeroRomano(String numeroRomano){
		this.numeroRomano = numeroRomano;
	}
	
	
	
	public int getValorDecimal() {
		
		return this.pasaDecimal();
	}
	
	
	
	
	
	
	
	
	
	
	
	private int pasaDecimal(){
		String numeroRomano = this.numeroRomano;
		
		int total=0;
		
		
		
		while(comprovador()){
			
			
				total+=conversor(this.cojerEncontrado(),1)-conversor(this.cojerEncontrado(),0);
				
				numeroRomano= this.quitarEncontrado();
				numeroRomano.trim();
				
		}
		
		
		for(int i=0; i<numeroRomano.length(); i++ ){
			total+=conversor(numeroRomano,i);
		}
		
		
		return total;
		
	}
	
	
	
	
		private int conversor(String numeroRomano, int posicion){
			NumerosRomanos numero;
			Character letra;

			letra = numeroRomano.charAt(posicion);
			numero = NumerosRomanos.valueOf(letra.toString());


			return numero.getValor();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	private int encontradoStart() {

		if(this.comprovador()){
			return this.coincidencia().start();
		}
		else{
			return 0;
		}
		
	}*/
		
		
		
		public int encontradoStart() {

			Pattern p = Pattern.compile(this.patronBusqueda);

			Matcher m = p.matcher(this.numeroRomano);


			if(m.find()){return m.start();}
			else{return 0;}
			
		}
		
		
		
		
		public int encontradoEnd() {

			Pattern p = Pattern.compile(this.patronBusqueda);

			Matcher m = p.matcher(this.numeroRomano);


			if(m.find()){return m.end();}
			else{return 0;}
			
		}
		
		
		
		
		
	/*
	
	private int encontradoEnd() {

		if(this.comprovador()){
			return this.coincidencia().end();
		}
		else{return 0;}
		
	}
	
	
	
	
	private boolean comprovador() {
		return this.coincidencia().find();
	}
	
	
	*/
	
		
		
		public boolean comprovador() {

			Pattern p = Pattern.compile(this.patronBusqueda);

			Matcher m = p.matcher(this.numeroRomano);

			return m.find();

		}	
		
		
		
		
		
		
	
	
	private Pattern patron(){
		return Pattern.compile(this.patronBusqueda);
	}
	
	
	private Matcher coincidencia(){
		return this.patron().matcher(this.numeroRomano);
	}
	
	
	
	
	
	
	
	
	
	private String cojerEncontrado(){
		String nuevoNumero = "";
		
		nuevoNumero = this.numeroRomano.substring(this.encontradoStart(), this.encontradoEnd());
		
		return nuevoNumero;
		
	}
	
	
	private String quitarEncontrado(){
		String nuevoNumero = "";
		
		nuevoNumero = this.numeroRomano.replaceFirst(this.cojerEncontrado(), "");
		
		return nuevoNumero;
		
	}






	
	
	
	
	
	

}
