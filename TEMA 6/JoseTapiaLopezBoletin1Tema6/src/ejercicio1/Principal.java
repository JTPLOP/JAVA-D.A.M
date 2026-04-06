
import java.util.function.BiFunction;
import java.util.function.Function;

import utilidades.Leer;

public class Principal {

    public static void main(String[] args) {
        
        /*Realizar un programa que haga las operaciones básicas de una calculadora solo con números 
        enteros (sumar, resta, multiplicar, dividir y raíz cuadrada) teniendo en cuenta las posibles excepciones 
        que se pueden producir (entrada de datos, división por cero, raíz de un número negativo, etc.)
        */

        //Declaracion de variables

        int opcionUser;
        int num1, num2;
        double num3;

        System.out.println("Bienvenido al sistema usuario.");

        do {
            System.out.println("Indique la opcion que vas a llevar a cabo:");
            System.out.println("1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Raiz Cuadrada\n0.Salir");

            opcionUser = Leer.datoInt();

            switch (opcionUser) {

                case 1:
                    System.out.println("Se encuentra en la sección de suma, indiqueme las cantidades con las que deseas trabajar: ");

                    System.out.println("Dime el primer valor: ");
                    num1 = Leer.datoInt();

                    System.out.println("Dime el segundo valor: ");
                    num2 = Leer.datoInt();


                    BiFunction <Integer, Integer,Integer> sumar = (valor1,valor2) -> (valor1 + valor2);

                    System.out.println(sumar.apply(num1,num2));

                    break;
            

                case 2:
                    System.out.println("Se encuentra en la sección de resta, indiqueme las cantidades con las que deseas trabajar: ");

                    System.out.println("Dime el primer valor: ");
                    num1 = Leer.datoInt();

                    System.out.println("Dime el segundo valor: ");
                    num2 = Leer.datoInt();


                    BiFunction <Integer, Integer,Integer> restar = (valor1,valor2) -> (valor1 - valor2);

                    System.out.println(restar.apply(num1,num2));

                    break;

                case 3:
                    System.out.println("Se encuentra en la sección de multiplicar, indiqueme las cantidades con las que deseas trabajar: ");

                    System.out.println("Dime el primer valor: ");
                    num1 = Leer.datoInt();

                    System.out.println("Dime el segundo valor: ");
                    num2 = Leer.datoInt();


                    BiFunction <Integer, Integer,Integer> multiplicar = (valor1,valor2) -> (valor1 * valor2);

                    System.out.println(multiplicar.apply(num1,num2));

                    break;

                case 4:
                    System.out.println("Se encuentra en la sección de multiplicar, indiqueme las cantidades con las que deseas trabajar: ");

                    System.out.println("Dime el primer valor: ");
                    num1 = Leer.datoInt();

                    System.out.println("Dime el segundo valor: ");
                    num2 = Leer.datoInt();


                    BiFunction <Integer, Integer,Integer> dividir = (valor1,valor2) -> (valor1 / valor2);

                    System.out.println(dividir.apply(num1,num2));

                    break;

                case 5: 
                    System.out.println("Se encuentra en la sección de multiplicar, indiqueme las cantidades con las que deseas trabajar: ");

                    System.out.println("Dime el primer valor: ");
                    num3 = Leer.datoInt();
                
                    Function <Double, Double> raizCuadrada = valor1 -> Math.sqrt(valor1);

                    System.out.println(raizCuadrada.apply(num3));

                default:
                    break;
            }

        } while (opcionUser!=0);

    }
}