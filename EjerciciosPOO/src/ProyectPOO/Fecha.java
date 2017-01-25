package ProyectPOO;

public class Fecha {
	
	private Integer dia;
	private Integer diaMin = 01;
	private Integer diaMax = 31;
	
	private Integer mes;
	private Integer mesMin = 01;
	private Integer mesMax = 12;
	
	private Integer any;
	private Integer anyMin = 1900;
	private Integer anyMax = 3000;
	
	
	//Constructores
	
	public Fecha() {
		this.dia = 01;
		this.mes = 01;
		this.any = 1900;
	}
	
	
	public Fecha(int dia, int mes, int any) {
		
		if ((dia>=this.diaMin)&&(dia<=this.diaMax)){
			this.dia = dia;
		} 
		else{
			this.dia = this.diaMin;
		}
		
		
		if ((mes>=this.mesMin)&&(mes<=this.mesMax)){
			this.mes = mes;
		}
		else{
			this.mes = this.mesMin;
		}
		
		
		
		if ((any>=this.anyMin)&&(any<=this.anyMax)){
			this.any = any;
		}
		else{
			this.any = this.anyMin;
		}
		
	}
	
	//gets
	
	public Integer getDia(){
		return this.dia;
	}
	
	public Integer getMes(){
		return this.mes;
	}
	
	public Integer getAny(){
		return this.any;
	}
	
	
	public String getFecha(){
		return this.dia+"-"+ this.mes+"-"+ this.any;
	}
	
	
	
	
	
	//sets
	
	
	public void setDia(int dia){
		Fecha set_dia = new Fecha(dia, this.mes, this.any);
		this.dia = set_dia.dia;
	}
	
	public void setMes(int mes){
		Fecha set_mes = new Fecha(this.dia, mes, this.any);
		this.mes = set_mes.mes;
	}
	
	public void setAny(int any){
		Fecha set_any = new Fecha(this.dia, this.mes, any);
		this.any = set_any.any;
	}
	
	
	
	public void setFecha(int dia, int mes, int any){
		Fecha set_fecha = new Fecha(dia, mes, any);
		this.dia = set_fecha.dia;
		this.mes = set_fecha.mes;
		this.any = set_fecha.any;
	}
	
	//Otros metodos
	
	private String mesLetra(int mes){
		String meses[] = new String [12];
		meses[0]="Enero";
		meses[1]="Febrero";
		meses[2]="Marzo";
		meses[3]="Abril";
		meses[4]="Mayo";
		meses[5]="Junio";
		meses[6]="Julio";
		meses[7]="Agusto";
		meses[8]="Septiembre";
		meses[9]="Octubre";
		meses[10]="Noviembre";
		meses[11]="Diciembre";
		return meses[mes-1];
	}
	
	
	public void imprimirFecha(){
		System.out.println(this.dia+"-"+mesLetra(this.mes)+"-"+ this.any);
	}
	
	
	
	
	
	
	
	
	
	


}
