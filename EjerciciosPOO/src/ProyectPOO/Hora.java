package ProyectPOO;

public class Hora {

	private Byte hora;
	private Byte minutos;
	private Byte segundos;
	
	
	
	public Hora() {
		
		this.hora = 00;
		this.minutos = 00;
		this.segundos = 00;
		
		
	}
	
	
	public Hora(Byte hora, Byte minutos, Byte segundos) {
		if ((hora <= 24) || (hora >= 00)){
			
		}else{this.hora = 00;}
		
		if ((minutos <= 59) || (minutos >= 00)){
			
		}else{this.minutos = 00;}
		
		if ((segundos <=59)||(segundos >=00)) {
			
		}else{this.segundos = 00;}
		
		
	}
	
	
	
	public String getHora(){
		return hora.toString()+":" + minutos.toString()+":" + segundos.toString();
	}
	

}
