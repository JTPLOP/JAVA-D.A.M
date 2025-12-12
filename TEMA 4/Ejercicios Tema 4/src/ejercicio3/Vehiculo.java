package ejercicio3;

public class Vehiculo {
 
	private boolean ceroEmi;
	private boolean eCO;
	private boolean tipoB;
	private boolean tipoC;
	
	public Vehiculo(boolean ceroEmi, boolean eCO, boolean tipoB, boolean tipoC) {
		super();
		this.ceroEmi = ceroEmi;
		this.eCO = eCO;
		this.tipoB = tipoB;
		this.tipoC = tipoC;
	}


	public Vehiculo() {
		super();
	}


	//METODOS
	public double calcularPrecio (double impuesto) {
	//VARIABLES
	double ceroEmiTarif=0.4, eCoTarif=0.6, tipoBTarif=1.3, tipoCTarif=1.6;
	double gasto = 0;
		
		if (ceroEmi) {
			gasto=impuesto*ceroEmiTarif;
		}else if (eCO) {
			gasto=impuesto*eCoTarif;
		}else if (tipoB) {
			gasto=impuesto*tipoBTarif;
		}else if (tipoC) {
			gasto=impuesto*tipoCTarif;
		}
		
		return gasto;
	}
	
}
