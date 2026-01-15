package ejercicio6;

public abstract class CuentasBanco {

	//ATRIBUTOS
	private String nomCliente;
	private double saldo;
	private int id;
	
	public CuentasBanco(String nomCliente, double saldo, int id) {
		super();
		this.nomCliente = nomCliente;
		this.saldo = saldo;
		this.id = id;
	}

	public CuentasBanco() {
		super();
	}

	public String getNomCliente() {
		return nomCliente;
	}

	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//METODOS
	
	public abstract double calcularSaldo (boolean retirar, boolean ingresar);
	
	
	
	
	
}
