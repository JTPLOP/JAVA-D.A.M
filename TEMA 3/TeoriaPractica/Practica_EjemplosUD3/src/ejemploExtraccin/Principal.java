package ejemploExtraccin;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaracion de atributos
		String instituto="mercadona";
		
		//Declarar de clases
		Extracion c1;
		c1 = new Extracion ();
		
		// Uso del get
		c1.getInstituto("f"); //No se ve en pantalla
		System.out.println("Nombre: "+c1.getInstituto());
		
		//Uso del set
		c1.setiInstituto("Lenguaje");
		
		
		
		
		
		
		
		
	}

}
