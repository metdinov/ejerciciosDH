package Herencia.Ejercicio2.Empleado;

import static java.lang.Double.max;

/**
 * Created by digitalhouse on 25/08/16.
 */
public class EmpleadoTiempoIndet extends Empleado {
    private static final Double SUP_HIJO = 200.0;
    private static final Double SUP_ANTIGUEDAD = 100.0;
    private static final Double LIMITE_HIJO = 1000.0;
    private static final Double LIMITE_ANTIGUEDAD = 500.0;
    private Integer antiguedad;
    private Integer hijos;

    public EmpleadoTiempoIndet(String nombre) {
        super(nombre);
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setHijos(Integer hijos) {
        this.hijos = hijos;
    }

    @Override
    public void cobrarSueldo() {
        super.cobrarSueldo();
        Double totalACobrar = sueldoBasico + max(LIMITE_HIJO, SUP_HIJO * hijos)
                + max(LIMITE_ANTIGUEDAD, SUP_ANTIGUEDAD * antiguedad);
        System.out.println("Cobro $ " + totalACobrar);
    }
}
