package Interfaces;

import java.net.ServerSocket;

/**
 * Created by digitalhouse on 29/08/16.
 */
public class SocioVip extends Socio {
    private Integer cuotaMensual;

    public SocioVip(String unNombre, String unApellido, Integer unaID, Integer maxRetiros) {
        super(unNombre, unApellido, unaID, 15);
    }

    public Integer getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(Integer cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }


}
