/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
            Carta carta= baraja.get(0);
            System.out.println("La siguiente carta es: "+carta.toString());
            return carta;
        }
    }
    
    public void cartasDisponibles(){
        System.out.println(baraja.size()+" cartas disponibles para repartir");
    }
    
    public void darCartas(int cartasARetirar){
        if(cartasARetirar>baraja.size()){
            if(baraja.isEmpty()){
                System.out.println("No hay cartas para repartir");
            }else{
                System.out.println("No hay suficientes cartas");
            }
            cartasDisponibles();
        }else{
            for(int i=0; i<cartasARetirar; i++){
                Carta carta= baraja.remove(0);
                monton.add(carta);
            } 
        }
    }
    
    public void mostrarBaraja(){
        baraja.forEach((carta) -> {
            System.out.println(carta.toString());
        });
    }
    
    public void mostrarMonton(){
        monton.forEach((carta) -> {
            System.out.println(carta.toString());
        });
    }
    
    public void menu(){
        Scanner input= new Scanner(System.in);
        String respuesta= "";
        
        do{
            System.out.println("MENÚ");
            System.out.println("1. Barajar mazo");
            System.out.println("2. Ver siguiente carta");
            System.out.println("3. Pedir cartas");
            System.out.println("4. Ver cartas en el mazo");
            System.out.println("5. Ver cartas entregadas");
            System.out.println("Elije una opción");
            int opcion= Integer.parseInt(input.nextLine());
            switch(opcion){
                case 1:
                    barajarCartas();
                    break;
                case 2:
                    siguienteCarta();
                    break;
                case 3:
                    System.out.println("Ingrese cuántas cartas desea retirar del mazo");
                    int cartasARetirar= Integer.parseInt(input.nextLine());
                    darCartas(cartasARetirar);
                    break;
                case 4:
                    cartasDisponibles();
                    mostrarBaraja();
                    break;
                case 5:
                    mostrarMonton();
            }
            System.out.println("¿Desea volver al menú? s/n");
            respuesta= input.nextLine();
            if(respuesta.equalsIgnoreCase("n")){
                System.out.println("Programa finalizado");
            }
        }while(!respuesta.equalsIgnoreCase("n"));
    }
}
