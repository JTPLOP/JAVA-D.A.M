package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DEFINIR VARIABLES
		int planeta, mercurio=1, venus=2, idioma,
				tierra=3, marte=4, jupiter=5, saturno=6,urano=7,neptuno=8;
		double peso, solucion, constM=0.38, constV=0.91, constMT=0.38, constJ=2.53, constS=1.06, constU=0.92, constN=1.2;		
		
		String nombre, plant1="Mercurio", plant2="Venus", plant3="Tierra", plant4="Marte",
				plant5="Júpiter", plant6="Saturno", plant7="Urano", plant8="Neptuno", idom1="español", idom2="ingles";
		
		
		// introduccion programa
		
		System.out.println("Hola, te importaría introducir su nombre: ");
		nombre=Leer.dato();
		System.out.println("\nEncantado "+nombre+", este programa será capaz de indicarte tu peso en los diferentes planetas del sistema solar.\nMe podrías indicar tu peso en la tierra (utiliza Kg como sistema de medida): ");
		peso=Leer.datoDouble();
		System.out.printf("Perfecto, ahora pulse el planeta donde quiera conocer su peso: \nPulse 1 para %s \nPulse 2 para %s \nPulse 3 para %s \nPulse 4 para %s \nPulse 5 para %s \nPulse 6 para %s \nPulse 7 para %s \nPulse 8 para %s", plant1,plant2,plant3,plant4,plant5,plant6,plant7,plant8);				
		planeta=Leer.datoInt();
		
		// planeta solo es el nombre de una variable, no es booleana	

		switch (planeta) {
			case 1: 
				solucion= peso*constM;
				//submenu idiomas
				System.out.printf("\nElige la opción de idioma de su respuesta: \nPulse 1 para manterner en %s\nPulse 2 para traducir al %s",idom1,idom2);
				idioma=Leer.datoInt();
				switch (idioma) { 
					case 1:
						System.out.printf("\nSu peso en %s sera de %.2f N",plant1,solucion);
						break;
					case 2:
						System.out.printf("\nYour weight on %s will be %.2f N",plant1, solucion);
						break;
					default:
						
						System.out.println("Opción de idioma incorrecto.");
				}
				
				
				System.out.printf("Su peso en %s sera de %.2f N",plant1,solucion);
				break;
			case 2: 
				solucion= peso*constV;
				System.out.printf("Su peso en %s será de %.2f N",plant2,solucion);
				break;
			case 3: 
				// no hace falta calculo ya que es el peso directo que ha introducido previamente
				System.out.printf("Su peso en la %s será de %.2f N",plant3,peso);
				break;
			case 4: 
				solucion= peso*constMT;
				System.out.printf("Su peso en %s será de %.2f N",plant4,solucion);	
				break;
			case 5: 
				solucion= peso*constJ;
				System.out.printf("Su peso en %s será de %.2f N",plant5,solucion);
				break;
				
			case 6: 
				solucion= peso*constS;
				System.out.printf("Su peso en %s será de %.2f N",plant6,solucion);
				break;

			case 7: 
				solucion= peso*constU;
				System.out.printf("Su peso en %s será de %.2f N",plant7,solucion);
				break;
			case 8: 
				solucion= peso*constN;
				System.out.printf("Su peso en %s será de %.2f N",plant8,solucion);
				break;

			default:
				System.out.println("Has introducido un valor erróneo.");
		}
		System.out.println("\nMuchas gracias por utilizar el programa.");
		
	}
}
