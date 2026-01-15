package ejercicio6;

public class CuentaJoven extends CuentasBanco{

	//ATRIBUTOS
	private double regalo;

	public CuentaJoven(double regalo) {
		super();
		this.regalo = regalo;
	}

	public double getRegalo() {
		return regalo;
	}

	public void setRegalo(double regalo) {
		this.regalo = regalo;
	}
	
	 //METODOS
	
	public double calcularSaldo (boolean retirar, boolean ingresar) {
		
		if (ingresar) { 
			return getSaldo();
		}else {
			return getSaldo();
		}
	}
}
