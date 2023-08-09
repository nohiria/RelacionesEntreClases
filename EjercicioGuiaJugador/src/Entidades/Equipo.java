/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nohyv
 */
public class Equipo {
    private List<Jugador> jugadores;
    
    //Constructor
    public Equipo() {
        this.jugadores= new ArrayList<>();
    }

    //Getter&Setter
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    //toString
    @Override
    public String toString() {
        return "Equipo{" + "jugadores=" + jugadores + '}';
    }
    
}
