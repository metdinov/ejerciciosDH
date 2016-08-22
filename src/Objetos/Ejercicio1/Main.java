package Objetos.Ejercicio1;

/**
 * Created by Juan Pablo on 22/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        Persona juan = new Persona("Juan", "Amoroso");
        Persona emilia = new Persona("Emilia", "Amoroso");
        System.out.println("Mi nombre es " + juan.getNombre() + " " + juan.getApellido());
        System.out.println("Mi nombre es " + emilia.getNombre() + " " + emilia.getApellido());

        Cuenta cuentaJuan = new Cuenta(juan);
        Cuenta cuentaEmilia = new Cuenta(emilia);
        cuentaJuan.deposito(1000.0);
        cuentaEmilia.deposito(300.0);
        cuentaJuan.extraccion(900.0);
        cuentaEmilia.extraccion(600.0);
    }
}

