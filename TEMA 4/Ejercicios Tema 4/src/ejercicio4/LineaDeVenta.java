package ejercicio4;

public class LineaDeVenta {

	//ATRIBUTOS
	private Producto p;
	private double cantidad;
	public LineaDeVenta(Producto p, double cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}
	public Producto getP() {
		return p;
	}
	public void setP(Producto p) {
		this.p = p;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "LineaDeVenta [p=" + p + ", cantidad=" + cantidad + "]";
	}
	
	//METODOS
	
	
	public double calcularSubTotal() {
		// TODO Auto-generated method stub
		
		return cantidad*p.calcularPrecio();
		
	}
}
