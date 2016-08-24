package Herencia.Banco.Cuenta;

import Herencia.Banco.Cliente.Cliente;

/**
 * Created by digitalhouse on 24/08/16.
 */
public class Cuenta {
    private Cliente cliente;
    protected Double saldo;
    private Integer numeroDeCuenta;

    public Cuenta(Cliente cliente, Double saldo, Integer numeroDeCuenta) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void depositarEfectivo(Double unMonto) {
        saldo = saldo + unMonto;
    }

    public void extraerEfectivo(Double unMonto) {
        saldo = saldo - unMonto;
    }

    public Double getSaldo() {
        return saldo;
    }
}
