/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Enums.Palo;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author nohyv
 */
public class Baraja {
    ArrayList<Carta> baraja;
    ArrayList<Carta> monton;
    
    //Constructor
    public Baraja() {
        baraja= new ArrayList<>();
        monton= new ArrayList<>();
        crearBaraja();
    }
    
    private void crearBaraja(){
        for(Palo palo: Palo.values()){
            for(int i=1; i<13; i++){
                if(i!=8&&i!=9){
                    baraja.add(new Carta(i, palo));
                }
            }
        }
        barajarCartas();
    }
    
    public void barajarCartas(){
        Collections.shuffle(baraja);
    }
    
    public Carta siguienteCarta(){
        if(baraja.isEmpty()){
            System.out.println("No hay más cartas en la baraja");
            return null;
        }else{
            Carta carta= baraja.remove(0);
            monton.add(carta);
            return carta;
        }
    }
    
    public void cartasDisponibles(){
        System.out.println(baraja.size()+" cartas disponibles para repartir");
    }
    
    public ArrayList<Carta> darCartas(int cartasRequeridas){
        if(cartasRequeridas>baraja.size()){
            if(baraja.isEmpty()){
                System.out.println("No hay cartas para repartir");
            }else{
                System.out.println("No hay suficientes cartas");
            }
            return null;
        }else{
           ArrayList<Carta> cartas= new ArrayList<>();
            for(int i=0; i<cartasRequeridas; i++){
                cartas.add(siguienteCarta());
            } 
            return cartas;
        }
    }
    
    public void mostrarBaraja(){
        baraja.forEach((carta) -> {
            System.out.println(carta.toString());
        });
    }
}
