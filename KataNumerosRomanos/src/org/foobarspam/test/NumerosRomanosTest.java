package org.foobarspam.test;

import static org.junit.Assert.*;

import org.foobarspam.calculador.CalculaNumeroRomano;
import org.junit.Test;

public class NumerosRomanosTest {

	@Test
	public void test1() {
		
		CalculaNumeroRomano numeroRomano = new CalculaNumeroRomano("I");
		
		assertEquals(1, numeroRomano.getValorDecimal());
		
		
		
		
		
	}
	
	
	
	
	

	@Test
	public void test2y3() {
		
		CalculaNumeroRomano numeroRomano = new CalculaNumeroRomano("II");
		
		assertEquals(2, numeroRomano.getValorDecimal());
		
		numeroRomano.setNumeroRomano("III");
		assertEquals(3, numeroRomano.getValorDecimal());
		
		
	}
	
	
	
	@Test
	public void test4() {
		
		CalculaNumeroRomano numeroRomano = new CalculaNumeroRomano("IV");
		
		assertEquals(4, numeroRomano.getValorDecimal());

		
		
	}
	
	
	
	
	@Test
	public void testMil() {
		
		CalculaNumeroRomano numeroRomano = new CalculaNumeroRomano("M");
		
		assertEquals(1000, numeroRomano.getValorDecimal());

		
		
	}
	
	
	
	
	@Test
	public void test1888() {
		
		CalculaNumeroRomano numeroRomano = new CalculaNumeroRomano("MDCCCLXXXVIII");
		
		assertEquals(1888, numeroRomano.getValorDecimal());

		
		
	}
	
	
	@Test
	public void test999() {
		
		CalculaNumeroRomano numeroRomano = new CalculaNumeroRomano("DCDLXLIX");
		
		assertEquals(999, numeroRomano.getValorDecimal());

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
