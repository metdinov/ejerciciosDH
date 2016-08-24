package Herencia.Banco.Cliente;

/**
 * Created by digitalhouse on 24/08/16.
 */
public class ClienteEmpresa extends Cliente {
    private Integer CUIT;

    public ClienteEmpresa(String unNombre, Integer unCUIT, Integer unNumeroDeCuenta) {
        super(unNombre, unNumeroDeCuenta);
        CUIT = unCUIT;
    }

    public Integer getCUIT() {
        return CUIT;
    }
}
