package Objetos.Ejercicio3;

import static Objetos.Ejercicio3.Tripode.Plegado;

/**
 * Created by Juan Pablo on 22/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        Tripode miTripode = new Tripode(Plegado.DESPLEGADO, 5, 18);

        miTripode.desplegar();
        miTripode.definirAltura(12);
        if (miTripode.listoParaUsar()) {
            System.out.println("Puedo usar mi tripode");
        } else {
            System.out.println("No puedo usar mi tripode");
        }

        miTripode.plegar();
        if (miTripode.listoParaUsar()) {
            System.out.println("Puedo usar mi tripode");
        } else {
            System.out.println("No puedo usar mi tripode");
        }

        miTripode.guardar();
        if (miTripode.listoParaGuardar()) {
            System.out.println("Puedo guardar mi tripode");
        } else {
            System.out.println("No puedo guardar mi tripode");
        }
    }
}
