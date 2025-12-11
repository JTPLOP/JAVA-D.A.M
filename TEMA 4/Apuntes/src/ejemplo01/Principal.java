package ejemplo01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumar;
		int mates [] = {1, 2, 3 };
		
		// CREACION DE OBJETOS CLASES HIJAS Y CLASES MADRES
		
		Persona p1 = new Persona ("56", 11, "Paco", 41100, 6554, 2);
		
		Alumno a1 = new Alumno ("56", 11, "Paco", 41100, 6554, 1, 6, "Hola", mates);
		
		Profesor t1 = new Profesor ("56", 11, "Paco", 41100, 6554, 6, mates, 2000);
		
		System.out.println("Datos: "+p1.toString());
		
		
		//CREACION DE METODOS
		
		System.out.println(p1.sumarEdad(1)); //Objeto creado en la clase madre.
		sumar=Leer.datoInt();
		
		System.out.println(t1.sumarEdad(sumar)); //Llamado objeto utilizando una clase hija t1 (pertenece a profesor no a persona)
		
	}

}
