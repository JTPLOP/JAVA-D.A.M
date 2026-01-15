package ejercicio6;

public class Clientes {

	//ATRIBUTOS
	private CuentasBanco cuentas;

	public Clientes(CuentasBanco cuentas) {
		super();
		this.cuentas = cuentas;
	}

	public CuentasBanco getCuentas() {
		return cuentas;
	}

	public void setCuentas(CuentasBanco cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "Clientes [cuentas=" + cuentas + "]";
	}
	
	//METODOS
	
	//RETIRAR DINERO
	
	public double retirarDinero (double cantSeleccionada, boolean retirar, boolean ingresar) {
		
		return cuentas.calcularSaldo(retirar, ingresar) - cantSeleccionada; 
		
	}
	
	public double ingresarDinero (double cantSeleccionada, boolean retirar, boolean ingresar) {
		
		return cuentas.calcularSaldo(retirar, ingresar) + cantSeleccionada; 
	}
	
}
