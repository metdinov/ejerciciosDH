package Objetos.Ejercicio2;

/**
 * Created by Juan Pablo on 22/08/2016.
 */
public class Atleta {
    private String nombre;
    private Integer nivel;
    private Integer energia;

    public Atleta(String nombre, Integer nivel, Integer energia) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public Integer getEnergia() {
        return energia;
    }
}
