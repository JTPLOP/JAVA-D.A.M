package ejemplo01;

import java.util.Arrays;

public class Profesor extends Persona{

	//Ahora nos basamos en 6 caracteristicas de un profesor basandonos en qualitas
	
	private int asig [];
	private double salario;

	public Profesor(String dNI, int edad, String nombre, int codPostal, int numTelefono, int id, int[] asig, double salario) {
		super(dNI, edad, nombre, codPostal, numTelefono, id);
		this.asig = asig;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Profesor [asig=" + Arrays.toString(asig) + ", salario=" + salario + "]";
	}

	
	//Rescribir codigo
	public int sumarEdad (int cant) {
		return super.sumarEdad(cant)-2;
	}
	
	
	
	
	
	
}
