package Herencia.Banco.Cuenta;

import Herencia.Banco.Cliente.Cliente;

/**
 * Created by digitalhouse on 24/08/16.
 */
public class CajaDeAhorro extends Cuenta {
    private Double tasaDeInteres;

    public CajaDeAhorro(Cliente cliente, Double saldo, Integer numeroDeCuenta, Double unaTasaDeInteres) {
        super(cliente, saldo, numeroDeCuenta);
        tasaDeInteres = unaTasaDeInteres;
    }

    public void cobrarInteres() {
        saldo = saldo * (1 + tasaDeInteres);
    }

    @Override
    public void extraerEfectivo(Double unMonto) {
        if (unMonto <= saldo) {
            super.extraerEfectivo(unMonto);
        } else {
            System.out.println("No se pudo realizar la operacion. La extraccion maxima es de $" + saldo);
        }
    }
}
