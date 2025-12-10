package ejercicio07;

import java.util.Random;

public class JuegoMoneda {

	//ATRIBUTOS 
	private double resultado;
	private boolean result;
	
	
	// CONSTRUCTORES
	
	public JuegoMoneda (int resultado, boolean result) {
		this.resultado=resultado;
		this.result=result;
		
	}
	
	public JuegoMoneda () {
		
	}
	
	
	//METODOS
	
	//Lanzamiento moneda
	
	public double LanzMoneda (int desde, int hasta) {
		Random r= new Random (System.nanoTime()); //debe de estar dentro del metodo ya que no tiene nada que ver con los atributos

		
		int aleatorio, den=2;
		
		aleatorio=r.nextInt(hasta - desde +1)+desde;
		
		resultado=aleatorio%den;
		
		
		return resultado;
	}
	
	//Numero aleatorio
	
	public boolean aleatorio (int valorUsu) {
		
		int den=2;
		
		valorUsu=valorUsu%den;
		
		if (valorUsu == resultado) {
			 result=true;
			
		}else { 
			 result=false;
		}
		
		return result;
	}
	
	//MOSTRAR
	
	
	public void mostrarResultado (int valorUsu) {
		
		
		if (true == result) {
			
			if (valorUsu == 0) {
				System.out.println("Usted escogio cruz, y ha salido aleatoriamente cruz.");

			}else {
				System.out.println("Usted escogio cara, y ha salido aleatoriamente cara.");
			}
			System.out.println("\n¡Felicidades!");
		
		}else {
			
			if (valorUsu == 0) {
				System.out.println("Usted escogio cruz, y ha salido aleatoriamente cara.");

			}else {
				System.out.println("Usted escogio cara, y ha salido aleatoriamente cruz.");
			}
			System.out.println("\n¡Vuelve a intentarlo!");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
