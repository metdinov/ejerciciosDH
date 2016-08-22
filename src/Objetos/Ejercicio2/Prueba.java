package Objetos.Ejercicio2;

/**
 * Created by Juan Pablo on 22/08/2016.
 */
public class Prueba {
    private Integer dificultadReq;
    private Integer energiaReq;

    public Prueba(Integer dificultadReq, Integer energiaReq) {
        this.dificultadReq = dificultadReq;
        this.energiaReq = energiaReq;
    }

    public Boolean puedeRealizar(Atleta unAtleta) {
        return (unAtleta.getNivel() >= dificultadReq && unAtleta.getEnergia() >= energiaReq);
    }
}
