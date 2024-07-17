/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feedback;

import java.io.Serializable;

/**
 *
 * @author sepy3
 */
public class Departamento implements Serializable{

    int numDep;
    String Nombre;
    String Localidad;

    public Departamento(int numDep, String Nombre, String Localidad) {
        this.numDep = numDep;
        this.Nombre = Nombre;
        this.Localidad = Localidad;
    }

    public int getNumDep() {
        return numDep;
    }

    public void setNumDep(int numDep) {
        this.numDep = numDep;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

}
