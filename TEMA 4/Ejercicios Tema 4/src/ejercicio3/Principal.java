package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		
		int opcion, opcion2;
		double cilindrada, potencia, cantFijaFurgo;
		double impuesto;
		
		//VARIABLES CLASE MADRE
		boolean ceroEmi=false, eCo=false, tipoB=false, tipoC=false;

		//LLAMADA DE OBJETOS: 
		
		Motocicletas m1;
		Coches c1;
		Furgonetas f1;
		
		System.out.println("Bienvenid este programa te ayudara a gestionar los impuestos: ");
		
		System.out.println("Indique el impuesto fijo: ");
		impuesto=Leer.datoDouble();
		
		do {
			
			opcion=Leer.datoInt();
			
			switch (opcion) {
				
				case 1: 
					System.out.println("Estas en la seccion de las motocicletas.");
					System.out.println("Indique las cilindradas: ");
					cilindrada=Leer.datoDouble();
					
					System.out.println("Indique que tipo de vehiculo ha sido catalogado: ");
					do { 
					System.out.println("1. Cero Emision\n2. Eco\n3.TipoB\n4. TipoC");
					opcion2= Leer.datoInt();
						switch (opcion2) {
							
							case 1:
								ceroEmi=true;
								break;
							case 2: 
								eCo=true;
							case 3:
								tipoB=true;
							case 4:
								tipoC=true;
							default:
								System.err.println("Valor incorrecto, vuelva a introducir");
				
						}
			
					}while (opcion2 != 1 || opcion2 != 2 || opcion2 != 3 ||opcion2 != 4 );
					
					m1= new Motocicletas (ceroEmi, eCo, tipoB, tipoC, cilindrada);
					
					
					
					
					
					
					
					
					
					
					
					
			 }
		}while (opcion != 0);
		
	}

}
