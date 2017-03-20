package org.foobarspam.validador_id;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorId {
	
	private String numeroId = null; 
	private String patron = "\\b[XYZ]+\\d{7}+[A-Z&&[^IOUÑ]]\\b|\\b\\d{8}+[A-Z&&[^IOUÑ]]\\b";

	public static void main(String[] args) {
		
		ValidadorId id = new ValidadorId("");
		
		
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
				System.out.println(id.getIdValido()+""+i);
				//assertEquals(true, id.getIdValido());
			}
			else{
				
				id.setID(casosTest[i]);
				System.out.println(id.getIdValido()+""+i);
				//assertEquals(false, id.getIdValido());
				
			}
			
		}
		
		
		
		
		
		

	}
	
	
	public ValidadorId(String numeroId){
		this.numeroId = numeroId;
		
	}
	
	
	
	
	

	public boolean getIdValido() {
		
		return Comprovador(patron, numeroId);
	}










	public boolean Comprovador(String regex, String source) {
	
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(source);
		
		boolean found = false;
		if(m.find()) {
			found = true;
		}
		return found;
	}


	public void setID(String id) {
		// TODO Auto-generated method stub
		numeroId = id;
		
		
	}










}


