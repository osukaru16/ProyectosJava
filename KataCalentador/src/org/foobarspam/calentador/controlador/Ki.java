package org.foobarspam.calentador.controlador;

import org.foobarspam.calentador.interfaces.Heater;
import org.foobarspam.calentador.temperatura.AmbientTemperature;

public class Ki implements Heater{
	private int myLevel = 0;

	public Ki(int myLevel) {
		this.myLevel = myLevel;
	}
	
	public void setMyLevel(int myLevel){
		this.myLevel = myLevel;
	}
	
	public int getMyLevel(){
		return this.myLevel;
	}
	
	

	@Override
	public void engage(AmbientTemperature temperature) {
		if(getMyLevel()>1){
			temperature.incrementarTemperatura(getMyLevel()*getMyLevel());
		}
		else{
			System.out.println("No tienes nivel suficiente como para hacer efecto");
		}
	}

	@Override
	public void disengage(AmbientTemperature temperature) {
		
		
		temperature.disminuirTemperatura(1);
		
	}

}
