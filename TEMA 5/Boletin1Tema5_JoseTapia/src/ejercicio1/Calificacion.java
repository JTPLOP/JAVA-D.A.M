package ejercicio1;

public class Calificacion {

	// ATRIBUTOS DE CALIFICACION
	
	private int idMateria;
	private String materia;
	private int curso;
	private double calificacion;
	

	public Calificacion(int idMateria, String materia, int curso, double calificacion) {
		super();
		this.idMateria = idMateria;
		this.materia = materia;
		this.curso = curso;
		this.calificacion = calificacion;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	
	// METODOS
	
	public void mostrarDatos () {
		
		System.out.println("Materia: "+this.materia);
		System.out.println("Curso: "+this.curso);
		System.out.println("Calificacion: "+this.calificacion);
		
	}
	
	
}
