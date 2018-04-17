package javaapp0416;

public class Curso {
    
    Alumno [] losAlumnos;
    

    public Curso(int contAlu) {
        losAlumnos = new Alumno[contAlu];
        for (int i = 0; i < losAlumnos.length; i++) {
            losAlumnos[i] = new Alumno();
        }
    }
    
    public String toString() {
        String s ="";
        for (int i = 0; i < losAlumnos.length; i++) {
            s += losAlumnos[i].toString()+ "\n";
        }
    return s;
    }

    public double getPromedio() {
        double suma=0;
        
        for (int i = 0; i < losAlumnos.length; i++) {
            suma += losAlumnos[i].getNota();
        }
        return (double) (suma/losAlumnos.length);
    }
    
        public double getPromedio(char sexo) {
        double suma=0;
        int cont = 0;
        
        for (int i = 0; i < losAlumnos.length; i++) {
            if(sexo==losAlumnos[i].getSexo()){
                suma+= losAlumnos[i].getNota();
                cont++;
            }
        }
        return (double) (suma/cont);
    }
    
}