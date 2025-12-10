package ejercicio09;


import java.util.Random;


public class SorteoLoteria {

	
	//METODOS
	
	//Random
	
	public int crearRandom (int desde, int hasta) {
		int numRandom;
		
		Random r= new Random (System.nanoTime());		
		
		numRandom = r.nextInt(hasta - desde +1) +desde;
		
		return numRandom;
	}
	
	//CREAR BOLETO ALEATORIO
	
	public int crearBoleto (int crearRandom) {
		int valorBoleto;
		
		valorBoleto=crearRandom;
		
		return valorBoleto;
	}
	
	//MOSTRAR BOLETO
	
	public void mostrarBoleto (int [] boleto) {
		
		System.out.println("El boleto seleccionado fue: ");
		
		for (int j = 0; j < boleto.length; j++) {
			System.out.print(boleto[j]);
		}
		System.out.println();
	}


	// ganador
	public boolean descubrirGanador (int [] boleto, int [] sorteo) {
		
		boolean resultado=true;
		
		for (int i = 0; i < sorteo.length; i++) {
			
			if (boleto [i] == sorteo [i]) {
				resultado= true;
				return resultado;
			}else {
				resultado = false;
				i=sorteo.length;
				return resultado;
			}
			
		}
		return resultado;
	}
	
	public void mostrarGanador (boolean descubrirGanador) {
		
		if (descubrirGanador) {
			System.out.println("Usted ha logrado conseguir el boleto ganador.");
		}else {
			System.out.println("Usted no ha logrado conseguir el boleto ganador.");
		}
		
		
	}
	
	
	
}