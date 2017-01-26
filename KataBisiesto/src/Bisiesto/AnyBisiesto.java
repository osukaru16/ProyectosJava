package Bisiesto;

public class AnyBisiesto {
	private Integer any;

	public AnyBisiesto() {
		this.any = 1904;
	}
	
	public AnyBisiesto(Integer any) {
		this.any = any;
	}
	
	
	public Integer getAny(){
		return this.any;
	}
	
	
	
	
	public void setAny(Integer any){
		this.any = any;
	}
	
	
	
	
	
	
	public Boolean esBisiesto(){
		String comprobador  = getAny().toString();
		Boolean sentencia = comprobador.substring(comprobador.length()-2, comprobador.length()).equals("00");
		if((sentencia)&&(getAny()>=400)){
			return getAny() % 400 == 0;
		}
		else{
		return  getAny() % 4 == 0;
		}
	}

}
