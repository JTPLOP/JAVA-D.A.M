package ejercicio1;

import java.util.List;

import utilidades.Leer;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		
		// DECLARAR OBJETOS
		
		Calificacion c1 = new Calificacion(100, "Mates", 1, 10);
		Calificacion c2 = new Calificacion(20, "Ingles", 1, 10);
		Calificacion c3 = new Calificacion(30, "Lengua", 1, 10);
		
		List <Calificacion> Lista = new ArrayList <Calificacion>();
		
		Gestion g1 = new Gestion (Lista);
		
		g1.agregarCalificacion(c1);
		g1.agregarCalificacion(c2);
		g1.agregarCalificacion(c3);
		
		
		//VARIABLES
		int idBuscado;
		
		
		
		System.out.println("Bienvenido usuario a este programa donde podras hacer diversas cosas.");
		
		System.out.println("\nDime un id, el que tu quieras: ");
		
		
		idBuscado = Leer.datoInt();
		
		try {
			
			System.out.println("Tus datos del id mostrado");
			
			g1.mostrarCalificacion(idBuscado);

			System.out.println("Datos almacenados:");
			System.out.println(g1.cantidadAlmacenada());
			
			
		} catch (Exception e) {
			System.err.println("Hubo un problema...");
		}
		
		
		
		
		
	}
}
