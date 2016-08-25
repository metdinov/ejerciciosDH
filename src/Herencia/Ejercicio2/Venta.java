package Herencia.Ejercicio2;

/**
 * Created by digitalhouse on 25/08/16.
 */
public class Venta {
    private Double montoVenta = 0.0;
    private Double comision = 0.0;

    public void registrarComision(Double unaComision) {
        comision = unaComision;
    }

    public void registraMontoVenta(Double unMonto) {
        montoVenta = unMonto;
    }

    public Double getMontoVenta() {
        return montoVenta;
    }

    public Double getComision() {
        return comision;
    }
}
