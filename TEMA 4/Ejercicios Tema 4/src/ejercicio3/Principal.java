package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		int opcion, opcion2;
		double cilindrada, potencia;
		double impuesto;
		
		//VARIABLES CLASE MADRE
		String categoria [] = {"Cero Emisiones", "ECO", "TipoB", "TipoC"};
		double precios [] = {30,20,100,150};

		//LLAMADA DE OBJETOS: 
		
		Motocicletas m1;
		Coches c1;
		Furgonetas f1;
		
		System.out.println("Bienvenido este programa te ayudara a gestionar las comisiones a los vehiculos: ");
		
		
		do {
			System.out.println("Selecciona la opcion que prefieras\n ");
			System.out.println("[1] Motocicletas\n[2] Coches\n[3] Furgonetas\n[0] Salir");
			opcion=Leer.datoInt();
			
			switch (opcion) {
				
				case 1: 
					System.out.println("Estas en la seccion de las motocicletas.");
					System.out.println("Indique las cilindradas: ");
					cilindrada=Leer.datoDouble();
					m1= new Motocicletas(categoria, cilindrada);

					
					System.out.println("Indique que tipo de vehiculo ha sido catalogado: ");
					
					do { 
					m1.mostrarTipos();
					System.out.println("\nIndicar:");
					opcion2= Leer.datoInt();
						switch (opcion2) {
							
							case 1,2,3,4: 
								break;
								
							default:
								System.err.println("Valor incorrecto, vuelva a introducir");
						}
			
					}while (opcion2 != 1 && opcion2 != 2 && opcion2 != 3 && opcion2 != 4 );
					
					System.out.printf("\nEl precio para la motocicleta será de: %.2f€\n",m1.calcularPrecio(precios,(opcion2-1)));
					
					break;
					
				case 2: 
					System.out.println("Estas en la seccion de las coches.");
					System.out.println("Indique la potencia: ");
					potencia=Leer.datoDouble();
					c1= new Coches (categoria, potencia);

					
					System.out.println("Indique que tipo de vehiculo ha sido catalogado: ");
					
					do { 
					c1.mostrarTipos();
					System.out.println("\nIndicar:");
					opcion2= Leer.datoInt();
						switch (opcion2) {
							
							case 1,2,3,4: 
								break;
								
							default:
								System.err.println("Valor incorrecto, vuelva a introducir");
						}
			
					}while (opcion2 != 1 && opcion2 != 2 && opcion2 != 3 && opcion2 != 4 );
					
					System.out.printf("\nEl precio para la motocicleta será de: %.2f€\n",c1.calcularPrecio(precios,(opcion2-1)));
					
					break;
				case 3: 
					System.out.println("Estas en la seccion de las furgonetas.");
					System.out.println("Indique el impuesto: ");
					impuesto=Leer.datoDouble();
					f1= new Furgonetas (categoria, impuesto);

					
					System.out.println("Indique que tipo de vehiculo ha sido catalogado: ");
					
					do { 
					f1.mostrarTipos();
					System.out.println("\nIndicar:");
					opcion2= Leer.datoInt();
						switch (opcion2) {
							
							case 1,2,3,4: 
								break;
								
							default:
								System.err.println("Valor incorrecto, vuelva a introducir");
						}
			
					}while (opcion2 != 1 && opcion2 != 2 && opcion2 != 3 && opcion2 != 4 );
					
					System.out.printf("\nEl precio para la motocicleta será de: %.2f€\n",f1.calcularPrecio(precios,(opcion2-1)));
					
					break;
				case 0: 
					System.out.println("Cerrando programa...");
					break;
				default: 
					System.err.println("Valor erroneo, vuelva a intentarlo.");
					
					
			 }
		}while (opcion != 0);
		
	}

}
