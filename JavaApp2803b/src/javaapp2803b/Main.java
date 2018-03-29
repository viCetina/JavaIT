/*
Calcular la cantidad de grupos numericos
 */

package javaapp2803b;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        int prev = 0;
        int cont = 0;
        String numbers= " ";
        
        num = getNumRamdom(1, 99);
        while (num != 99 )
        {
            numbers= "";
            cont = 0;
            prev = num;
            while(num != 99 && num >= prev)
            {
                cont++;
                prev = num;
                numbers += (num+", ");
                num = getNumRamdom(1, 99);
                
            }
            if (cont > 1)
            {
                System.out.println("lista: " +  cont + " " + numbers);
            }
            
        }
     
         
    }
    
    private static int getNumRamdom (int a, int b) {
        return (int)(Math.random()*(b-a+1)+a);
    }
    
}
