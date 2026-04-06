/*Este paquete DAO se encargar de realizar el trabajo sucio encargado con la base de datos, no deberia tener relacion externa con el resto del
programa.

Las siglas de DAO son: Data Acces Object

Es basicamente la CAPA que se encarga de conectarse a la base de datos.

Este formato DAO es lo clasico, lo moderno seria utilizar el formato Repository enfocado en arquitectura por capas (lo veremos en SpringBoot).

En los entornos reales utilizaremos Frameworks no este formato DAO.
*/

package dao;

/*Por buenas practicas agregamos individualmente los paquetes utilizados para que al
programador le sea mas legible el codigo en el futuro. */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


import alumno.Alumno;


public class usuarioDAO {
    
    private String url = "jdbc:sqlite:mi_primera_bd.db";  //hardcodeada de normal iria en un .env, ademas no le autogenero ya que me interesa que sea privado

    /* Metodos de la clase */

    public boolean agregarUsuario (Alumno alumno) {

        /*Para llevar a cabo las buenas practicas de abrir y cerrar la base de datos por cada consulta utilizaremos el bloque de codigo
        de TRY & CATCH

        PEROOOOO este try no es igual que cualquiera ya que tiene caracteristicas especiales:

        Este se considera "try-with-resources" y nos permite realizar multiples herramientas dentro de un mismo parentesis separandolos por ";"
        
        La condicion del try se asegura de que exista la conexion a la siguiente URL (La cual fue preescrita hardcodeada)*/

        String sqlSentencia = "INSERT INTO usuarios (nombre) VALUES (?)";

        try (Connection conexion = DriverManager.getConnection(this.url) ; 
        PreparedStatement instrucciones = conexion.prepareStatement(sqlSentencia)) { //Recordar que tenemos diferentes importaciones con diferentes roles cada uno

            /*Ya hemos establecido la conexion y la funcion SQL que vamos a llevar a cabo, ahora nuestra finalidad aqui sera rellenar la informacion que va en signos de interrogacion
            en la consulta.
            
            En la clase de PreparedStatement es donde encontramos diferentes metodos para llevarlo a cabo*/


            instrucciones.setString(1, alumno.getNombre()); // el primer numero agrega el indice y el segundo es para agregar el valor.

            /*Con esto la funcion ya estaria armada, ahora solo quedaria enviar la orden 
            
            Para ello encontramos que existe execute() pero el estandar es utilizar executeUpdate()
            
            La razon para ello es que executeUpdate nos devuelve el numero de filas que fueron insertadas o modificadas.*/

            int filasModificadas = instrucciones.executeUpdate();


            // conexion.commit(); no haria falta ponerlo ya que por defecto JDBC hace automaticamente los commits 

            return filasModificadas > 0;
            
        } catch (SQLException e) {
            System.out.println("Hubo un problema al cargar la base de datos :"+e.getMessage());
            return false;
        }


    }

}
