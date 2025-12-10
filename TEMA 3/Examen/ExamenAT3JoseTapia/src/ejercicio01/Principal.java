package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		int opcion;
		
		//VARIABLES PROFESOR
		String nombre;
		int id, tiempoPasado, horasTrabajo;
		int filtro=20;
		int newHora;
		
		//VARIABLES ADMINISTRACION
		int numProfesores= 0;
		int tamPlantilla;
		double cantidad=100, porcentaje=20;
		Profesor [] lista;
		double presupuesto;
		double cantMinima=1200;
		
		
		//LLAMADAS A CLASE
		
		Profesor p1;
		Administracion ad1;
		
		//OBJETOS DE PRUEBA
		p1 = new Profesor ("Manolo Gomez", 1, 10, 20);
		
		
		
		
		//PROGRAMA
		
		System.out.println("Bienvenido, este programa se encarga de la gestion de los profesores.");
		System.out.println("Indicame cuantos profesores hay en la plantilla: ");
		tamPlantilla=Leer.datoInt();
		
		System.out.println("Y otra cosa mas, con que presupuesto contamos? Indicar: ");
		presupuesto=Leer.datoDouble();
		
		
		lista= new Profesor [tamPlantilla];
		ad1 = new Administracion(lista, presupuesto);
		
		lista [numProfesores] = p1;
		numProfesores++;
		
		
		
		
		
		System.out.println("Perfecto, ya puedes llevar a cabo el programa sin problemas.");
		
		do {
			System.out.println("Indiqueme que opcion quieres llevar a cabo:");
			System.out.println("================================");
			System.out.println("[1] Agregar un nuevo profesor");
			System.out.println("[2] Buscar por id");
			System.out.println("[3] Buscar por edad");
			System.out.println("[4] Calcular nominas mediante filtro");
			System.out.println("[5] Calidad sueldo");
			System.out.println("[6] Agregar un nuevo profesor");
			System.out.println("[7] Presupuesto total");
			System.out.println("[8] Listar profesores");
			System.out.println("[9] Calcular porcentaje nomina");
			System.out.println("[0] Cerrar programa");
			
			
			//OPCIONES
			System.out.println("================================");
			
			opcion=Leer.datoInt();
			
			switch (opcion) {
				
				case 1: 
					System.out.println("Usted ha entrado en la seccion de crear un profesor:");
					
					System.out.println("Indiqueme el nombre y apellido del profesor: ");
					nombre=Leer.dato();
					
					System.out.println("Indiqueme que identificador deseas agregarle: ");
					id=Leer.datoInt();
					
					System.out.println("Indiqueme la antigüedad del profesor:");
					tiempoPasado=Leer.datoInt();
					
					System.out.println("Indiqueme las horas trabajadas durante este mes del profesor: ");
					horasTrabajo=Leer.datoInt();
					
					System.out.println("Perfecto, ya lo tenemos.");
					
					
					p1= new Profesor (nombre, id, tiempoPasado, horasTrabajo);
					ad1.agregarLista(numProfesores, p1);
					numProfesores++;
				
					break;
					
					
				case 2:
					System.out.println("Usted ha entrado en la sección de buscar por identificador.");
					
					System.out.println("Indique el id asignado de trabajador buscado: ");
					id=Leer.datoInt();
					
					
					id = ad1.findByID(id, numProfesores);
					
					if (id != -1) {

						System.out.println("El profesor que usted ha buscado es: "+lista[id].getNombreApellidos()+".\n");
						
					}else {
						System.out.println("El profesor no ha sido encontrado.\n");
					}
					
					
					break;
					
					
				case 3: 
					System.out.println("Usted ha entrado en filtrar por edad:");
					System.out.println("Basandonos en el filtro que indicaste: "+filtro);
					
					if (ad1.buscarByAnnyos(filtro, numProfesores)[1] == null) {
						System.out.println("No hay ningun profesor que cumpla las condiciones.");
					}else {
					System.out.println("Los profesores que cumplen con las condiciones son: ");
					System.out.println("Lista: ");
						for (int i = 0; i < numProfesores; i++) {
							System.out.println(ad1.buscarByAnnyos(filtro, numProfesores)[i].getNombreApellidos());
						}
					}
					
					break;
					
				case 4:
					System.out.println("Usted ha entrado en la seccion de calcular gasto en nominas llevando a cabo el filtro de los "+filtro+" años.");
					System.out.printf("El gasto ha sido de: %.2f€.",ad1.calcularGastos(numProfesores, cantidad, porcentaje, filtro));
					break;
					
					
				case 5: 
					System.out.println("Usted se encuentra en la seccion de comprobar la calidad del sueldo de su empleado.");
					System.out.println("Indiquenos el id del empleado: ");
					id=Leer.datoInt();
					
					ad1.comprobarSueldo(id, cantidad, porcentaje, cantMinima, numProfesores);
					
					break;
				
				case 6: 
					System.out.println("Usted se encuentra en al seccion de modificar las horas de un trabajador:");
					System.out.println("Indiqueme el id del profesor: ");
					id=Leer.datoInt();
					
					System.out.println("Perfecto, indiqueme el numero de hora que deseas agregarle: ");
					newHora=Leer.datoInt();
					ad1.modificarHoras(id, newHora, numProfesores);
					
					System.out.println("Fue modificada correctamente.");
					break;
					
				case 7: 
					System.out.println("Esta seccion te permitira comprobar el presupuesto final tras pagar todas las nominas: ");
					
					if (ad1.calcularPresupuesto(numProfesores, cantidad, porcentaje) <= presupuesto) {
						System.out.printf("El presupuesto se te ha quedado en: %.2f€."+(presupuesto-ad1.calcularPresupuesto(numProfesores, cantidad, porcentaje)));
						
					}else {
						System.out.println("Usted no tiene suficiente presupuesto como para pagar a la plantilla.");
					}
					break;
					
				case 8: 
					System.out.println("Esta seccion te permitira listar a todos los profesores: ");
					
					ad1.mostrarProfesores(numProfesores, cantidad, porcentaje);
					
					break;
					
				case 9: 
					
					System.out.println("Usted se encuentra en la seccion de hallar porcentaje del total del presupuesto.");
					System.out.println("Indicame el id del profesor al que quieres hallar su porcentaje: ");
					id=Leer.datoInt();
					
					System.out.printf("Su porcentaje total seria de: %.2f porciento.\n\n",(ad1.calcularPorcentaje(id, numProfesores, porcentaje, presupuesto, cantidad)));
					break;
					
				case 0: 
					System.out.println("Saliendo del programa...");
					break;
					
				default:
					System.err.println("El valor introducido fue erroneo, vuelve a introducirlo.\n");
					break;
					
			}
			
			
		}while (opcion != 0);
		
		
		
	}

}
