package Herencia.Ejercicio2.Empleado;

/**
 * Created by digitalhouse on 25/08/16.
 */
public class EmpleadoAPlazoFijo extends Empleado {
    private Integer mesesDeContrato;

    public EmpleadoAPlazoFijo(String nombre) {
        super(nombre);
    }

    public void setMesesDeContrato(Integer mesesDeContrato) {
        this.mesesDeContrato = mesesDeContrato;
    }

    public Integer getMesesDeContrato() {

        return mesesDeContrato;
    }
}
