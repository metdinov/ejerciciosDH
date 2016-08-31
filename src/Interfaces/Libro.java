package Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 29/08/16.
 */
public class Libro extends Publicacion{
    private String titulo;
    private String autor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void agregarEjemplar(Ejemplar unEjemplar) {
        this.getListaEjemplares().add(unEjemplar);
    }

    public Boolean tieneEjemplaresDisponibles() {
        for (Ejemplar unEjemplar : this.getListaEjemplares()) {
            if (!unEjemplar.getPrestado()) {
                return true;
            }
        }
        return false;
    }

    public Ejemplar prestarEjemplar() {
        if (tieneEjemplaresDisponibles()) {
            for (Ejemplar unEjemplar : this.getListaEjemplares()) {
                if (!unEjemplar.getPrestado()) {
                    unEjemplar.setPrestado(true);
                    return unEjemplar;
                }
            }
        }
        return null;
    }

    public void reingresarEjemplar(Ejemplar unEjemplar) {
        unEjemplar.setPrestado(false);
    }
}
