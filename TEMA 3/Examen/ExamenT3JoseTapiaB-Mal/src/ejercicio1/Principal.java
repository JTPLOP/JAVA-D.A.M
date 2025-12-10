package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES GENERALES
		int opcion;
		
		
		//VARIABLES CLASE HIJO
		String nombre;
		int id, edad, horasSemanales;
		int porcentaje=20;
		double pagaSemanal=100;
		int nuevaSemanal;
		
		// VARIABLES CLASE GESTION FAMILIAR
		Hijo [] lista;
		int cantHijos; //leer para luego declarar hijo
		int numHijos=0;
		double presuTotal;
		int buscarHijo;
		int edadSugerida=14;
		
		//LLAMADA A CLASES
		Hijo h1;
		GestionFamiliar g1;
		
		
		h1 = new Hijo ("Jose", 1, 10, 10); //CREAR HIJO DE PRUEBA
		
		//COMENZAR PROGRAMA
		System.out.println("Bienvenido a este programa que te ayudará con la gestión familiar.");
		System.out.println("¿Podrías indicarme cuántos hijos tienes pensado gestionar? Indicar: ");
		cantHijos=Leer.datoInt();
		
		lista = new Hijo [cantHijos]; //DECLARAMOS ARRAY DE LISTA DE HIJOS
		
		lista [numHijos] = h1; //creamos hijo de prueba
		numHijos++;
		
		
		System.out.println("¿Y que cantidad de presupuesto total cuentas?");
		presuTotal=Leer.datoDouble();
		
		g1= new GestionFamiliar(lista,presuTotal);
		
		System.out.println("Perfecto, ya estaría listo para utilizar el programa y máximizar su productividad.");
		
		do {
			System.out.println("Indiqueme que opción quieres llevar a cabo:");
			System.out.println("==============================");
			System.out.println("[1] Agregar un nuevo hijo");
			System.out.println("[2] Buscar hijo");
			System.out.println("[3] Buscar menores de "+edadSugerida+" años.");
			System.out.println("[4] Calcular presupuesto de hijos mayores de "+edadSugerida+" años.");
			System.out.println("[5] Modificar número de horas semanales hijo.");
			System.out.println("[6] Comprobar presupuesto tras las pagas.");
			System.out.println("[7] Listar hijos");
			//Agregar opciones
			
			System.out.println("[0] Cerrar programa");
			System.out.println("==============================");
			opcion=Leer.datoInt();
			
			switch (opcion) {
				
				case 1:
					System.out.println("Usted se encuentra en la sección de agregar un nuevo hijo.");
					System.out.println("Para ello necesitamos que indiques ciertos datos indispensables para la creación.");
					System.out.println("\n¿Podrías indicarme el nombre de su hijo? Indicar: ");
					nombre=Leer.dato();
					
					System.out.println("\nIndica un id para tu hijo: ");
					id=Leer.datoInt(); 
					
					System.out.println("\n¿Podrías indicarme la edad de su hijo? Indicar: ");
					edad=Leer.datoInt();
					
					System.out.println("\n¿Podrías indicarme la cantidad de horas estudiadas en la semana? Indicar: ");
					horasSemanales=Leer.datoInt();
					
					h1= new Hijo (nombre, id, edad, horasSemanales); //DECLARACION HIJO
					g1.agregarHijo(numHijos, h1);	
					
					
					System.out.println("Se ha agregado correctamente: "+lista[numHijos].getNombre());
					numHijos++;
					break;
					
					
					
				case 2: 
					System.out.println("Usted se encuentra en la sección de buscar hijo.");
					System.out.println("¿Podrías indicarme el identificador del hijo que deseas buscar?");
					buscarHijo=Leer.datoInt()-1;
					
					g1.buscarHijo(numHijos, buscarHijo); //CHECKEAR LUEGO
					
					break;
					
				case 3: 
					System.out.println("Usted se encuentra en la sección de filtrar por edad.");
					System.out.println("En este caso el filtro se aplicará en menores de: "+edadSugerida);
					
					g1.filtrarEdad(edadSugerida, numHijos);
					
					break;
					
				case 4: 
					System.out.println("Usted se encuentra en la sección de calcular paga.");
					System.out.println("En este caso el filtro se aplicará en mayores de: "+edadSugerida);
					
					System.out.printf("\nEl dinero invertido en los mayores será: %.2f",g1.calcularPagaMayores(edadSugerida, numHijos, pagaSemanal, porcentaje)+"€.");
					break;
					
					
				case 5: 
					System.out.println("Usted se encuentra en la sección de modificar horas semanales.");
					System.out.println("Actualmente tiene registrado: "+numHijos);
					System.out.println("¿Qué hijo deseas modificarle sus horas semanales?");
					buscarHijo=Leer.datoInt()-1;
					
					System.out.println("¿Cuántas horas deseas agregarle?");
					nuevaSemanal=Leer.datoInt();
					
					g1.modificarHoras(nuevaSemanal, buscarHijo);
					
					System.out.println("¡Se modifico correctamente!");
					break;
					
				case 6:
					System.out.println("Usted se encuentra en la sección de comprobar el dinero restante.");
					System.out.printf("Su gasto total fue de: %.2f€",g1.calcularPresupuesto(numHijos, pagaSemanal, porcentaje));
					//calcular gasto
					if (presuTotal < g1.calcularPresupuesto(numHijos, pagaSemanal, porcentaje)) {
						System.out.println("\nUsted no tiene suficiente dinero como para pagar todas las pagas.");
					}else {
						System.out.printf("Su presupuesto quedo en: %.2f€",(presuTotal-=g1.calcularPresupuesto(numHijos, pagaSemanal, porcentaje))+"€.");
					}
					break;
				case 7: 
					System.out.println("Usted se encuentra en la sección de listar a todos sus hijos.\n");
					
					g1.listarHijos(numHijos);
					
					break;
					
				case 0:
					System.out.println("Cerrando programa...");
					
				default:
					System.err.println("El número introducido fue erróneo.");
			}
			
			
		}while (opcion !=0);
		
		System.out.println("Muchas gracias por utilizarnos.");
		
		
		
	}

}
