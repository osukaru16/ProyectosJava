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
	
	@Test
	public void test_secular_bisiesto_2000() {
		AnyBisiesto any = new AnyBisiesto(2000);
		assertEquals("Es el 2000",true, any.esBisiesto());
	}
	
	@Test
	public void test_secular_2100() {
		AnyBisiesto any = new AnyBisiesto(2100);
		assertEquals("Es el 2100",false, any.esBisiesto());
	}
	
	@Test
	public void test_secular_set() {
		AnyBisiesto any = new AnyBisiesto(2100);
		assertEquals("Es el 2100",false, any.esBisiesto());
		any.setAny(2000);
		assertEquals("Es el 2000",true, any.esBisiesto());
		
	}
	
	
	
	@Test
	public void test_204() {
		AnyBisiesto any = new AnyBisiesto(204);
		assertEquals("Es el 204",true, any.esBisiesto());
	}
	
	
	
	
	@Test
	public void test_200() {
		AnyBisiesto any = new AnyBisiesto(200);
		assertEquals("Es el 200",true, any.esBisiesto());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
