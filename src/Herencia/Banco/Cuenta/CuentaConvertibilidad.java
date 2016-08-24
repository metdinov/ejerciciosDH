package Herencia.Banco.Cuenta;

import Herencia.Banco.Cliente.Cliente;

/**
 * Created by digitalhouse on 24/08/16.
 */
public class CuentaConvertibilidad extends CuentaCorriente {
    private Double tasaDeConversion;

    public CuentaConvertibilidad(Cliente cliente, Double saldo, Integer numeroDeCuenta, Double unDescubierto, Double unaTasaDeConversion) {
        super(cliente, saldo, numeroDeCuenta, unDescubierto);
        tasaDeConversion = unaTasaDeConversion;
    }

    public void depositarDolares(Double montoDolares) {
        super.depositarEfectivo(montoDolares * tasaDeConversion);
    }

    public void extraerDolares(Double montoDolares) {
        Double totalEnPesos = montoDolares * tasaDeConversion;
        if (totalEnPesos > saldo) {
            System.out.println("No se pudo realizar la operacion. La extraccion maxima es de US$" + saldo / tasaDeConversion);
        } else {
            super.extraerEfectivo(totalEnPesos);
        }
    }

    public Double convertirPesosADolares(Double monto, Double unaTasa) {
        return monto * unaTasa;
    }

    public Double convertirDolaresAPesos(Double monto, Double unaTasa) {
        return monto / unaTasa;
    }
}
