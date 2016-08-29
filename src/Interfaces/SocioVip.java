package Interfaces;

/**
 * Created by digitalhouse on 29/08/16.
 */
public class SocioVip extends Socio {
    private Integer cuotaMensual;

    public SocioVip(String unNombre, String unApellido, Integer unaID, Integer maxRetiros) {
        super(nombre, apellido, ID);
    }

    public Integer getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(Integer cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }
}
