package ProyectPOO;

public class CuentaCorriente {
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	
	public CuentaCorriente() {
		this.nombre = "Leisha";
		this.apellido = "Altaya";
		this.direccion = "Falsa 123";
		this.telefono = "690281579";
		
		
	}
	
	
	
	public CuentaCorriente(String nombre, String apellido, String direccion, String telefono) {
		
	}
	
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellido(){
		return this.apellido;
	}

}
