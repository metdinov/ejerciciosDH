package Herencia.Banco.Cuenta;

import Herencia.Banco.Cheque;
import Herencia.Banco.Cliente.Cliente;

/**
 * Created by digitalhouse on 24/08/16.
 */
public class CuentaCorriente extends Cuenta{
    private final Double descubierto;

    public CuentaCorriente(Cliente cliente, Double saldo, Integer numeroDeCuenta, Double unDescubierto) {
        super(cliente, saldo, numeroDeCuenta);
        descubierto = unDescubierto;
    }

    @Override
    public void extraerEfectivo(Double unMonto) {
        if (unMonto > saldo + descubierto) {
            System.out.println("No se pudo realizar la operacion. La extraccion maxima es de $" + (saldo + descubierto));
        } else {
            super.extraerEfectivo(unMonto);
        }
    }

    public void depositarCheque(Cheque unCheque) {
        saldo += unCheque.getMonto();
    }
}
