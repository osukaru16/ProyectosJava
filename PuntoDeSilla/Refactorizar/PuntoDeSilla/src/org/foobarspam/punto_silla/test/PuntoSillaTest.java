package org.foobarspam.punto_silla.test;

import org.foobarspam.punto_silla.main.PuntoSilla;



import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;




public class PuntoSillaTest {

	@Test
	public void test_getMatriz() {
		int[][] matriz = {	{ 3, 2, 1 }, 
							{ 4, 8, 9 }, 
							{ 5, 6, 7 } };
		
		PuntoSilla puntosilla = new PuntoSilla(matriz);
		
		
		assertEquals(9, puntosilla.getRecoreMatriz());
		
		
	}
	
	
	
	@Test
	public void testMinFila() {
		int[][] matriz = {	{ 3, 2, 1 }, 
							{ 4, 8, 9 }, 
							{ 5, 6, 7 } };
		
		PuntoSilla puntosilla = new PuntoSilla(matriz);
		
		assertEquals(145, puntosilla.getMenorFila());
		
	}
	
	/*
	@Test
	public void test_R5() {
	int[][] matriz = {	{ 3, 2, 1 }, 
							{ 4, 8, 9 }, 
							{ 5, 6, 7 } };


		PuntoSilla puntosilla = new PuntoSilla(matriz);
		
		assertEquals(5, puntosilla.getPuntoSilla());
		
	}
	*/

}
