package ejemploCirculo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		double radio, total;
		
		
		// Declaramos el objeto
		
		areaCirculo c1;
		
		// Instanciamos el objeto
		System.out.println("Que valor tiene el radio");
		radio=Leer.datoDouble();
		
		c1= new areaCirculo (radio);
		
		total=c1.conversionAreaEnMetro2();
		
		System.out.printf("%.9f m2",total);
		
	}

}
