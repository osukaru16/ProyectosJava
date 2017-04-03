package org.foobarspam.calentador.temperatura;

public class AmbientTemperature {
	private double temperatura = 0;
	public AmbientTemperature() {
		temperatura = 15.2;
	}
	public AmbientTemperature(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getTemperatura(){
		return this.temperatura;
	}
	
	public void setTemperatura(double temperatura){
		 this.temperatura = temperatura;
	}
	
	public void incrementarTemperatura(double incremento){
		this.temperatura += incremento;
	}
	
	public void disminuirTemperatura(double incremento){
		this.temperatura -= incremento;
	}
	
}
