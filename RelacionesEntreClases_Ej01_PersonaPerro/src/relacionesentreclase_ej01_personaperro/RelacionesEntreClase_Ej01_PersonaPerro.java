/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package relacionesentreclase_ej01_personaperro;

import Entidades.Perro;
import Entidades.Persona;
import Enumeraciones.Raza;
import Enumeraciones.Tamanio;

/**
 *
 * @author nohyv
 */
public class RelacionesEntreClase_Ej01_PersonaPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1= new Persona();
        Persona persona2= new Persona();
        
        Perro perro1= new Perro("Vito", Raza.CRIOLLO, 3, Tamanio.GRANDE);
        Perro perro2= new Perro("Remy", Raza.CRIOLLO, 3, Tamanio.MEDIANO);
        
        persona1.setNombre("Noa");
        persona1.setApellido("Viena");
        persona1.setEdad(23);
        persona1.setDocumento(8291);
        persona1.setPerro(perro2);
        
        persona2.setNombre("Sergio");
        persona2.setApellido("Valdez");
        persona2.setEdad(29);
        persona2.setDocumento(8191);
        persona2.setPerro(perro1);
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }
    
}
