package org.foobarspam.calentador.controlador;

import org.foobarspam.calentador.enums.RegulatorDisplayCodes;
import org.foobarspam.calentador.interfaces.*;
import org.foobarspam.calentador.temperatura.AmbientTemperature;

public class Regulator {

	public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, AmbientTemperature temperature){
		RegulatorDisplayCodes code;
		double controlador=0; 
		while((t.read(temperature) < maxTemp)&&(t.read(temperature) != controlador)){
			controlador = t.read(temperature);
			code = RegulatorDisplayCodes.HEATING;				
			h.engage(temperature);
			message(code, temperature);
			
		}
		while ((t.read(temperature) > minTemp)&&(t.read(temperature) != controlador)){
			controlador = t.read(temperature);
			code = RegulatorDisplayCodes.WAITING;
			h.disengage(temperature);			
			message(code, temperature);
		}
	}

	private void message(RegulatorDisplayCodes code, AmbientTemperature temperature){
		
		switch(code){
			case HEATING:
				System.out.println("Calentando "+temperature.getTemperatura());
				break;
			case WAITING:
				System.out.println("En espera "+temperature.getTemperatura());
				break;
			default:
				System.out.println("Error 3 luces rojas");
				break;
		}

	}
}
