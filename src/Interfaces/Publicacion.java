package Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 31/08/16.
 */
public class Publicacion {
    private Integer ISBN;
    private List<Ejemplar> listaEjemplares = new ArrayList<>();

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public List<Ejemplar> getListaEjemplares() {
        return listaEjemplares;
    }

    public void setListaEjemplares(List<Ejemplar> listaEjemplares) {
        this.listaEjemplares = listaEjemplares;
    }
}
