package modelo;

public class Material {
    private int idMaterial;
    private String tipo;
    private double precioCompra;
    private double precioVenta;
    private double existencia;
    private byte estado;

    public Material() {
    }

    public Material(int idMaterial, String tipo, double precioCompra, double precioVenta, double existencia, byte estado) {
        this.idMaterial = idMaterial;
        this.tipo = tipo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.existencia = existencia;
        this.estado = estado;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setidMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }
    
    public void habilitar(){
        this.estado = ((byte)1);
    }
    
    public void deshabilitar() {
        this.estado = ((byte)0);
    }

}
