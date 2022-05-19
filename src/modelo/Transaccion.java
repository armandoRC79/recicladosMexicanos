package modelo;

public class Transaccion {
    private int idTransaccion;
    private int idUsuario;
    private String fecha;

    public Transaccion(int idTransaccion, int idUsuario, String fecha) {
        this.idTransaccion = idTransaccion;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
    }

    public Transaccion() {
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
