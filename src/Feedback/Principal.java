/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feedback;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 1:17:31
 *
 * @author sepy3
 */
public class Principal {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        /*File fichero = new File("departamentos.dat");
         FileOutputStream fs = new FileOutputStream(fichero, false);

         //DataInputStream y DataOutputStream
         DataOutputStream datosSalida = new DataOutputStream(fs);
         datosSalida.writeInt(1000);
         datosSalida.writeUTF("Matematicas");
         datosSalida.writeUTF("Sevilla");

         //Leer
         FileInputStream fe = new FileInputStream("departamentos.dat");
         DataInputStream datosEntrada = new DataInputStream(fe);

         int num = datosEntrada.readInt();
         String nom = datosEntrada.readUTF();
         String localid = datosEntrada.readUTF();

         System.out.println(num + " " + nom + " " + localid);*/
        //ObjectInputStream y ObjectOutputStream
        File ficheroObjetos = new File("departamentosObjetos.dat");

        Departamento d1 = new Departamento(1000, "Matematicas", "Sevilla");
        Departamento d2 = new Departamento(2000, "Fisica", "Barcelona");
        Departamento d3 = new Departamento(3000, "Informatica", "Madrid");
        Departamento d4 = new Departamento(4000, "Biologia", "Malaga");

        FileOutputStream fs = new FileOutputStream(ficheroObjetos);
        ObjectOutputStream ObjetosSalida = new ObjectOutputStream(fs);

        ObjetosSalida.writeObject(d1);
        ObjetosSalida.writeObject(d2);
        ObjetosSalida.writeObject(d3);
        ObjetosSalida.writeObject(d4);

        fs.close();
        ObjetosSalida.close();

        FileInputStream fe = new FileInputStream(ficheroObjetos);
        ObjectInputStream objetoEntrada = new ObjectInputStream(fe);
        Departamento d5 = new Departamento(6000, "Filosofia", "Almeria");

        try {
            while (true) {
                d5 = (Departamento) objetoEntrada.readObject();
                System.out.println(d5.numDep + " " + d5.Nombre + " " + d5.Localidad);
            }
        } catch (IOException e) {
            objetoEntrada.close();
            fe.close();
        }

    }

}

