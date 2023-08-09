/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguiapersona;

import Entities.DNI;
import Entities.Persona;

/**
 *
 * @author nohyv
 */
public class EjercicioGuiaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNI dni= new DNI('E', 1828812);
        Persona persona= new Persona();
        persona.setNombre("Nohiria");
        persona.setApellido("Velazquez");
        persona.setNumDni(dni);
        System.out.println(persona.toString());
    }
    
}
