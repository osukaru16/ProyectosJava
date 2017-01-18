package ProyectPOO;

public class Principal {

	public static void main(String[] args) {
		CuentaCorriente cuentaC = new CuentaCorriente();
		//Hora hora = new Hora(23, 3, 3);
		System.out.println("Hola. \nMe llamo: "+ cuentaC.getNombre() + " " +cuentaC.getApellido());
		//System.out.println(hora.getHora());
	}

}
