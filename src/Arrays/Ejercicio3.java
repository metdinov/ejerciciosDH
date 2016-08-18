package Arrays;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by digitalhouse on 17/08/16.
 */

/**
 * Solucion de JP, turno tarde
 * no toca boton
 */
public class Ejercicio3 {
    public static ArrayList<Integer> totalParesArray(ArrayList<Integer> unArrayList) {
        ArrayList<Integer> pares = new ArrayList<Integer>();
        Integer numPares = 0;
        for (Integer i=0; i < unArrayList.size(); i++) {
            if (unArrayList.get(i) % 2 == 0) {
                pares.add(numPares, unArrayList.get(i));
                numPares++;
            }
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
        System.out.println("Los pares entre los primeros 20 numeros de Fibonacci = " + totalParesArray(testArray));
    }
}
