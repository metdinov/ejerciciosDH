package Objetos.Ejercicio4;

/**
 * Created by Juan Pablo on 21/08/2016.
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String contacto;

    public Cliente(String unNombre, String unApellido, String unContacto) {
        nombre = unNombre;
        apellido = unApellido;
        contacto = unContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContacto() {
        return contacto;
    }
}
