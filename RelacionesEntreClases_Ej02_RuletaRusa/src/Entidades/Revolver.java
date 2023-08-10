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
public class Revolver {
    private Integer posicionActual;
    private Integer posicionAgua;
    
    //Constructors
    public Revolver() {
    }

    public Revolver(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }
    
    //Getters&Setters
    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    //toString 
    @Override    
    public String toString(){
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    //Methods
    public void llenarRevolver() {
        posicionActual= (int) (Math.random()*6+1);
        posicionAgua= (int) (Math.random()*6+1);
    }
    
    public boolean mojar(){
        return posicionActual==posicionAgua;
    }
    
    public void siguienteChorro(){
        if(posicionActual==6){
            posicionActual=1;
        }else{
            posicionActual++;
        }
    }
}
