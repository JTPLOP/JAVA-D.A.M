package ejemploExtraccin;

public class Extracion {

	
	//DECLARAR ATRIBUTO
	
	private String instituto;
	private String mercadona;
	
	//BLOQUE CONSTRUCTOR
	
	public Extracion (String instituto, String mercadona) {
		this.instituto=instituto;
		
	}
	
	public Extracion () {
		
	}
	
	// GETTERS AND SETTERS 
	//Instituto
	
	public String getInstituto () { //No paso nada y devuelve nada
		
		return instituto;
		
	}
	
	public void setiInstituto (String instituto) { //No devuelve nada y le paso algo
		this.instituto=instituto; //Misma estructura que los constructores pero solo con una linea
		
	}
	
	
	// Mercadona
	public String getMercadona ()
	{
		return mercadona;
		
	}
	
	public void setMercadona (String mercadona) {
		this.mercadona=mercadona;
	
	}
	
	
	//METODOS
	
	public void modelarCabecera () {		
		System.out.println("\n-----------------------------");
		System.out.println("Instituto: "+instituto);
		System.out.println("Supermercado: "+mercadona);
		System.out.println("-----------------------------");
		
		}

}
