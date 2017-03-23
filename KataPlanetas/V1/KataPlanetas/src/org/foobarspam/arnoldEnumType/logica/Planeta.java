package org.foobarspam.arnoldEnumType.logica;

public enum Planeta {
	MERCURY (3.303e+23, 2.4397e6),     
	VENUS   (4.869e+24, 6.0518e6),     
	EARTH   (5.976e+24, 6.37814e6),     
	MARS    (6.421e+23, 3.3972e6),     
	JUPITER (1.9e+27,   7.1492e7),     
	SATURN  (5.688e+26, 6.0268e7),     
	URANUS  (8.686e+25, 2.5559e7),     
	NEPTUNE (1.024e+26, 2.4746e7);  
	
	private double radio;
	private double masa;
	private final double G = 6.67300E-11;
	
	
	
	//constructor
	private Planeta (double masa, double radio) {
		this.masa = masa;
		this.radio = radio;
	}

	
	
	
	
	
	public double getMasa() {
		return masa;
	}

	
	
	
	
	
	public double getRadio() {
		return radio;
	}

	
	
	
	
	
	
	
	//Peso_en_Superficie = tu_Masa * Gravedad_en_superficie
	
	public double pesoSuperficie(double pesoHumano) {
		double peso = 0;
		peso = this.calculoMasa(pesoHumano) * this.superficieGravedad();
		
		
		return peso;
	}

	
	
	
	
	
	
	public static Object getPlanetasTerrestres() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	public static Object getGigantesGaseosos() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Gravedad_en_superficie = G * Masa_del_planeta / Radio_del_planeta_al_cuadrado
	
	private double superficieGravedad(){
		double superficie = 0;
		double radioCuadrado = this.getRadio() * this.getRadio();
		superficie = G * this.getMasa() / radioCuadrado;
		return superficie;
	}
	
	
	
	
	
	
	
	//tu_masa = tu_peso_en_la_Tierra / gravedad_superficial_tierra;
	
	private double calculoMasa (double pesoHumano){
		double masa = 0;
		masa = pesoHumano / Planeta.EARTH.superficieGravedad();
		return masa;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
