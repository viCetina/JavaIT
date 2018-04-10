/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapp0409;

/**
 *
 * @author ITmaster
 */
public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;

    public Juego(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }
    
    public void jugar() {
        int cont1 = 0;
        int cont2 = 0;
        Jugador x;
        
        while (cont1 < 2 && cont2 < 2){
            jugador1.hacerGesto();
            System.out.println(jugador1.getNombre() + " >> " + jugador1.getMano().toString());
            
            jugador2.hacerGesto();
            System.out.println(jugador1.getNombre() + " >> " + jugador2.getMano().toString());
            
            x = quienGana();
            if (x == jugador1){
                System.out.println("Gana" + jugador1.getNombre());
                cont1++;
            } else {
                if (x == jugador2){
                System.out.println("Gana" + jugador2.getNombre());
                cont2++;
                } else {
                    System.out.println("Empatados");
                }
            }
        }
    }

    private Jugador quienGana() {
    
        return null;
    }
    
}
