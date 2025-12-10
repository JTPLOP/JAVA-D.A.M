package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1,num2;
		
		System.out.println("Buenas, este programa te ayudara a determinar la relacion entre los valores. \nPodrias introducirme el primer numero: ");
		num1=Leer.datoDouble();
		System.out.println("Perfecto, podrias indicarme el siguiente valor: ");
		num2=Leer.datoDouble();
		
		if (num1 == num2) {
			System.out.printf("El valor %.1f es igual que %.1f",num1,num2);
		}else {
			if (num1 > num2) {
				System.out.printf("El valor %.1f es mayor que %.1f",num1,num2);
			}else {
				System.out.printf("El valor %.1f es menor que %.1f",num1,num2);
			}
		}
		System.out.println("\nMuchas gracias por utilizarnos.");
	}

}