package ejercicio5;

public class Principal {

	public static void main(String[] args) {
		
		//CREAR OBJETOS A CASCAPORRAS
		
		Empleado g1 = new Gerente ("Manuel", "Paquez", 2000, 1, 10);
		Empleado v2 = new Vendedor ("Manuel", "Paquez", 2000, 2, 10, 10);
		Empleado v3 = new Vendedor ("Manuel", "Paquez", 2000, 1, 5,20);
		Empleado g4 = new Gerente ("Manuel", "Paquez", 2000, 1, 10);
		
		Oficina [] lista = {g1,v2,v3,g4};
		
		
		
		
	}
}
