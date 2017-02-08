package org.foobarspam.examen.main;

public class TarjetaUsuario {
	private String id;
	private boolean activada;

	public TarjetaUsuario(String id, boolean activada) {
		this.id = id;
		this.activada = activada;
		
	}
	
	
	
	public boolean getActivada(){
		return this.activada;
	}
	
	
	public String getID(){
		return this.id;
	}
	
	
	
	

}
