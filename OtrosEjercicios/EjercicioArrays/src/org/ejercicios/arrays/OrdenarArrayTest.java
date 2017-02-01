package org.ejercicios.arrays;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class OrdenarArrayTest {

	@Test
	public void test_getOrdenaMenor() {
		String comprobacion = "12345";
		OrdenarArray ordenar = new OrdenarArray();
		assertEquals(comprobacion, ordenar.getOrdenaMenor());
		//asserEquals(54321, ordenar.getOrdenaMayor());
		//Assert.assertArrayEquals(12345, ordenar.getOrdenaMeno());
	}
	
	
	@Test
	public void test_getOrdenaMayor() {
		String comprobacion = "54321";
		OrdenarArray ordenar = new OrdenarArray();
		assertEquals(comprobacion, ordenar.getOrdenaMayor());
		//Assert.assertArrayEquals(12345, ordenar.getOrdenaMeno());
	}

}
