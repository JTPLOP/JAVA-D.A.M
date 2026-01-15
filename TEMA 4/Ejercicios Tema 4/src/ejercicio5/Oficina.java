package ejercicio5;

public class Oficina {

	//ATRIBUTOS
	
	private Empleado lista [];
	
	
	
	public Oficina(Empleado[] lista) {
		super();
		this.lista = lista;
	}

	//METOSO
	
	
	public double calcularDinerillo(Empleado e) { //POLIMORFISMO
		
		double sueldo, iva=21;
		int den=100;
		
		sueldo=e.calcularSueldo() - (e.calcularSueldo() *iva / den);
		
		return sueldo;
	}
	
	
	public double calcularGastos ( ) {
		double total=0;
		for (int i = 0; i < lista.length; i++) {
			
			total+=lista[i].calcularSueldo();
		}
		
		return total;
	}
	
	
}
