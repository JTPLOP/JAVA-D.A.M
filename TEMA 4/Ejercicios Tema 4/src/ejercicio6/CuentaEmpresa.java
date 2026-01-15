package ejercicio6;

public class CuentaEmpresa extends CuentasBanco{

	//ATRIBUTOS
	
	private double castigo;

	public CuentaEmpresa(String nomCliente, double saldo, int id, double castigo) {
		super(nomCliente, saldo, id);
		this.castigo = castigo;
	}

	public double getCastigo() {
		return castigo;
	}

	public void setCastigo(double castigo) {
		this.castigo = castigo;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [castigo=" + castigo + "]";
	}
	
	//METODOS
	
	public double calcularSaldo (boolean retirar, boolean ingresar) {
		if (retirar) { 
			return getSaldo()-castigo;
		}else {
			return getSaldo();
		}
	}
	
	
	
	
}
