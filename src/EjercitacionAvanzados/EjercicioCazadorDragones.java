package EjercitacionAvanzados;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by digitalhouse on 12/08/16.
 */

/**
 * Solucion de JP, turno tarde
 * no toca boton
 */
public class EjercicioCazadorDragones {

    public static void juegoDelCazador() {
        Integer dano = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca su nombre:");
        String nombre = scan.nextLine();
        System.out.println("Bienvenido " + nombre);

        do {
            if (decidirSiGolpeaJugador()) {
                dano = decidirCuantoGolpeaJugador();
                System.out.println(nombre + " golpea al dragon y le hace " + dano);
                if (dano >= 4) {
                    System.out.println(nombre + " ha derrotado al dragon!!!!1");
                    return;
                }
                System.out.println("Desea continuar? (S)i / (N)o");
            }
            else {while (scan.next().charAt(0) == 's');
                System.out.println("El dragon ha matado a " + nombre);
                return;
            }
        } while (scan.next().charAt(0) == 's');
    }

    private static Boolean decidirSiGolpeaJugador() {
        Random rand = new Random();
        return rand.nextBoolean();
    }

    private static Integer decidirCuantoGolpeaJugador() {
        //El numero aleatorio que eligo será entre 0 y 4 para poder jugar más tiempo.
        Random rand = new Random();
        return rand.nextInt(5);
    }

    public static void main(String[] args){
        juegoDelCazador();
    }
}
