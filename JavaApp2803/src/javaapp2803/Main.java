/*
Listar numero de 6 digitos hata 999999
mostrar lo pares y mayores a 333333
el mayor de los menores a 222222
 */

package javaapp2803;

public class Main
{

    public static void main(String[] args)
    {
        int num = 0;
        int contPares = 0;
        boolean primeraVez = true;
        int max = 0;
        
        num = getNumRamdom(100000, 999999);
        
        while (num != 999999) {
            if (esPar(num) == true && num >= 333333){
                System.out.println("Pares: "+num);
                contPares++;
            }
        
            if (num < 222222){
                if (primeraVez){
                    primeraVez = false;
                    max = num;
                } else {
                    if (num > max){
                        max = num;
                    }
                }
                System.out.println("Menores a 222222: "+num);
            }
            
            num = getNumRamdom(100000, 999999);
        }
     
        System.out.println("Cantidad de pares: " + contPares);
        System.out.println(max);
    }
    
    private static int getNumRamdom (int a, int b) {
        return (int)(Math.random()*(b-a+1)+a);
    }
    
    private static boolean esPar (int n) {
        return (n%2) == 0;
    } 
}
