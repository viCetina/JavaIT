
package piedrapapeltijera;

public class Juego
{

    private Jugador jugadorUno;
    private Jugador jugadorDos;

    //CONSTRUCTOR
    public Juego(String nombreJugador1, String nombreJugador2) {
        jugadorUno = new Jugador(nombreJugador1);
        jugadorDos = new Jugador(nombreJugador2);
    }

    //METODOS PUBLICOS
    public void jugar() {
        int contadorJugador1 = 0;
        int contadorJugador2 = 0;
        Jugador jugadorAuxiliar;

        while (contadorJugador1 < 2 && contadorJugador2 < 2) {
            
            jugadorUno.hacerGesto();
            System.out.println(jugadorUno.getNombre() + ": " + jugadorUno.getMano().toString());
            
            jugadorDos.hacerGesto();
            System.out.println(jugadorDos.getNombre() + ": " + jugadorDos.getMano().toString());

            jugadorAuxiliar = quienGana();

            if (jugadorAuxiliar == jugadorUno) 
            {
                System.out.println("GANA " + jugadorUno.getNombre() + "\n");
                contadorJugador1++;
            }
            else
            {
                if (jugadorAuxiliar == jugadorDos)
                {
                    System.out.println("GANA " + jugadorDos.getNombre() + "\n");
                    contadorJugador2++;

                } 
                else 
                {
                    System.out.println("EMPATE" + "\n");
                }
            }
        }

        if (contadorJugador1 == 2)
        {
            System.out.println("GANADOR PARTIDA: " + jugadorUno.getNombre() + "\n");
        } else
        {
            System.out.println("GANADOR PARTIDA: " + jugadorDos.getNombre());
        }

    }
    
        
        
    private Jugador quienGana()
    {
        int valorGesto1 = jugadorUno.getMano().getGesto();
        int valorGesto2 = jugadorDos.getMano().getGesto();
        
        if (valorGesto1 == valorGesto2)
        {
            return null;
        }
        
        if (valorGesto1 == Gesto.PIEDRA && valorGesto2 == Gesto.TIJERA ||
                valorGesto1 == Gesto.PAPEL && valorGesto2 == Gesto.PIEDRA ||
                     valorGesto1 == Gesto.TIJERA && valorGesto2 == Gesto.PAPEL)
        {
            return jugadorUno;
        }
        
        
        return jugadorDos;
    }
    
}
        
        



