EXPLICACION DE LO REALIZADO EN EL EJEMPLO:

Lo primero que hemos hecho ha sido crear la clase y acto seguido denominar los atributos de cada clase, a esta accion realizada hemos jerarquizados los atributos.

En este caso lo que esta mostrando es el uso de las herencias, para ello nos hace ver como hemos abusado de crear atributos como "nombre, DNI..." que hemos repetido en cada clase, y aqui es donde nos 
explica que para optimizarlo utilizamos la HERENCIA. 

Tras la explicacion creamos la clase Persona

La palabra extends significa que extienda  a la clase madre Y ademas a sus atributos propios.

Sintaxis utilizada para hacer la herencia: public class (nombre clase Hija) extends (nombre clase Madre) { }


COMO HEMOS CREADO EL OBJETO EN MAIN (son iguales en todas las hijas)

1. Creamos el contructor en la clase madre (Persona)

2. Creamos en el main el objeto con los parametros necesarios: 
Ejemplo --> "Persona p1 = new Persona ("56", 11, "Paco", 41100, 6554, 1);" 
--> Esto significa que los objetos de las superclases se siguen creando igual
	
3. Vamos a la clase de la hija (la que elijamos)

4. Generamos los constructores de la subClase
Anotacion --> Cuando creemos el constructor en la subClase tendra tanto los parametros de la clase madre como la de la clase Hija

Caracteristica: los atributos de la madre se introducen en el "SUPER" 
Ejemplo --> "super(dNI, edad, nombre, codPostal, numTelefono, id);" 
El super es por asi decirlo la llamada a la clase Madre.

Ahi es donde aparece la relevancia del "super", y por eso cuando estamos en la clase "MADRE" no es necesario agregarlo.

5. Creamos el objeto de la subClase en la cual tendremos que utilizar tanto los parametros de la madre como los parametros
de la clase Hija.

11/12

Empezamos modificando la clase Profesor y para ello creamos los constructores, y lo instanciamos en el main.
Despues creamos los toString --> Cuando generemos los toString todavia no es necesario seleccionar los atributos heredados ya que a veces se buguea, por lo tanto generarlo normal.

(Lo normal es no crear objetos de la madre, pero siempre es posible). 

SIGUIENTE STEP:

Creacion y reutilizacion de metodos en las clases. Nos plantea la pregunta: se puede repetir codigo en las diferentes clases hijas?? Ahi tambien se puede utilizar 
la clase madre para heredar metodos.

Cuando creamos un metodo en la clase Madre, podremos utilizar el metodo en la clase hijo sin tener que escribir el codigo. (ejemplo en el main).

Otra perspectiva?? --> Podriamos cambiar el codigo de la clase madre desde la clase hija?? se podria cambiar la forma de calcular por asi decirlo?? 
RTA: SI --> Entra en el examen (rescribir metodo)

*Forma*: cojo el metodo de la clase madre y cambio el contenido que hay dentro de las llaves (tambien llamado cuerpo), PERO no cambia la firma del metodo ni lo que devuelve.

Para que se cumpla debe seguir las siguientes expecificaciones (misma firma): 
1. Debe devolver el mismo tipo de dato.
2. Debe tener el mismo nombre.
3. Debe tener los mismos parametros.

tengo que volver a escribir todo el codigo del metodo de la clase madre en la clase hija?? 
--> NO, se le llama al metodo. (ejemplo en profesores)

Llamamos al metodo de la clase madre con super.(nombre del metodo) 