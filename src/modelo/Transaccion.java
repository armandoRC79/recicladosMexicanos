package modelo;

public class Transaccion {
    int idTransaccion;
    String fecha;

    public Transaccion() {
    }

    public Transaccion(int idTransaccion, String fecha) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
