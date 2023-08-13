/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author nohyv
 */
public class Baraja {
    ArrayList<Carta> cartas;
    
    //Constructor
    public Baraja() {
        cartas= new ArrayList<>();
    }
    
    //Getters&Setters

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    
    //toString
    @Override
    public String toString(){
        return "Baraja{" + "cartas=" + cartas + '}';
    }
}
