package Objetos.Ejercicio2;

/**
 * Created by Juan Pablo on 22/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        Atleta usain = new Atleta("Usain Bolt", 10, 100);
        Atleta cabito = new Atleta("Cabito", 2, 50);

        Prueba primeraPrueba = new Prueba(1, 50);
        Prueba segundaPrueba = new Prueba(2, 80);
        Prueba terceraPrueba = new Prueba(8, 90);
        Prueba[] pruebas = {primeraPrueba, segundaPrueba, terceraPrueba};

        for (int i = 0; i < pruebas.length; i++) {
            Prueba prueba = pruebas[i];
            if (prueba.puedeRealizar(usain)) {
                System.out.println(usain.getNombre() + " puede pasar la prueba " + i);
            } else {
                System.out.println(usain.getNombre() + " no puede pasar la prueba " + i);
            }
            if (prueba.puedeRealizar(cabito)) {
                System.out.println(cabito.getNombre() + " puede pasar la prueba " + i);
            } else {
                System.out.println(cabito.getNombre() + " no puede pasar la prueba " + i);
            }
        }
    }
}
