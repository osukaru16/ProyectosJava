package org.foobarspam.examen.main;



import java.util.concurrent.ThreadLocalRandom;








public class Estacion {

	private int id;
	private String direccion;
	private int numeroAnclajes;
	//anclajes[numeroAnclajes];
	
	private Integer [] anclajes;
	
	
	
	
	
	
	public Estacion(int id, String direccion, int numeroAnclajes) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		this.anclajes = new Integer [this.numeroAnclajes];
		
		iniciaNull();
		
		
	}
	
	
	public int anclajesLibres(){
		int cuantaAnclajes = 0;
		for (int i = 0; i < this.anclajes.length; i++){
			if (this.anclajes[i] == null){
				cuantaAnclajes++;
			} 
			
		}
		return cuantaAnclajes;
	}
	
	
	
	
	
	
	
	
	public void consultarEstacion(){
		System.out.println(this.id+" "+this.direccion+" "+this.numeroAnclajes);
	}
	
	
	
	
	
	
	public void anclarBicicleta(Bicicleta bicicleta){
		int buscaSitio = 0;
		boolean encontadoSitio = false;
		while ((buscaSitio < this.anclajes.length)&&(!encontadoSitio)){
			if (this.anclajes[buscaSitio] == null){
				this.anclajes[buscaSitio] = bicicleta.getID();
				mostrarAnclaje(bicicleta, buscaSitio);
				encontadoSitio = true;
			} 
			buscaSitio++;
		}
		if (!encontadoSitio){
			System.out.println("No hay sitio");
		}
		
		
	}
	
	
	
	
	
	public void consultarAnclajes(){	
		for (int i = 0; i < this.anclajes.length; i++){
			System.out.println("Numero: "+(i+1)+" id bicicleta "+this.anclajes[i]);
		}
		
	}
	
	
	
	
	public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
		return tarjetaUsuario.getActivada();
	}
	
	
	
	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){
		Bicicleta bicicleta;
		int numeroAnclaje = generarAnclaje();
		if (tarjetaUsuario.getActivada()){
			if (anclajes[numeroAnclaje] != null){
				bicicleta = new Bicicleta(numeroAnclaje);
				mostrarBicicleta(bicicleta, numeroAnclaje);
				anclajes[numeroAnclaje] = null;
			}
			else {retirarBicicleta(tarjetaUsuario);}
		}
		
		
		
	}
	
	
	
	
	
	
	
	private int generarAnclaje(){
		return ThreadLocalRandom.current().nextInt(this.numeroAnclajes-1);
	}
	
	
	
	
	
	
	
	
	
	private void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclaje){
		mostrarAnclaje(bicicleta, numeroAnclaje);
	}
	
	
	
	
	
	
	
	
	
	
	private void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje){
		System.out.println(bicicleta.getID()+" "+numeroAnclaje+1);
	}
	
	
	
	
	
	
	
	
	private void iniciaNull(){
		for (int i = 0; i < this.anclajes.length; i++){
			this.anclajes[i] = null; 
		}
	}
	
	
	
	
	
	

}
