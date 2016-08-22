package Objetos.Ejercicio4;

import java.util.Date;

/**
 * Created by Juan Pablo on 22/08/2016.
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private Integer anio;
    private String color;
    private Integer kilometraje;

    public Vehiculo(String marca, String modelo, Integer anio, String color, Integer kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public String getColor() {
        return color;
    }

    public Integer getKilometraje() {
        return kilometraje;
    }
}
