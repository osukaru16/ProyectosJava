package Bisiesto;

public class AnyBisiesto {
	private int any;

	public AnyBisiesto() {
		this.any = 1904;
	}
	
	public AnyBisiesto(int any) {
		this.any = any;
	}
	
	
	public int getAny(){
		return this.any;
	}
	
	
	
	
	
	public Boolean esBisiesto(){
		return getAny() % 4 == 0;
	}

}
