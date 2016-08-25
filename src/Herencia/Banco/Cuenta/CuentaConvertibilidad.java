package Herencia.Banco.Cuenta;

import Herencia.Banco.Cliente.Cliente;

/**
 * Created by digitalhouse on 24/08/16.
 */
public class CuentaConvertibilidad extends CuentaCorriente {
    private Double saldoDolares = 0.0;

    public CuentaConvertibilidad(Cliente cliente, Double saldo, Integer numeroDeCuenta,
                                 Double unDescubierto) {
        super(cliente, saldo, numeroDeCuenta, unDescubierto);
    }

    public void depositarDolares(Double montoDolares) {
        saldoDolares += montoDolares;
    }

    public void extraerDolares(Double montoDolares) {
        saldoDolares -= montoDolares;
    }

    // Asumo unaTasa de Pesos a Dolares
    // => montoPesos * unaTasa := montoDolares
    public void convertirPesosADolares(Double monto, Double unaTasa) {
        if (monto > saldo) {
            System.out.println("No se pudo realizar la operacion. Su saldo es de $" + saldo);
        } else {
            saldoDolares += monto / unaTasa;
            saldo -= monto;
        }
    }

    public void convertirDolaresAPesos(Double montoDolares, Double unaTasa) {
        if (montoDolares > saldoDolares) {
            System.out.println("No se pudo realizar la operacion. Su saldo es de US$" + saldo);
        } else {
            saldo += montoDolares * unaTasa;
            saldoDolares -= montoDolares;
        }
    }

}
