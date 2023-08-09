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
public class DNI {
    private char letra;
    private int numero;
    
    //Constructors
    public DNI() {
    }

    public DNI(char letra, int numero) {
        this.letra = letra;
        this.numero = numero;
    }
    
    //Getters&Setters
    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //toString
    @Override
    public String toString() {
        return letra + "-" + numero;
    }
    
}