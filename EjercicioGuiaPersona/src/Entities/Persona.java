/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author nohyv
 */
public class Persona {
    private String nombre;
    private String apellido;
    private DNI numDni;
    
    //Constructor
    public Persona() {
    }

    public Persona(String nombre, String apellido, DNI numDni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDni = numDni;
    }
    
    //Getters&Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public DNI getNumDni() {
        return numDni;
    }

    public void setNumDni(DNI numDni) {
        this.numDni = numDni;
    }

    //toString
    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + nombre + ", Apellido=" + apellido + ", numDni=" + numDni.toString() + '}';
    }
    
    
}
