package tema.pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer004 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Programa que hace una copia de un archivo a otro
        //Copia de un fichero de caracteres osea que FileReader FileWriter

        //Buffer linea a linea
        File fichero = null;
        File copia = null;
        FileReader fe = null;
        FileWriter fs = null;
        BufferedReader buffer = null;

        fichero = new File("AnoMariano.txt");//Sipodemos saber el tamañoi del archivo con 1´s y 0´s
        fe = new FileReader(fichero);
        
        copia = new File("mP.txt");
        fs = new FileWriter(copia,true);

        buffer = new BufferedReader(fe);

        //Leer
        String linea = null;
        while ((linea = buffer.readLine()) != null) {
            fs.append(linea);
            fs.write("\n");
        }
        fs.close();
        fe.close();
    }
}
