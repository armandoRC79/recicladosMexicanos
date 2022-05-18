package modelo;

public class Pago extends Medio{
    int idCliente;

    public Pago() {
    }

    public Pago(int idCliente) {
        this.idCliente = idCliente;
    }

    public Pago(int idCliente, int idMedio, int numeroCuenta, 
            int numeroTarjeta, int cuentaClabe, boolean efectivo) {
        super(idMedio, numeroCuenta, numeroTarjeta, cuentaClabe, efectivo);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isEfectivo() {
        return efectivo;
    }

    public void setEfectivo(boolean efectivo) {
        this.efectivo = efectivo;
    }
    
}
