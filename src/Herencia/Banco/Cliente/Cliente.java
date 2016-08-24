package Herencia.Banco.Cliente;

/**
 * Created by digitalhouse on 24/08/16.
 */
public class Cliente {
    private String nombre;
    private Integer numeroDeCuenta;

    public Cliente(String nombre, Integer numeroDeCuenta) {
        this.nombre = nombre;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
}

