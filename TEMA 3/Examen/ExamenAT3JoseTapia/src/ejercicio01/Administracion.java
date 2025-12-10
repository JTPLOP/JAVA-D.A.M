package ejercicio01;

import java.util.Arrays;

public class Administracion {

	private Profesor [] lista;
	private double presupuestoTotal;
	
	public Administracion(Profesor[] lista, double presupuestoTotal) {
		super();
		this.lista = lista;
		this.presupuestoTotal = presupuestoTotal;
	}

	public Profesor[] getLista() {
		return lista;
	}

	public void setLista(Profesor[] lista) {
		this.lista = lista;
	}

	public double getPresupuestoTotal() {
		return presupuestoTotal;
	}

	public void setPresupuestoTotal(double presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}

	public String toString() {
		return "Administracion [lista=" + Arrays.toString(lista) + ", presupuestoTotal=" + presupuestoTotal + "]";
	}
	
	//METODOS EXAMEN
	
	//METODO 1 
	
	public Profesor agregarLista (int numProfesores, Profesor p1) {
		
		lista [numProfesores] = p1;
		
		return lista[numProfesores];
	}
	
	
	//METODO 2
	
	public int findByID (int busqueda, int numProfesores) {
		
		boolean encontrado=false;
		int i=0;
		
		
		while (i < numProfesores && !encontrado) {
			if (lista[i].getId() == busqueda) {
				
				encontrado = true;
			}else {
				i++;
			}
		}
		if (encontrado) {
			return i;
		}else { 
			
			return -1;
		}
	}
	
	//METODO 3
	
	public Profesor[] buscarByAnnyos (int filtro, int numProfesores) {
		
		Profesor [] listaAux = new Profesor [lista.length];
		
		for (int i = 0; i < listaAux.length; i++) {
			
			if (lista[i].getTiempoPasado() > filtro) {
				listaAux[i] = lista [i];	
				
			}
		}
		
		return listaAux;
	}
	
	
		
	
	
		
	//METODO 4
		
	public double calcularGastos (int numProfesores, double cantidad, double porcentaje, int tiempoSoli) {
		
		double gasto=0;
		
		for (int i = 0; i < numProfesores; i++) {
			
			if (lista[i].getTiempoPasado() == tiempoSoli) {
				gasto+=lista[i].calcularSueldo(cantidad, porcentaje);
			}
			
		}
		
		return gasto;
		
	}
		
	//METODO 5
	
	public void comprobarSueldo (int id, double cantidad, double porcentaje, double cantMin, int numProfesores) {
		
		if (lista[findByID(id, numProfesores)].calcularSueldo(cantidad, porcentaje) > cantMin) {
			System.out.println("Este mes comemos jamón\n");
		}else {
			System.out.println("Este mes comemos choped\n");
		}
		
	}
	
	//METODO 6
	
	public void modificarHoras (int id, int horas, int numProfesores) {
		
		lista[findByID(id, numProfesores)].setHorasTrabajo(horas);
		
	}
	
	//METODO 7
	
	public double calcularPresupuesto (int numProfesores, double cantidad, double porcentaje) {
		
		double gastosPagas=0;
		
		for (int i = 0; i < numProfesores; i++) {
			gastosPagas+=lista[i].calcularSueldo(cantidad, porcentaje);
		}
		
		return gastosPagas;
	}
	
	//METODO 8
	
	public void mostrarProfesores (int numProfesores, double cantidad, double porcentaje) {
		
		for (int i = 0; i < numProfesores; i++) {
			System.out.println("---------------------------");
			System.out.println("Nombre: "+lista[i].getNombreApellidos());
			System.out.println("Num. Identificador: "+lista[i].getId());
			System.out.println("Años de antigüedad: "+lista[i].getTiempoPasado());
			System.out.println("Horas Trabajadas: "+lista[i].getHorasTrabajo());
			System.out.println("Sueldo: "+lista[i].calcularSueldo(cantidad, porcentaje));
			System.out.println("---------------------------\n");
	
		}
		
	}
	
	public double calcularPorcentaje (int id, int numProfesores, double porcentaje, double presupuesto, double cantidad) {
		
		double porcPresupuesto;
		int den=100;
		porcPresupuesto= lista[findByID(id, numProfesores)].calcularSueldo(cantidad, porcentaje)*den/presupuesto;
		
		return porcPresupuesto;
		
	}
	
	
	
}
