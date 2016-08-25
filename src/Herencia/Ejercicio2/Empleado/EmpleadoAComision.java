package Herencia.Ejercicio2.Empleado;

import Herencia.Ejercicio2.Venta;
import java.util.ArrayList;

/**
 * Created by digitalhouse on 25/08/16.
 */
public class EmpleadoAComision extends Empleado {
    private ArrayList<Venta> listaDeVentas = new ArrayList<Venta>();

    public EmpleadoAComision(String nombre) {
        super(nombre);
    }

    public void registrarVenta(Venta unaVenta) {
        listaDeVentas.add(unaVenta);
    }

    @Override
    public void cobrarSueldo() {
        super.cobrarSueldo();

        Double totalACobrar = sueldoBasico;
        for (int i = 0; i < listaDeVentas.size(); i++) {
            totalACobrar += listaDeVentas.get(i).getMontoVenta() * listaDeVentas.get(i).getComision();

        }
        System.out.println("Cobro $ " + totalACobrar);
    }
}
