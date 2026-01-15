package ejemplo_polimorfismo;

public class OperacionesFIguras {
	
	
	
	public double calcularElAreaDeUnaFigura (Figura figurita) {
	return figurita.calcularArea();
	}
	
	public double calcularElPerimetroDeUnaFigura (Figura figurita) { 
	return figurita.calcularPerimetro();
	}
	
	public double sumarAreas (Figura [] listado) {
		
		double resultado = 0;
		
		for (int i = 0; i < listado.length; i++) {
			resultado+=calcularElAreaDeUnaFigura(listado[i]);
		}
		
		
		
		return resultado;
	}
	
	
	
	
	
}

	
		
			
				
					
						
							
							
								