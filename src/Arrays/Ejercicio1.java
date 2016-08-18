package Arrays;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 17/08/16.
 */

/**
 * Solucion de JP, turno tarde
 * no toca boton
 */
public class Ejercicio1 {
    public static Integer totalArray(ArrayList<Integer> unArrayList) {
        Integer suma = 0;
        for (Integer i=0; i < unArrayList.size(); i++) {
            suma += unArrayList.get(i);
        }
        return suma;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        testArray.add(0, 1);
        testArray.add(1, 1);
        for (Integer i=2; i < 18; i++) {
            testArray.add(i, testArray.get(i-1) + testArray.get(i-2));
        }
        System.out.println("La suma de los primeros 20 numeros de Fibonacci = " + totalArray(testArray));
    }
}
