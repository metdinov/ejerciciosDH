package Objetos.Ejercicio3;

/**
 * Created by Juan Pablo on 22/08/2016.
 */
public class Tripode {
    public enum Plegado {PLEGADO, DESPLEGADO}

    private Plegado plegado;
    private Integer alturaMinima;
    private Integer alturaMaxima;
    private Integer alturaActual;

    public Tripode(Plegado plegado, Integer alturaMinima, Integer alturaMaxima) {
        this.plegado = plegado;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
    }

    public void definirAltura(Integer nuevaAltura) {
        alturaActual = nuevaAltura;
    }

    public void plegar() {
        plegado = Plegado.PLEGADO;
    }

    public void desplegar() {
        plegado = Plegado.DESPLEGADO;
    }

    public void guardar() {
        plegar();
        alturaActual = alturaMinima;
    }

    public Boolean listoParaGuardar() {
        return (alturaActual == alturaMinima && plegado == Plegado.PLEGADO);
    }

    public Boolean listoParaUsar() {
        return (alturaActual > alturaMaxima / 2.0 && plegado == Plegado.DESPLEGADO);
    }
}
