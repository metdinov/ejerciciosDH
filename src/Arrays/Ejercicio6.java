package Arrays;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by digitalhouse on 17/08/16.
 */

/**
 * Solucion de JP, turno tarde
 * no toca boton
 */
public class Ejercicio6 {
    public static ArrayList<Integer> numerosDeLaQuiniela(Integer cantidad) {
        ArrayList<Integer> numerosDeLaSuerte = new ArrayList<Integer>();
        Random rand = new Random();
        for (Integer i=0; i < cantidad; i++) {
            numerosDeLaSuerte.add(rand.nextInt(100));
        }
        return numerosDeLaSuerte;
    }

    public static void main(String[] args) {
        System.out.println("Los numeros de la suerte son = " + numerosDeLaQuiniela(15));
    }
}
