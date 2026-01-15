package ejemplo_polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperacionesFIguras op = new OperacionesFIguras();
		
		Cuadrado cu1 = new Cuadrado ("Primer cuadrado", "Rojo", 1);
		Circulo cir1 = new Circulo ("Primer circulo", "Azul", 2);
		
		Figura f1= new Cuadrado ("Segundo cuadrado", "verde", 2.0);
		Figura f2= new Circulo ("Segundo círculo", "Amarillo", 2.0);
	
		
		//PRUEBA FIGURAS
		Figura lista [] = new Figura [4];
		
		
		System.out.println(cu1);
		System.out.println(cir1);
		
		System.out.println("*********Área y perímetro**********");
		System.out.println("Área del primer cuadrado: "+cu1.calcularArea());
		System.out.printf("Perímetro del primer círculo: %.2f",cir1.calcularArea());
		
		// PRUEBA POLIMORFISMO 

		System.out.println(f1);
		System.out.println(f2);
		System.out.println("*********Áreas**********");
		System.out.println("Usan el método de cada clase concreta porque está sobrescrito");
		System.out.println("Área del segundo cuadrado: "+f1.calcularArea());
		System.out.printf("Perímetro del segundo círculo: %.2f",f2.calcularArea());		
		
		//INSTANCIAMOS OBJETOS
		
		lista [0] = new Cuadrado ("Un misero cuadrado", "negro", 4);
		lista [1] = new Circulo ("Un misero circulo", "blanco", 1);
		lista [2] = new Cuadrado ("Un hola para version cuadrado", "amarillo y azul", 43);
		
		op.sumarAreas(lista);
		op.calcularElAreaDeUnaFigura(lista[1]);
		
		//CASTEAMOS FIGURAS
		
		
		if (f2 instanceof Circulo)
			((Circulo)f2).metodoSoloDeFigura(); 
			
		
		
	}
	
}
