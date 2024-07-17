/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author sepy3
 */
public class Ejer002 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fs = null;
        FileInputStream fe = null;
        byte[] buffer = new byte[81];
        int nbytes;
        int nbytes2;
        //File fichero = new File();
        
        //nbytes sera el tamaño de la entrada de datos.
        System.out.println("Introduce el texto... se gestiona como binario");
        nbytes = System.in.read(buffer);
        System.out.println("El tamaño es de "+nbytes);
        
        //Crear flujo salida
        fs = new FileOutputStream("AnoMariano.txt");
        //Salida al fichero binario
        fs.write(buffer, 0, nbytes);
        
        //Crear flujo entrada
        fe = new FileInputStream("AnoMariano.txt");
        //Leer el fichero binario
        nbytes2 = fe.read(buffer, 0 ,nbytes);
        
        String cadena = new String(buffer, 0 ,nbytes2);
        
        System.out.println(cadena);
        
    }
}
