package Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 29/08/16.
 */
public class Libro {
    private String titulo;
    private String autor;
    private Integer ISBN;
    private List<Ejemplar> listaEjemplares = new ArrayList<>();

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
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
