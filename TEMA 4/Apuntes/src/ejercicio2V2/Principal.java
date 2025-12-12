package ejercicio2V2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		String marca, fecha, contacto, nombre;
		String cif;
		//DECLARAR OBJETOS
		Carta c1;
		TarjetaDeVisita t1;
		Empresa e1;
		
		System.out.println("Bienvenido a este programa que te ayudara con el encabezado:");
		System.out.println("Me podrias introducir el nombre de su empresa: ");
		marca=Leer.dato();
		
		System.out.println("Me podrias pasar el CIF de su empresa: ");
		cif=Leer.dato();
		
		e1= new Empresa (marca, cif);
		
		System.out.println("Perfecto!!\n");
		
		do {
			System.out.println("Escoja opcion:");
			System.out.println("1. Crear Carta\n2. Crear Tarjeta de visita\n0. Cerrar programa");
			opcion=Leer.datoInt();
			
			switch (opcion) {
				
				case 1:
					System.out.println("Indiqueme la fecha a la que estamos: ");
					fecha=Leer.dato();
					
					c1= new Carta (fecha);
					
					c1.crearEncabezado(e1);
					
					break;
					
				case 2:
					System.out.println("Indiqueme su nombre: ");
					nombre=Leer.dato();
					
					System.out.println("Indiqueme su correo: ");
					contacto=Leer.dato();
					
					t1= new TarjetaDeVisita (contacto, nombre);
					t1.crearEncabezado(e1);
				
					break;
					
				case 0:
					System.out.println("Cerrando programa");
					break;
					
				default:
					System.err.println("El valor que has introducido ha sido erroneo.");
			}
			
		}while (opcion != 0);
		
	}

}
