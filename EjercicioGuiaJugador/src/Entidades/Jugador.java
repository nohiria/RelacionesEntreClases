/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author nohyv
 */
public class Jugador {
    private String nombre;  
    private String apellido;  
    private String posicion;
    private int num;
    
    //Constructores
    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String posicion, int num) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.num = num;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    //toString

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", num=" + num + '}';
    }
    
}
