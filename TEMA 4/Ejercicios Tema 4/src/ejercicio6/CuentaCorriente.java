package ejercicio6;

import java.util.Random;

public class CuentaCorriente extends CuentasBanco{

	//ATRIBUTOS
	private double fijo;
	private int puntos; //ACUMULA PUNTITOS , METER CONDICION
	
	public CuentaCorriente(double fijo, int puntos) {
		super();
		this.fijo = fijo;
		this.puntos = puntos;
	}

	public double getFijo() {
		return fijo;
	}

	public void setFijo(double fijo) {
		this.fijo = fijo;
	}

	public double getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	//METODOS
	
	public double calcularSaldo (boolean retirar, boolean ingresar) {
		
		return getSaldo() + fijo;
	}
		
		
		public int calcularPuntos (double minimo) {
			
			int desde=0, hasta;
			
			Random r= new Random (System.nanoTime());
			if ((getSaldo() + fijo) > minimo) {
				desde = 50;
				hasta=100; 
				
				puntos= r.nextInt(hasta - desde + 1) + desde;
			}else {
				hasta=20;
				puntos= r.nextInt(hasta - desde + 1) + desde;
			}
			
			return puntos;
		
	}
	
	
}
