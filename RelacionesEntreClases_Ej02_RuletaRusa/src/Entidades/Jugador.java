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
    private Integer id;
    private String nombre;
    private boolean mojado;
    
    //Constructors
    public Jugador() {
    }

    public Jugador(Integer id) {
        this.id = id;
        String idNombre= id.toString();
        idNombre= "Jugador ".concat(idNombre);
        this.nombre= idNombre;
        this.mojado= false;
    }
    
    //Getters&Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    //Methods
    public boolean disparo(Revolver r){
        if(r.mojar()){
            mojado= true;
            return true;
        }
        r.siguienteChorro();
        return false;
    }
    
}
