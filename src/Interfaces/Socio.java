package Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 29/08/16.
 */
public class Socio {
    protected String nombre;
    protected String apellido;
    protected Integer ID;
    protected List<Ejemplar> listaEjemplaresRetirados = new ArrayList<>();
    public static final Integer MAX_RETIROS;

    public Socio(String nombre, String apellido, Integer ID, Integer maxRetiros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.MAX_RETIROS = maxRetiros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
}
