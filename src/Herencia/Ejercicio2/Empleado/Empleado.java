package Herencia.Ejercicio2.Empleado;

/**
 * Created by digitalhouse on 25/08/16.
 */
public class Empleado {
    protected Double sueldoBasico;
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
        sueldoBasico = 1000.0;
    }

    public void cobrarSueldo() {
        System.out.println(nombre + " cobro su sueldo.");
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public String getNombre() {
        return nombre;
    }
}
