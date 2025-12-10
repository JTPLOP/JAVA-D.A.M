package ejemploOperaciones;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total;
		int num1,num2;
		
		Operaciones op= new Operaciones();
		
		total=op.sumarEnteros(5, 10); 
		
		//Impresion suma;
		System.out.println(total);
	
		
		total=op.restarEnteros(4, 5);
		
		//impresion restar
		System.out.println(total);
		
		
		System.out.println("Estcriba num 1");
		num1=Leer.datoInt();
		
		System.out.println("Escriba num2");
		num2=Leer.datoInt();
		
		total=op.dividirEnteros(num1, num2);
		
		
		//imprimir divi
		System.out.println(total);
	
	
	}

}
