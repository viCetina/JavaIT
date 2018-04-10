/*
Piedra, Papel o Tijeras
 */

package javaapp0409;

/**
 *
 * @author ITmaster
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gesto g = new Gesto();
        System.out.println(g.toString());
        
        Jugador j = new Jugador ("Pepe");
        System.out.println(j.toString());
    }
    
}
