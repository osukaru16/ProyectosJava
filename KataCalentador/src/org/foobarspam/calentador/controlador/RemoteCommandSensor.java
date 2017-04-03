package org.foobarspam.calentador.controlador;

import org.foobarspam.calentador.interfaces.Thermometer;
import org.foobarspam.calentador.temperatura.AmbientTemperature;

public class RemoteCommandSensor implements Thermometer {

	@Override
	public double read(AmbientTemperature temperature) {
		return temperature.getTemperatura();
	}


}
