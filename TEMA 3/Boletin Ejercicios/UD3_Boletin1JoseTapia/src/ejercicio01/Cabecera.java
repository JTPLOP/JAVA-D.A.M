package ejercicio01;

public class Cabecera {

	
		// DECLARAR ATRIBUTOS
	
		private String nomAsign;
		
		private int aula;
		
		private String fecha;
	
		//DECLARAR CONSTRUCTURES
		
		//Con todos los parametros
		public Cabecera (String nomAsign, int aula, String fecha) {
			this.nomAsign=nomAsign;
			this.aula=aula;
			this.fecha=fecha;
			
		}
		// CONSTRUCTOR VACIO
		
		// CON DOS PARAMETROS
		public Cabecera (String nomAsign, int aula) {
			
			this.nomAsign=nomAsign;
			this.aula=aula;
		}
		
		
		// DECLARAR METODOS
		
		public void modelarCabecera () {		
		System.out.println("\n-----------------------------");
		System.out.println("Nombre de la asignatura: "+nomAsign);
		System.out.println("Aula: "+aula);
		System.out.println("Fecha: "+fecha);
		System.out.println("-----------------------------");
		
		}
}
