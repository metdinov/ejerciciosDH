package Interfaces;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by digitalhouse on 31/08/16.
 */
public class Paper extends Publicacion {
    private List<String> listaDeAutores = new ArrayList<>();
    private Date fechaDePublicacion;

    public List<String> getListaDeAutores() {
        return listaDeAutores;
    }

    public void setListaDeAutores(List<String> listaDeAutores) {
        this.listaDeAutores = listaDeAutores;
    }

    public Date getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
}
