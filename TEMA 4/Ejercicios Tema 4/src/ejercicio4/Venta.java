package ejercicio4;

import java.util.Arrays;

public class Venta {

	//ATRIBUTO
	private LineaDeVenta lista [];

	

	public LineaDeVenta[] getLista() {
		return lista;
	}

	public void setLista(LineaDeVenta[] lista) {
		this.lista = lista;
	}

	public Venta(LineaDeVenta[] lista) {
		super();
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	
	//METODOS
	
	public double calcularProductos () {
		double total=0;
		for (int i = 0; i < lista.length; i++) {
			total+=lista[i].calcularSubTotal();
		}
		
		return total;
	}
	
	public double calcularUna(Producto p) {
		// TODO Auto-generated method stub

		return p.calcularPrecio();
	}
	
	
	public void imprimirTicket() {
		// TODO Auto-generated method stub

	}
	
	
	//METODOS
	//BUSCAR POR ID
	// FILTRAR PRECIO MAS ALTO
	//DESCUENTO Al producto mas caro MAS ALTA DE 20%
	// Producto mas vendido
	
	
	public int buscarID (int id) {
		
		boolean encontrado =false;
		int i=0; 
		
		
		while (!encontrado && i == lista.length) {
			
			if (id == lista[i].getP().getId() && lista[i] != null) {
				encontrado = true;
				return i;
			} else {
				i++;
			}
		}
		return -1;

	}
	
	public int filtrarPrecioMayor () {
		
		double max;
		int saveID = lista[0].getP().getId();
		max = lista[0].getP().calcularPrecio();
		for (int i = 0; i < lista.length; i++) {
			if (max < lista[i].getP().calcularPrecio()) {
				max = lista[i].getP().calcularPrecio();
				saveID = lista[i].getP().getId();
			}
		}
		
		return buscarID(saveID);
	}
	
	public double descuentoMayorP (double descuento) {
		int den =100;
		return lista[filtrarPrecioMayor()].getP().calcularPrecio() - (lista[filtrarPrecioMayor()].getP().calcularPrecio() * descuento/den );
	}
	
	public int productMasVendido () {
		
		double max= lista [0].getCantidad();
		int saveID = lista [0].getP().getId();
		
		for (int i = 0; i < lista.length; i++) {
			if (max < lista[i].getCantidad()) {
				max = lista [i].getCantidad();
				saveID= lista [i].getP().getId();
			}		
		} 
		
		return buscarID(saveID);
	}
	
	
	
} 
