package Arrays;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 17/08/16.
 */

/**
 * Solucion de JP, turno tarde
 * no toca boton
 */
public class Ejercicio5 {
    public static ArrayList<Integer> listaDeNumerosEntre(Integer minimo, Integer maximo) {
        ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
        for (Integer i=minimo; i <= maximo; i++) {
            listaDeNumeros.add(i - minimo, i);
        }
        return listaDeNumeros;
    }

    public static void main(String[] args) {
        System.out.println("Los numeros entre 15 y 37 = " + listaDeNumerosEntre(15, 37));
    }
}
