package Herencia.Banco;

import Herencia.Banco.Cliente.Cliente;
import Herencia.Banco.Cliente.ClienteEmpresa;
import Herencia.Banco.Cliente.ClienteIndividual;
import Herencia.Banco.Cuenta.CajaDeAhorro;
import Herencia.Banco.Cuenta.Cuenta;
import Herencia.Banco.Cuenta.CuentaCorriente;

/**
 * Created by digitalhouse on 24/08/16.
 */
public class Main {
    public static void main(String[] args) {
        ClienteIndividual juan = new ClienteIndividual("Juan", "Amoroso", 28795335, 1);
        CajaDeAhorro cuentaJuan = new CajaDeAhorro(juan, 1000.0, 35, 0.05);

        System.out.println(juan.getNombre() + " tiene un saldo de $" + cuentaJuan.getSaldo());
        System.out.println(juan.getNombre() + " extrae $500.");
        cuentaJuan.extraerEfectivo(500.0);
        System.out.println(juan.getNombre() + " tiene un saldo de $" + cuentaJuan.getSaldo());
        System.out.println(juan.getNombre() + " extrae $900.");
        cuentaJuan.extraerEfectivo(900.0);
        System.out.println(juan.getNombre() + " tiene un saldo de $" + cuentaJuan.getSaldo());

        ClienteEmpresa terrabusi = new ClienteEmpresa("Terrabusi", 305300032, 2);
        CuentaCorriente cuentaTerrabusi = new CuentaCorriente(terrabusi, 100000.0, 45, 10000.0);

        System.out.println(terrabusi.getNombre() + " tiene un saldo de $" + cuentaTerrabusi.getSaldo());
        System.out.println(terrabusi.getNombre() + " extrae $20000.");
        cuentaTerrabusi.extraerEfectivo(20000.0);
        System.out.println(terrabusi.getNombre() + " tiene un saldo de $" + cuentaTerrabusi.getSaldo());
        System.out.println(terrabusi.getNombre() + " extrae $85000.");
        cuentaTerrabusi.extraerEfectivo(85000.0);
        System.out.println(terrabusi.getNombre() + " tiene un saldo de $" + cuentaTerrabusi.getSaldo());
        System.out.println(terrabusi.getNombre() + " extrae $10000.");
        cuentaTerrabusi.extraerEfectivo(10000.0);
        System.out.println(terrabusi.getNombre() + " tiene un saldo de $" + cuentaTerrabusi.getSaldo());

    }
}
