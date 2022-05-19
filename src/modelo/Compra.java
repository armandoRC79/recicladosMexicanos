package modelo;

public class Compra extends Transaccion{

    public Compra(int idProveedor, int idTransaccion, int idUsuario, String fecha) {
        super(idTransaccion, idUsuario, fecha);
        this.idProveedor = idProveedor;
    }

    public Compra(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Compra() {
    }
    private int idProveedor;

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

}
