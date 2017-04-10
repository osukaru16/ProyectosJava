package org.foobarspam.calculador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.foobarspam.numeros.NumerosRomanos;

public class CalculaNumeroRomano {
	
	private String numeroRomano = "";
	//private int contadorGeneral=0;
	private String patronBusqueda ="(C[DM])|(X[LC])|(I[VX])"; 
	
	
	private BuscaPatrones buscador= null;

	public CalculaNumeroRomano(String numeroRomano) {
		
		this.numeroRomano = numeroRomano;
		
		this.buscador = new BuscaPatrones(this.patronBusqueda, this.numeroRomano);
		
		
	}
	
	
	
	
	
	
	public String getNumeroRomano(){
		return this.numeroRomano;
	}
	
	
	public void setNumeroRomano(String numeroRomano){
		this.numeroRomano = numeroRomano;
		this.buscador.setTexto(this.numeroRomano);
	}
	
	
	
	public int getValorDecimal() {
		
		return this.pasaDecimal();
	}
	
	
	
	
	
	
	
	
	
	

	private int pasaDecimal(){
		String numeroRomano = this.numeroRomano;
		String patronEncontrado = null;

		int total=0;

		
		//System.out.println(this.buscador.getEncontrado());

		while(this.buscador.getEncontrado()){
			patronEncontrado = this.buscador.getValorEncontrado();


			total+= conversor(patronEncontrado,1) - conversor(patronEncontrado,0);

			numeroRomano= this.buscador.getNuevoTexto().trim();
			this.buscador.setTexto(numeroRomano);
			
			
			

		}
		//System.out.println(this.buscador.getEncontrado());


		
		total+=conversor(numeroRomano);
		


		return total;

	}
	
	


	private int conversor(String numeroRomano){
		int sumador =0;
		NumerosRomanos numero;
		Character letra;


		for(int i=0; i<numeroRomano.length(); i++ ){
			letra = numeroRomano.charAt(i);
			numero = NumerosRomanos.valueOf(letra.toString());
			sumador+=numero.getValor();
		}


		return sumador;
	}


	
	
	
	
	private int conversor(String numeroRomano, int posicion){
		NumerosRomanos numero;
		Character letra;

		letra = numeroRomano.charAt(posicion);
		numero = NumerosRomanos.valueOf(letra.toString());
		
		return numero.getValor();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			

		
		
		
		
		
	

	
	
	
	
	
	
	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
