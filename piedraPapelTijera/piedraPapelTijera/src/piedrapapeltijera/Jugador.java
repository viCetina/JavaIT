
package piedrapapeltijera;

public class Jugador
{

    private String nombre;
    private Gesto  mano;

    //GETERS
    public String getNombre()
    {
        return nombre;
    }

    public Gesto getMano()
    {
        return mano;
    }

    //CONSTRUCTORES
    public Jugador(String nombre)
    {
        this.nombre = nombre;
        mano = new Gesto();
    }

    //METODOS PUBLICOS
    public void hacerGesto()
    {
        mano = new Gesto();
    }

}
