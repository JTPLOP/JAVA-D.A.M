 package ejercicio1;

public class GestionFamiliar {

	private Hijo [] lista;
	private double presupuestoTotal;
	
	public GestionFamiliar(Hijo[] lista, double presupuestoTotal) {
		super();
		this.lista = lista;
		this.presupuestoTotal = presupuestoTotal;
	}

	public GestionFamiliar() {
		super();
	}

	public Hijo[] getLista() {
		return lista;
	}

	public void setLista(Hijo[] lista) {
		this.lista = lista;
	}

	public double getPresupuestoTotal() {
		return presupuestoTotal;
	}

	public void setPresupuestoTotal(double presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}
	
	//METODOS
	
	//AGREGAR UN HIJO A LA LISTA
	
	public void agregarHijo (int numHijos, Hijo h1) {
		
		 lista [numHijos] = h1;
	}
	
	
	//METODO BUSCAR HIJO
	
	public void buscarHijo (int id, int numHijos) {
		
		int i=0;
		boolean encontrado=false;
		
		while (i < numHijos && !encontrado) {
			
			
			if (lista[i].getId() == id) {
				encontrado=true;
			}else {
				encontrado=false;
				i++;
			}
			
		}
		
		if (encontrado) {
			System.out.println("El hijo que ha buscado es: "+lista[i].getNombre()+"\n");
		}else {
			System.out.println("El hijo que esta buscando no existe.\n");
		}
		
		
		
	}
	
	//BUSCAR MENORES DE 14 
	
	public void filtrarEdad (int edad, int numHijos) {
		
		Hijo menores [] = new Hijo [lista.length];
		int numMenores=0;
		for (int i = 0; i < numHijos; i++) {
			
			if (lista[i].getEdad() < edad && lista[i] != null) {
				menores[i]= lista[i];
				numMenores++;
			}
		}
		
		if(numMenores == 0) {
			System.out.println("No hay menores de edad.\n");
		}else {
		System.out.println("Los menores de "+edad+" años son: ");
			for (int i = 0; i < numHijos; i++) {
			System.out.println("Nombre: "+menores[i].getNombre()+", Edad: "+menores[i].getEdad()+"\n");
			}
		}
		
	}
	
	
	//CALCULAR PAGA MAYORES
	
	public double calcularPagaMayores (int edad, int numHijos, double cantDinero, double porcentaje) {
		
		Hijo mayores [] = new Hijo [lista.length];
		int numMayores=0;
		double gasto=0;
		for (int i = 0; i < numHijos; i++) {
			
			if (lista[i].getEdad() > edad && lista[i] != null) {
				mayores[i]= lista[i];
				
				gasto+=mayores[i].calcularPaga(cantDinero, porcentaje);
				numMayores++;
			}
		}
		
		return gasto;
		
	}
	
	// MODIFICAR HORAS ESTUDIADAS
	
	public void modificarHoras (int nuevasHoras, int hijo) {
		
		 lista[hijo].setHorasSemanales(nuevasHoras);
	}
	
	//COMPROBAR DINERO RESTANTE
	
	public double calcularPresupuesto (int numHijos, double cantDinero, double porcentaje) {
		double gasto=0;
		
		for (int i = 0; i < numHijos; i++) {
			
			if (lista[i] != null) {
				gasto+=lista[i].calcularPaga(cantDinero, porcentaje);
			}
		}
			return gasto;
	}
	
	//LISTAR HIJOS
	
	public void listarHijos (int numHijos) {
		
		for (int i = 0; i < numHijos; i++) {
			
			System.out.println("-------------------------");
			System.out.println("Nombre: "+lista[i].getNombre());
			System.out.println("Id: "+lista[i].getId());
			System.out.println("Edad: "+lista[i].getEdad());
			System.out.println("Horas semanales: "+lista[i].getHorasSemanales());
			System.out.println("-------------------------\n");
			
		}
		
		
		
	}
	
	
	
	
	
	
}
