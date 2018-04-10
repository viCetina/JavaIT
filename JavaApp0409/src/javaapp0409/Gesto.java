/*
1. Definir atributos del objeto.
2. Definir Atributos de la clase.
3. Crear el constructor.
 */

package javaapp0409;

/**
 *
 * @author ITmaster
 */
public class Gesto {
    private int gesto;
    public static final int PIEDRA = 1;
    public static final String NOMBRE_PIEDRA = "Piedra";
    public static final int PAPEL = 2;
    public static final String NOMBRE_PAPEL = "Papel";
    public static final int TIJERA = 3;
    public static final String NOMBRE_TIJERA = "Tijera";

    public int getGesto() {
        return gesto;
    }

    public Gesto() { //constructor
        gesto = enteroRamdom (1, 3);
    }

    private static int enteroRamdom (int a, int b) {
        return (int)(Math.random()*(b-a+1)+a);
    }
    
    public String toString () {
        String s = "";
        if (gesto == PIEDRA){
            s = NOMBRE_PIEDRA;
        } else {
            if (gesto == PAPEL){
                s = NOMBRE_PAPEL;
            } else {
                s = NOMBRE_TIJERA;
            }
        }
        return s;
    }
    
}
