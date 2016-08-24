package Herencia.Banco;

/**
 * Created by digitalhouse on 24/08/16.
 */
public class Cheque {
    private Double monto;
    private String bancoEmisor;
    private String fechaDePago;

    public Cheque(Double monto, String bancoEmisor, String fechaDePago) {
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        this.fechaDePago = fechaDePago;
    }

    public Double getMonto() {
        return monto;
    }

    public String getBancoEmisor() {
        return bancoEmisor;
    }

    public String getFechaDePago() {
        return fechaDePago;
    }
}
