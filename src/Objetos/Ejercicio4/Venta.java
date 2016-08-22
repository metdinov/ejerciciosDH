package Objetos.Ejercicio4;

/**
 * Created by Juan Pablo on 22/08/2016.
 */
public class Venta {
    private Integer monto;
    private Vehiculo vehiculoVendido;
    private Cliente cliente;

    public Venta(Integer monto, Vehiculo vehiculoVendido, Cliente cliente) {
        this.monto = monto;
        this.vehiculoVendido = vehiculoVendido;
        this.cliente = cliente;
    }

    public Integer getMonto() {
        return monto;
    }

    public Vehiculo getVehiculoVendido() {
        return vehiculoVendido;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
