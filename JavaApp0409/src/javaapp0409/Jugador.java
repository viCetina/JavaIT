/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapp0409;

public class Jugador {
    private String nombre;
    private Gesto mano;

    public String getNombre() {
        return nombre;
    }

    public Gesto getMano() {
        return mano;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        mano = new Gesto();
    }
    
    public String toString() {
        return nombre + " : " + mano.toString();
    } 

    void hacerGesto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
