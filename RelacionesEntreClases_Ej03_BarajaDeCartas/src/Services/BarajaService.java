/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Baraja;
import Entities.Carta;
import Enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class BarajaService {
    private Baraja mazo= new Baraja();
    private Baraja monton= new Baraja();
    
    public Baraja crearBaraja() {
        //Se crean los mazos de cartas
        ArrayList<Carta> cartasEntrada= new ArrayList<>();
        ArrayList<Carta> cartasSalida= new ArrayList<>();
        
        for(Palo palo: Palo.values()){
            for(int i=1; i<13; i++){
                if(i!=8&&i!=9){
                    cartasEntrada.add(new Carta(i, palo));
                }
            }
        }
        mazo.setCartas(cartasEntrada); //Se asignan las cartas creadas al mazo
        monton.setCartas(cartasSalida); //Se asigna la lista vacía correspondiente al montón
        System.out.println("Baraja creada");
        barajarCartas();
        return mazo;
    }
    
    public void barajarCartas(){
        Collections.shuffle(mazo.getCartas());
    }
    
    public Carta siguienteCarta(){
        if(mazo.getCartas().isEmpty()){
            System.out.println("No hay más cartas en la baraja");
            return null;
        }else{
            Carta carta= mazo.getCartas().get(0);
            System.out.println("La siguiente carta es: "+carta.toString());
            return carta;
        }
    }
    
    public void cartasDisponibles(){
        System.out.println(mazo.getCartas().size()+" cartas disponibles para repartir");
    }
    
    public void darCartas(int cartasARetirar){
        if(cartasARetirar>mazo.getCartas().size()){
            if(mazo.getCartas().isEmpty()){
                System.out.println("No hay cartas para repartir");
            }else{
                System.out.println("No hay suficientes cartas");
            }
            cartasDisponibles();
        }else{
            for(int i=0; i<cartasARetirar; i++){
                Carta carta= mazo.getCartas().remove(0);
                monton.getCartas().add(carta);
            } 
        }
    }
    
    public void mostrarBaraja(){
        mazo.getCartas().forEach((carta) -> {
            System.out.println(carta.toString());
        });
    }
    
    public void mostrarMonton(){
        monton.getCartas().forEach((carta) -> {
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
