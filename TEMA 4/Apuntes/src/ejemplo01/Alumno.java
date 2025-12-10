package ejemplo01;

public class Alumno extends Persona {

	//Vamos a coger como referencia 6 atributos basandonos en la aplicacion de qualitas sobre lo que podria llevar un alumno
	
	private int notaMedia;
	private String curso;
	private int notas [];
	
	public Alumno(String dNI, int edad, String nombre, int codPostal, int numTelefono, int id, int notaMedia,
			String curso, int[] notas) {
		super(dNI, edad, nombre, codPostal, numTelefono, id);
		this.notaMedia = notaMedia;
		this.curso = curso;
		this.notas = notas;
	}
	

	

	
}
