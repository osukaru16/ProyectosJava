package ProyectPOO;

public class Principal {

	public static void main(String[] args) {
		CuentaCorriente cuentaC = new CuentaCorriente();
		//Hora hora = new Hora(23, 3, 3);
		System.out.println("Hola. \nMe llamo: "+ cuentaC.getNombre() + " " +cuentaC.getApellido());
		//System.out.println(hora.getHora());
		
		Fecha fecha = new Fecha();
		fecha.setFecha(40, 40, 40);
		fecha.imprimirFecha();
		
		Fecha fecha2 = new Fecha();
		fecha2.setFecha(15, 9, 1987);
		fecha2.imprimirFecha();
	
		Fecha fecha3 = new Fecha(50,50,50);
		//fecha3.setFecha(15, 9, 1987);
		fecha3.setDia(1252354);
		fecha3.setMes(150);
		fecha3.setAny(1252386554);
		fecha3.imprimirFecha();
		
		
		
		
		
		Fecha fecha4 = new Fecha(25,1,2017);
		//fecha4.setFecha(15, 9, 1987);
		fecha4.imprimirFecha();
		
		System.out.println("año: "+fecha4.getAny());
		System.out.println("mes: "+fecha4.getMes());
		System.out.println("dia: "+fecha4.getDia());
		
		
		
		System.out.println("Mi fecha de nacimiento es: "+fecha2.getFecha());
	}

}
