package javaapp0416;

public class Alumno {
    private int legajo;
    private char sexo;
    private Fecha fecha;
    private int nota;
    
    private int enteroRamdom(int d, int h) {
        return  (int)( Math.random() *(h - d +1)+ d);
    }

    @Override
    public String toString()
    {
        return "Alumno{" + "legajo=" + legajo + ", sexo=" + sexo + ", fecha=" + fecha + ", nota=" + nota + '}';
    }

    public int getLegajo() {
        return legajo;
    }

    public char getSexo() {
        return sexo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public int getNota() {
        return nota;
    }

    public Alumno() {
        int a = enteroRamdom(1980, 2000);
        int m = enteroRamdom(1, 12);
        int d = enteroRamdom(1, 31);
        this.legajo = enteroRamdom(10000, 20000);
        this.sexo = (enteroRamdom(1, 2) == 1) ? 'M' : 'F';
        this.fecha = new Fecha (d, m, a);
        this.nota = enteroRamdom(1, 10);
    } 
}
