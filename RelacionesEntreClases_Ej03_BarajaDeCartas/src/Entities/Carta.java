/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Enums.Palo;

/**
 *
 * @author nohyv
 */
public class Carta {
    private Integer num;
    private Palo palo;
    
    //Constructor
    public Carta() {
    }

    public Carta(Integer num, Palo palo) {
        this.num = num;
        this.palo = palo;
    }
    
    //toString
    @Override
    public String toString() {
        return "Carta{" + num + " de " + palo + '}';
    }
    
}
