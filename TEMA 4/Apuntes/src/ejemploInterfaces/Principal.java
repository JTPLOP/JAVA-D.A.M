package ejemploInterfaces;

public class Principal {

	public static void main(String[] args) {
		
	//IDepredador predator = new IDepredador (); --> No se puede
		
	Anfibio anfi = new Anfibio ();
	Rana ran1 = new Rana ();
	
	ran1.cazar(false);
	ran1.perseguir();
		
	
		
	}
}
