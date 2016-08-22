package Objetos.Ejercicio4;

import java.util.ArrayList;

/**
 * Created by Juan Pablo on 22/08/2016.
 */
public class Concesionaria {
    private ArrayList<Venta> registro = new ArrayList<Venta>();

    public void registrarVenta(Integer monto, Vehiculo vehiculo, Cliente cliente) {
        registro.add(new Venta(monto, vehiculo, cliente));
    }
}
