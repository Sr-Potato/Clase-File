/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author sepy3
 */
public class Ejer005Importante {
    public static void main(String[] args) throws IOException {
        //Archivo de configuracion
        //Crear un archivo de config a partir de datos que introduzca el usuario
        
        Scanner teclado = new Scanner(System.in);
        
        Properties archivoConfiguracion = new Properties();
        
        System.out.println("Introduce la web: ");
        String web = teclado.nextLine();
        archivoConfiguracion.setProperty("url", web);
        
        System.out.println("Introduce prefijo de tabla: ");
        String prefijo = teclado.nextLine();
        archivoConfiguracion.setProperty("prefix", prefijo);
        
        System.out.println("Servidor de la BBDD: ");
        String server = teclado.nextLine();
        archivoConfiguracion.setProperty("server", server);
        
        archivoConfiguracion.store(new FileOutputStream("wp-conf.php"), "Mi primera archivo de config");
        
        
        //Leer archivo de configuracion
        
        archivoConfiguracion.load(new FileInputStream("wp-conf.php"));
        String servidor = archivoConfiguracion.getProperty("server");
        System.out.println("Servidor de la BBDD: "+servidor);
        
        String dominio = archivoConfiguracion.getProperty("url");
        System.out.println("El dominio es " + dominio);
    }
}
