package ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Gestion {

	// ATRIBUTOS DE GESTIONADOR DE NOTAS
	
	List <Calificacion> ListAsignaturas = new ArrayList <Calificacion>();

	public Gestion(List<Calificacion> listAsignaturas) {
		super();
		ListAsignaturas = listAsignaturas;
	}
	
	
	public int buscarIDCalificacion (int idBuscado) {
		
		for (int i = 0; i < ListAsignaturas.size(); i++) {
			
			if (idBuscado == ListAsignaturas.get(i).getIdMateria()) {
				return i;
				
			}
		}
		
		return -1;
		
	}
	
	public int cantidadAlmacenada () {
		return ListAsignaturas.size();
	}
	
	// CRUD
	
	public boolean agregarCalificacion (Calificacion cal) {
		
		return ListAsignaturas.add(cal);
		
	}
	
	public Calificacion eliminarCalificacion (int idBuscado) {
		
		return ListAsignaturas.remove(buscarIDCalificacion(idBuscado));
	}
	
	public void mostrarCalificacion (int idBuscado) {
		ListAsignaturas.get(buscarIDCalificacion(idBuscado)).mostrarDatos();
	}
	
		
}
