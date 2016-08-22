package Objetos.Ejercicio4;

/**
 * Created by Juan Pablo on 22/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        Vehiculo unAuto = new Vehiculo("VW", "Gol", 2015, "Gris", 20000);
        Cliente unCliente = new Cliente("Juan", "Amoroso", "tenesparaanotar@gmail.com");
        Concesionaria miConcesionaria = new Concesionaria();

        miConcesionaria.registrarVenta(100000, unAuto, unCliente);
    }
}
