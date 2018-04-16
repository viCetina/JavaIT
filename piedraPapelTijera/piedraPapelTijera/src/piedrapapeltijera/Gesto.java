package piedrapapeltijera;

public class Gesto
{
//ATRIBUTOS DE OBJETO   

    private int gesto = 0;
    
//ATRIBUTO DE INSTANCIA
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;
    public static final int LAGARTO = 4;
    public static final int SPOCK = 5;
    private static final String NOMBRE_PAPEL = "PAPEL";
    private static final String NOMBRE_PIEDRA = "PIEDRA";
    private static final String NOMBRE_TIJERA = "TIJERA";
    private static final String NOMBRE_LAGARTO = "LAGARTO";
    private static final String NOMBRE_SPOCK = "SPOCK";

    public Gesto() 
    {//CONSTRUCTOR POR DEFECTO (SIN PARAMETROS)
        this.gesto=enteroRandom(PIEDRA,TIJERA);
    }

    public int getGesto() {
        return gesto;
    }

    @Override
    public String toString()
    {
        String valorObtenido = "";

        if (this.gesto == PIEDRA)
        {
            valorObtenido = "PIEDRA";
        } else
        {
            if (this.gesto == TIJERA)
            {
                valorObtenido = "TIJERA";
            } else
            {
                valorObtenido = "PAPEL";
            }
        }
        return (valorObtenido);
    }

    private int enteroRandom(int d, int h)
    {
        return  (int)( Math.random() *(h - d +1)+ d);
    }
}
