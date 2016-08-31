package Interfaces;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by digitalhouse on 31/08/16.
 */
public class Revista extends Publicacion {
    private String autor;
    private Date fechaDePublicacion;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
}
