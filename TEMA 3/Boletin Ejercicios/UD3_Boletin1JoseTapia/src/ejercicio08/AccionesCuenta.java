package ejercicio08;

public class AccionesCuenta {

	private double saldo;
	private String titular;
	
	//CONSTRUCTORES
	
	public AccionesCuenta (double saldo, String titular) {
		this.saldo=saldo;
		this.titular=titular;
		
	}
	
	public AccionesCuenta () {
		
	}
	
	//GETTER AND SETTER
	
	public double getSaldo () {
		return saldo;
	}
	
	public void setSaldo (double saldo) {
		this.saldo=saldo;
	}
	
	//METODOS
	
	//INGRESAR DINERO
	
	public double ingresarDinero (double ingreso) {
		
		saldo+=ingreso;
		
		return saldo; //el return realmente no es obligatorio ya que no vamos a mostrar saldo tras la operacion, por lo que podriamos poner un void
	}
	
	//RETIRAR DINERO
	
	public double retirarDinero (double retirar) {
		
		saldo-=retirar;
		return saldo;
	}
	
	//CALCULAR SALDO EN DOLARES AMERICANOS
	
	public double conversionDolares () {
		double dolares=1.16, conversion;
		conversion=saldo*dolares;
		
		return conversion;
	}
	
	//CONSULTAR SALDO
	
	public void verSaldo () {
		
		System.out.println("------------------------------------");
		System.out.printf("El saldo actual de %s es: %.2f€.",titular,saldo);
		System.out.println("\n------------------------------------\n");
		
	}
	
	
	
}
