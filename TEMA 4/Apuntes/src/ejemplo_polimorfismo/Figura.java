package ejemplo_polimorfismo;

public abstract class  Figura {

	//AGREGAMOS ATRIBUTOS
	String nombre;
	String color;
	
	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}
	
	
	
	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}



	//CREAMOS METODOS
	public abstract double calcularArea (); //Recordar que no se agregan llaves
	
	
	public abstract double calcularPerimetro (); //Recordar que no se agregan llaves
	
	public void metodoSoloDeFigura () {
		System.out.println("Solo estoy en la clase figura, sin sobreescribir en las hijas");
	}
	
}
