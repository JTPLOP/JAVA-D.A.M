package ejercicio6;

import java.util.Arrays;

public class Oficina {

	//ATRIBUTOS
	private Clientes [] lista;

	public Oficina(Clientes[] lista) {
		super();
		this.lista = lista;
	}

	public Clientes[] getLista() {
		return lista;
	}

	public void setLista(Clientes[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}
	
	public double calcularDineroCuentas () {
		
		double total=0;
		
		for (int i = 0; i < lista.length; i++) {
			
			if (lista[i] != null) {
			total+=lista[i].getCuentas().getSaldo();
			}else {
			
			}
		}
		return total;
	}
	
	public double calcularRascada (Clientes [] retiradas) {
		
		double total = 0;
		
		
		
		return 0;
	}
	
}
