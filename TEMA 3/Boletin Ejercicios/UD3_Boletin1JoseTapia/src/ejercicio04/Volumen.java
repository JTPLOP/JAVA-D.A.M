package ejercicio04;

public class Volumen {

	//ATRIBUTOS
	private double altura;
	private double radio;
	
	//CONSTRUCTOR
	
	public Volumen (double altura, double radio) {
		this.altura=altura;
		this.radio=radio;
	}
	
	public Volumen () {
		
	}
	
	//METODO
	
	public double calcVol () {
		double vol, exp=2;
		
		vol=Math.PI*Math.pow(radio, exp)*altura;
		
		return vol;
	}
	
}
