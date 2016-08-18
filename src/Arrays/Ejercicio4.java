package Arrays;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 17/08/16.
 */

/**
 * Solucion de JP, turno tarde
 * no toca boton
 */
public class Ejercicio4 {
    public static ArrayList<Integer> listaDePrimerosCienPositivos() {
        ArrayList<Integer> pares = new ArrayList<Integer>();
        for (Integer i=0; i < 100; i++) {
            pares.add(i, i*2);
        }
        return pares;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        testArray.add(0, 1);
        testArray.add(1, 1);
        for (Integer i=2; i < 18; i++) {
            testArray.add(i, testArray.get(i-1) + testArray.get(i-2));
        }
        System.out.println("Los primeros 100 numeros pares = " + listaDePrimerosCienPositivos());
    }
}
