package ejercicio02;

public class Circulo {

	//Declarar Atributos
	private double radio;
	
	
	//Constructores
	
	public Circulo (double radio) {
		this.radio=radio;
	}
	
	public Circulo () {
		
	}
	
	//Metodos
	
	//CM2
	public double calcArea () {
		
		//declarar atributos
		
		double area=0, dos=2;
		area=Math.PI*Math.pow(radio, dos);
		return area; 
		
	}
	
	//Area en m2
	
	public double areaM2 () {
		double area=0, dos=2, conversion=10000;
		radio=radio/conversion;
		area=Math.PI*Math.pow(radio, dos);
		
		return area;
		
	}
	
}
