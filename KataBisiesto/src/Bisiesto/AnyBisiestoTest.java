package Bisiesto;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnyBisiestoTest {

	@Test
	public void test_Vacio() {
		AnyBisiesto any = new AnyBisiesto();
		assertEquals("Es el vacio",true, any.esBisiesto());
	}
	
	
	
	@Test
	public void test_1904() {
		AnyBisiesto any = new AnyBisiesto(1904);
		assertEquals("Es el 1904",true, any.esBisiesto());
	}
	
	
	@Test
	public void test_1999() {
		AnyBisiesto any = new AnyBisiesto(1999);
		assertEquals("Es el 1999",false, any.esBisiesto());
	}
	
	
	
	
	
	
	

}
