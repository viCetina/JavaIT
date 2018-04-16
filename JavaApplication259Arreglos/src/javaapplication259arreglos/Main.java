package javaapplication259arreglos;

import java.util.Random;

public class Main
{

    private static final Random RAN = new Random();
    public static void main(String[] args)
    {
       
       int [] vec1 = crearArreglo(200000,1,25); 
      // int [] vec2 = crearArreglo(300000,1,25); 
        
       mostrarArreglo("ARREGLO 1 ANTES",vec1);
       ordenarArreglo(vec1);
       mostrarArreglo("ARREGLO 1 DESPUES",vec1);
/*
       mostrarArreglo("ARREGLO 2 ANTES",vec2);
        quicksort(vec2, 0, vec2.length-1);
       mostrarArreglo("ARREGLO 2 DESPUES",vec2);
  */    
       
    }

    private static int[] crearArreglo(int tamanio, int nDesde, int nHasta)
    {
        int []x = new int[tamanio];
        
        for (int i = 0; i < x.length; i++)
        {
            x[i] = RAN.nextInt(nHasta-nDesde+1)+nDesde;
        }
        return x;
    }

    private static void mostrarArreglo(String titulo,int[] vec)
    {
        System.out.print("\n" + titulo + ": ");
        for (int i = 0; i < vec.length; i++)
        {
            System.out.print(vec[i]+",");
        }
        System.out.println("FIN");
    }   

    private static void ordenarArreglo(int[] vec)
    {
        for (int i = 0; i < vec.length-1; i++)
        {
            for (int d = i+1 ; d < vec.length; d++)
            {
                if (vec[i] > vec[d])
                {
                    int aux = vec[i];
                    vec[i] = vec[d];
                    vec[d] = aux;
                }
            }
        }
    }
    
    public static void quicksort(int vec[], int izq, int der)
    {

        int pivote = vec[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j)
        {            // mientras no se crucen las búsquedas
            while (vec[i] <= pivote && i < j)
            {
                i++; // busca elemento mayor que pivote
            }
            while (vec[j] > pivote)
            {
                j--;         // busca elemento menor que pivote
            }
            if (i < j)
            {                      // si no se han cruzado                      
                aux = vec[i];                  // los intercambia
                vec[i] = vec[j];
                vec[j] = aux;
            }
        }
        vec[izq] = vec[j]; // se coloca el pivote en su lugar de forma que tendremos
        vec[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1)
        {
            quicksort(vec, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der)
        {
            quicksort(vec, j + 1, der); // ordenamos subarray derecho
        }
    }

}
