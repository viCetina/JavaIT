package javaapppass;

public class Password {
    
    private static final int LONGITUD=8;
    private String contrasenia;
    private int longitud;
    
    public Password(int longitud) {
        this.longitud = longitud < LONGITUD ? LONGITUD : longitud;
        this.contrasenia = generaPassword();
    }
    
    private char getLetraRandom(char d, char h) {
        return (char) (Math.random()*(h-d+1)+d);
    }
    
    public Password() {
        this(LONGITUD);
    }

    public String getContrasenia() {
        return contrasenia;
    }
    
    private boolean esMayuscula(char c) {
        return c >= 'A'&& c <='Z';
    }
    
        private boolean esMinuscula(char c) {
        return c >= 'a'&& c <='z';
    }
 
    public boolean esFuerte() {
        int contadorMayusculas=0;
        int contadorMinusculas=0;
        int contadorNumeros=0;
        
        for (int i = 0; i < longitud; i++)
        {
            char c = contrasenia.charAt(i);
            if (esMayuscula(c))
            {
                contadorMayusculas++;
            }
            else
            {
                if (esMinuscula(c))
                {
                    contadorMinusculas++;
                }
                else
                {
                    contadorNumeros++;
                }
            }
        }
        
        return contadorMayusculas >= 1 && contadorMinusculas >= 2 &&contadorNumeros >= 5;
    }
    
    private String generaPassword() {
double x;
        String s = "";
        
        for (int i = 0; i < longitud; i++) {
            x = Math.random();
            if (x < 0.6) {
                s = s + getLetraRandom ('0', '9');
            } else {
                if (x < 0.9) {
                    s = s + getLetraRandom ('a', 'z');
                }
                else
                {
                    s+=getLetraRandom('A','Z');
                }
            }
        }
        return s; 
    }
        
    public int getLongitud() {
        return longitud;
    }
    
    public static String generaPasswordFuerte() {
        String f = "";
        return f;
    }
    
}