/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author nohyv
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    
    //Constructors
    public Juego(){
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    
    //Getters&Setters
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    //Methods
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver){
        this.jugadores=jugadores;
        this.revolver= revolver;
    }

    public boolean ronda(int turno){
        boolean continuarJuego= true;
        jugadores.get(turno).disparo(revolver);
        if(jugadores.get(turno).isMojado()){
            continuarJuego= false;
        }
        return continuarJuego;
    }
}
