package javaapppass;


public class Main {

    public static void main(String[] args) {
        Password p = new Password();
        
        if (p.esFuerte())
        {
            System.out.println("FUERTE!!!");
        }
        
        
        p=new Password();
        while(!p.esFuerte())
        {
            p=new Password();
        }
        
        System.out.println("p: " + p.getContrasenia()+ " ES FUERTE!!!!!!!!!");
    }
}
