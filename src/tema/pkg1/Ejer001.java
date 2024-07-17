/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg1;

import java.io.File;

/**
 *
 * @author sepy3
 */
public class Ejer001 {

    
    public static void main(String[] args) {
        File f = new File("cualquier/cosa/hola.doc");
        
        System.out.println("Nombre: " + f.getName());
        System.out.println("Ruta absoluta: " + f.getAbsolutePath());
        System.out.println("Directorio padre: " + f.getParent());
        System.out.println("");
    }
    
}
