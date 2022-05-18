package modelo;

public class Medio {
    private int idMedio;
    private int numeroCuenta;
    private int numeroTarjeta;
    private int cuentaClabe;
    boolean efectivo;

    public Medio() {
    }

    public Medio(int idMedio, int numeroCuenta, int numeroTarjeta, int cuentaClabe, boolean efectivo) {
        this.idMedio = idMedio;
        this.numeroCuenta = numeroCuenta;
        this.numeroTarjeta = numeroTarjeta;
        this.cuentaClabe = cuentaClabe;
        this.efectivo = efectivo;
    }

    public int getIdMedio() {
        return idMedio;
    }

    public void setIdMedio(int idMedio) {
        this.idMedio = idMedio;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCuentaClabe() {
        return cuentaClabe;
    }

    public void setCuentaClabe(int cuentaClabe) {
        this.cuentaClabe = cuentaClabe;
    }

    public boolean isEfectivo() {
        return efectivo;
    }

    public void setEfectivo(boolean efectivo) {
        this.efectivo = efectivo;
    }
    
}
