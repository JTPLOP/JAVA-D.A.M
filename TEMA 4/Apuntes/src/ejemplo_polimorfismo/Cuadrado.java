package ejemplo_polimorfismo;

public class Cuadrado extends Figura {

	private double lado;

	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}

	
	
	//Crear metodos
	
	public Cuadrado (){
	}



	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}



	public double calcularArea() { 
		return lado*lado;
	}
	
	public double calcularPerimetro () {
		return lado*4;
	}
	
	public void mostrarLados () {
		System.out.println("Solo estoy en la clase cuadrado porque los demas no tienen lados.");
	}
	
	
	
	
	
}
