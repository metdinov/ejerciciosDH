package Objetos.Ejercicio1;

/**
 * Created by Juan Pablo on 21/08/2016.
 */
public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String unNombre, String unApellido) {
        nombre = unNombre;
        apellido = unApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
