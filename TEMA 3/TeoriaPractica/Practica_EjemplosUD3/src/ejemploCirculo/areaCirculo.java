package ejemploCirculo;

public class areaCirculo {

		// Declarar atributos
	
		private double radio;
		
		// Contructor con parametro
		
		public areaCirculo (double radio) { //Radio es una variable
			this.radio=radio;
			
			
		}
	
	
		public void imprimirDatos () {
			
			System.out.println("El valor es: "+radio);
		}
		
		//calcular area
		public double calcularArea () {
			//variables
			double area=0, dos=2;
			area=Math.PI*Math.pow(radio, dos);
			return area; 
		}
		
		// calcular el radio a metros cuadrados
		public double conversionAreaEnMetro2 () {
			
			double area=0, dos=2, conversion=10000;
			radio=radio/conversion;
			area=Math.PI*Math.pow(radio, dos);
			
			return area;
			
		}
	
	
	
	
	
	
	
	
	
	
	
}
