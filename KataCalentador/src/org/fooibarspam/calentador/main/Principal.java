package org.fooibarspam.calentador.main;

import org.foobarspam.calentador.controlador.RemoteCommandSensor;
import org.foobarspam.calentador.interfaces.Heater;
import org.foobarspam.calentador.interfaces.Thermometer;
import org.foobarspam.calentador.temperatura.AmbientTemperature;
import org.foobarspam.calentador.controlador.GasHeter;
import org.foobarspam.calentador.controlador.Ki;
import org.foobarspam.calentador.controlador.Regulator;







public class Principal {

	public static void main(String[] args) {
		
		final double minTemp = 14.0;
        final double maxTemp = 21.0;
        
        AmbientTemperature temperature = new AmbientTemperature(15);
        Heater heater = new GasHeter();
        Thermometer thermometer = new RemoteCommandSensor();
        
        Regulator regulator = new Regulator();
        
        //System.out.println( "Arrancando..." );
       // regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);
        
        Ki ki = new Ki(2);
        System.out.println( "Usando el Ki" );
        regulator.regulate(thermometer, ki, minTemp, maxTemp, temperature);

	}

}
