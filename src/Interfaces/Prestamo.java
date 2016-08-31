package Interfaces;

import java.util.Date;
import java.util.List;

/**
 * Created by digitalhouse on 30/08/16.
 */
public class Prestamo {
    private Socio unSocio;
    private Libro unLibro;
    Date fecha;

    public Prestamo(Socio unSocio, Libro unLibro, Date fecha) {
        this.unSocio = unSocio;
        this.unLibro = unLibro;
        this.fecha = fecha;
    }

    public Socio getUnSocio() {
        return unSocio;
    }

    public void setUnSocio(Socio unSocio) {
        this.unSocio = unSocio;
    }

    public Libro getUnLibro() {
        return unLibro;
    }

    public void setUnLibro(Libro unLibro) {
        this.unLibro = unLibro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
