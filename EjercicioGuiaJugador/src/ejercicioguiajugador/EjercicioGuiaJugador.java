/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguiajugador;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;

/**
 *
 * @author nohyv
 */
public class EjercicioGuiaJugador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugador1= new Jugador("Nohiria", "Velazquez", "defensa", 18);
        Jugador jugador2= new Jugador("Sergio", "Arce", "delantero", 12);
        
        ArrayList<Jugador> jugadores= new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        
        Equipo equipo= new Equipo();
        equipo.setJugadores(jugadores);
        
        System.out.println(equipo.toString());
    }
    
}
