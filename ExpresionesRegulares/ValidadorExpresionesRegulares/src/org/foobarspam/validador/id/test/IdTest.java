package org.foobarspam.validador.id.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.validador_id.*;

import org.junit.Test;


public class IdTest {
	
	
	@Test
	public void dniTest() {
		
		ValidadorId dni = new ValidadorId("12345678R");
		assertEquals(true, dni.getIdValido());
		
		
	}
	
	
	
	
	@Test
	public void dniTestFalse() {
		
		ValidadorId dni = new ValidadorId("1234568R");
		assertEquals(false, dni.getIdValido());
		
		dni = new ValidadorId("1234568Ñ");
		assertEquals(false, dni.getIdValido());
		
		
	}
	
	@Test
	public void dniTestFalse2() {
		
		ValidadorId dni = new ValidadorId("12345678R3e63446");
		assertEquals(false, dni.getIdValido());
		
		
	}
	@Test
	public void nieTest() {
		
		ValidadorId nie = new ValidadorId("X1234567R");
		assertEquals(true, nie.getIdValido());
		
		
	}
	
	
	
	
	
	@Test
	public void nieTestFalse() {
		
		ValidadorId nie = new ValidadorId("A1234568R");
		assertEquals(false, nie.getIdValido());
		
		
	}
	
	@Test
	public void nieTestFalse2() {
		
		ValidadorId nie = new ValidadorId("O12345678R3e63446Ñ");
		assertEquals(false, nie.getIdValido());
		
		
	}
	
	
	
	
	
	@Test
	public void arrayTest() {
		
		ValidadorId id = new ValidadorId("");
		
		//assertEquals(false, nie.getIdValido());
		
		
		
		
		
		String[] casosTest = { // casos DNI PASS
		 		"78484464T","72376173A","01817200Q","95882054E","63587725Q",
		 		"26861694V","21616083Q","26868974Y","40135330P","89044648X",
		 		"80117501Z","34168723S","76857238R","66714505S","66499420A",
		 		// casos NIE PASS
		 		"X1234567T", "Y1234567T", "Z1234567T",
		 		// casos NIE FAIL
		 		"J1234567T", "H1234567T", "R1234567T",
		 		"X12345678X", "X1234T", "X1234567I"
		 		};
		
		
		for (int i=0; i<casosTest.length; i++){
			if (i < 18){
				id.setID(casosTest[i]);
				
				assertEquals(true, id.getIdValido());
			}
			else{
				
				id.setID(casosTest[i]);
				
				assertEquals(false, id.getIdValido());
				
			}
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	private ArrayList<String> listaDnisIncorrectos(int cantidadDni){
		ArrayList<String> dnis = new ArrayList<>();
		
		
		
		for(int i=0; i<cantidadDni;i++){
			dnis.add(GeneradorAutomatico.genararDNIIncorrectos());
		}
		return dnis;
		
	}
	
	
	
	
	@Test
	public void arrayListTest() {
		ValidadorId id = new ValidadorId("");
		
		int cantidadDni = 100;
		ArrayList<String> dnis = listaDnisIncorrectos(cantidadDni);
		
		for(int i=0; i<dnis.size();i++){
			
			
			
			id.setID(dnis.get(i));
			assertEquals(false, id.getIdValido());
		}

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
