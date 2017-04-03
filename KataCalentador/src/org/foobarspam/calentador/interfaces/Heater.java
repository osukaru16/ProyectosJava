package org.foobarspam.calentador.interfaces;

import org.foobarspam.calentador.temperatura.AmbientTemperature;

public interface Heater {

	public void engage(AmbientTemperature temperature);
	
	public void disengage(AmbientTemperature temperature);
	
}

