package ejercicio01;

public class Profesor {

	private String nombreApellidos;
	private int id;
	private int tiempoPasado;
	private int horasTrabajo;
	
	public Profesor(String nombreApellidos, int id, int tiempoPasado, int horasTrabajo) {
		super();
		this.nombreApellidos = nombreApellidos;
		this.id = id;
		this.tiempoPasado = tiempoPasado;
		this.horasTrabajo = horasTrabajo;
	}
	public Profesor() {
		super();
	}
	public String getNombreApellidos() {
		return nombreApellidos;
	}
	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTiempoPasado() {
		return tiempoPasado;
	}
	public void setTiempoPasado(int tiempoPasado) {
		this.tiempoPasado = tiempoPasado;
	}
	public int getHorasTrabajo() {
		return horasTrabajo;
	}
	public void setHorasTrabajo(int horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}
	@Override
	public String toString() {
		return "Profesor [nombreApellidos=" + nombreApellidos + ", id=" + id + ", tiempoPasado=" + tiempoPasado
				+ ", horasTrabajo=" + horasTrabajo + "]";
	}
	
	//METODO CALCULAR SUEDO
	
	public double calcularSueldo (double cantidad, double porcentaje){
		double sueldo;
		int den=100;
		sueldo = (horasTrabajo*cantidad);
		
		sueldo-=(sueldo*porcentaje/den);
		
		return sueldo;
	}
	
	
	
	
	
}
