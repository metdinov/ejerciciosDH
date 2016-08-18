package EjercitacionAvanzados;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by digitalhouse on 11/08/16.
 */

/**
 * Solucion de JP, turno tarde
 * no toca boton
 */
public class EjercicioPiedraPapelTijera {

    public static String jugarAlPiedraPapelOTijera(String eleccion){
        //Comenzar a escribir código acá

        //Codigo para generar numeros aleatorios entre 0 y 2.
        Random random = new Random();
        Integer eleccionDeComputadora = random.nextInt(3);

        // 0 == Piedra
        // 1 == Papel
        // 2 == Tijera

        Integer eleccionDeJugador;
        switch (eleccion) {
            case "piedra":
                eleccionDeJugador = 0;
                break;
            case "papel":
                eleccionDeJugador = 1;
                break;
            default:
                eleccionDeJugador = 2;
                break;
        }
        
        switch (eleccionDeComputadora - eleccionDeJugador) {
            case 0:
                return "empatado";
            case 1:
            case -2:
                return "perdedor";
            default:
                return "ganador";
        }
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        //Codigo para ingreso de nombre por teclado
        System.out.println ("Nombre del jugador:");
        String nombre = "";
        Scanner scan = new Scanner(System.in);
        nombre = scan.nextLine();

        //Codigo para ingreso de elección poandresr teclado
        System.out.println ("Elección del jugador:");
        String eleccion = "";
        eleccion = scan.nextLine();

        System.out.println("El jugador " + nombre + " resultó " + jugarAlPiedraPapelOTijera(eleccion));
    }
}