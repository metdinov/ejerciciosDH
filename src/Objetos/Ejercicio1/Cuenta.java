package Objetos.Ejercicio1;

import java.util.Random;

/**
 * Created by Juan Pablo on 22/08/2016.
 */
public class Cuenta {
    private Integer nroCuenta;
    private Integer saldo;
    private Persona titular;

    public Cuenta(Persona unaPersona) {
        titular = unaPersona;
        saldo = 0;
        Random rand = new Random();
        nroCuenta = rand.nextInt(1000);
    }

    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void deposito(Integer cantidad) {
        saldo += cantidad;
        System.out.println("Se depositaron " + cantidad + " pesos.");
        System.out.println("El saldo actual es de " + this.getSaldo() + " pesos.");
    }

    public void extraccion(Integer cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se extrajeron " + cantidad + " pesos.");
            System.out.println("El saldo actual es de " + getSaldo() + " pesos.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}

