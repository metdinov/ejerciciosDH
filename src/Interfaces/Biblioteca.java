package Interfaces;

import java.util.*;

/**
 * Created by digitalhouse on 30/08/16.
 */
public class Biblioteca {
    private List<Prestamo> listaDePrestamos = new ArrayList<>();
    private Map<Categoria, List<Libro>> diccionarioDeCategorias = new HashMap<>();

    public void prestar(Libro unLibro, Socio unSocio) {
        if (unLibro.tieneEjemplaresDisponibles() && unSocio.tieneCupoDisponible()) {
            listaDePrestamos.add(new Prestamo(unSocio, unLibro, new Date()));
            unSocio.retirarUnEjemplar(unLibro.prestarEjemplar());
            System.out.println("El socio " + unSocio.getNombre() + " " + unSocio.getApellido()
                    + "se llevo el libro: " + unLibro.getTitulo());
        } else {
            System.out.println("No se pudo realizar el prestamo de " + unLibro.getTitulo());
        }
    }

    public void prestar(List<Libro> unaListaDeLibros, Socio unSocio) {
        for (Libro unLibro : unaListaDeLibros) {
            prestar(unLibro, unSocio);
        }
    }

    public void devolver(Ejemplar unEjemplar, Socio unSocio) {
        unEjemplar.setPrestado(false);
        unSocio.devolverUnEjemplar(unEjemplar);
        System.out.println(unSocio.getNombre() + " " + unSocio.getApellido() + " devolvio " +
                unEjemplar.getUnLibro().getTitulo());
    }

    public void devolver(List<Ejemplar> unaListaDeEjemplares, Socio unSocio) {
        for (Ejemplar unEjemplar : unaListaDeEjemplares) {
            devolver(unEjemplar, unSocio);
        }
    }

    public void agregarLibroACategoria(Categoria unaCategoria, Libro unLibro) {
        if (!diccionarioDeCategorias.containsKey(unaCategoria)) {
            diccionarioDeCategorias.put(unaCategoria, new ArrayList<Libro>());
        }
        diccionarioDeCategorias.get(unaCategoria).add(unLibro);
    }

    public List<Libro> listarLibrosDeCategoria(Categoria unaCategoria) {
        return diccionarioDeCategorias.get(unaCategoria);
    }

    public Categoria getCategoria(Libro unLibro) {
        for (Categoria unaCategoria: diccionarioDeCategorias.keySet()) {
            if (diccionarioDeCategorias.get(unaCategoria).contains(unLibro)) {
                return unaCategoria;
            }
        }
        return null;
    }

    public void imprimirNuevosEjemplares(List<Imprimible> imprimibles) {
        for (Imprimible unImprimible : imprimibles) {
            unImprimible.imprimir();
        }
    }
}
