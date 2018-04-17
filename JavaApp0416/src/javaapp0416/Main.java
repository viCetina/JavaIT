package javaapp0416;

public class Main {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno);
        
        Curso c = new Curso(5);
        System.out.println(c);
        System.out.println("promedio: " + c.getPromedio());
        System.out.println("promedio Chicas: " + c.getPromedio('F'));
        System.out.println("promedio Chicos: " + c.getPromedio('M'));
        
        double pf = c.getPromedio('F');
        double pm = c.getPromedio('M');
        
        if (pf > pm){
            System.out.println("F");
        } else {
            System.out.println("M");
        }
        
        
    }
    
}
