package org.foobarspam.calentador.controlador;

import org.foobarspam.calentador.interfaces.Heater;
import org.foobarspam.calentador.temperatura.AmbientTemperature;

public class GasHeter implements Heater{

	@Override
	public void engage(AmbientTemperature temperature) {
		
		temperature.incrementarTemperatura(1);
		
	}

	@Override
	public void disengage(AmbientTemperature temperature) {
		
		temperature.disminuirTemperatura(1);
		
	}

	
}
