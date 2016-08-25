package Herencia.Ejercicio2;

import Herencia.Ejercicio2.Empleado.EmpleadoAComision;
import Herencia.Ejercicio2.Empleado.EmpleadoAPlazoFijo;
import Herencia.Ejercicio2.Empleado.EmpleadoTiempoIndet;

/**
 * Created by digitalhouse on 25/08/16.
 */
public class Main {
    public static void main(String[] args) {
        EmpleadoAComision juan = new EmpleadoAComision("Juan");
        EmpleadoAPlazoFijo jose = new EmpleadoAPlazoFijo("Jose");
        EmpleadoTiempoIndet martin = new EmpleadoTiempoIndet("Martin");

        Venta venta1 = new Venta();
        Venta venta2 = new Venta();
        Venta venta3 = new Venta();

        venta1.registraMontoVenta(1000.0);
        venta1.registrarComision(0.1);
        venta2.registraMontoVenta(3000.0);
        venta2.registrarComision(0.11);
        venta3.registraMontoVenta(5000.0);
        venta3.registrarComision(0.05);

        juan.registrarVenta(venta1);
        juan.registrarVenta(venta2);
        juan.registrarVenta(venta3);

        juan.cobrarSueldo();

        jose.setMesesDeContrato(10);
        jose.cobrarSueldo();

        martin.setAntiguedad(9);
        martin.setHijos(2);
        martin.cobrarSueldo();
    }
}
