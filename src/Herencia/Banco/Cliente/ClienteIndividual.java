package Herencia.Banco.Cliente;

/**
 * Created by digitalhouse on 24/08/16.
 */
public class ClienteIndividual extends Cliente {
    private String apellido;
    private Integer DNI;

    public ClienteIndividual(String unNombre, String unApellido, Integer unDNI, Integer unNumeroDeCuenta) {
        super(unNombre, unNumeroDeCuenta);
        apellido = unApellido;
        DNI = unDNI;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDNI() {
        return DNI;
    }
}
