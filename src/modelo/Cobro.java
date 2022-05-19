
package modelo;

public class Cobro {
    private int idCobro;
    private String numeroCuenta;
    private String numeroTarjeta;
    private String clabe;
    private boolean efectivo;

    public Cobro() {
    }

    public Cobro(int idCobro, String numeroCuenta, String numeroTarjeta, String clabe, boolean efectivo) {
        this.idCobro = idCobro;
        this.numeroCuenta = numeroCuenta;
        this.numeroTarjeta = numeroTarjeta;
        this.clabe = clabe;
        this.efectivo = efectivo;
    }

    public int getIdCobro() {
        return idCobro;
    }

    public void setIdCobro(int idCobro) {
        this.idCobro = idCobro;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public boolean isEfectivo() {
        return efectivo;
    }

    public void setEfectivo(boolean efectivo) {
        this.efectivo = efectivo;
    }
}
