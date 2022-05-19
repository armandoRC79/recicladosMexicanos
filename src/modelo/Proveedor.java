package modelo;

public class Proveedor{
    private int idProveedor;
    private int idCobro;
    private String razonSocial;
    private String RFC;
    private String telefono;
    private String direccion;
    private String correo;
    private byte estado;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, int idCobro, String razonSocial, String RFC, String telefono, String direccion, String correo, byte estado) {
        this.idProveedor = idProveedor;
        this.idCobro = idCobro;
        this.razonSocial = razonSocial;
        this.RFC = RFC;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.estado = estado;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdCobro() {
        return idCobro;
    }

    public void setIdCobro(int idCobro) {
        this.idCobro = idCobro;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void habilitar(){
        this.estado = ((byte)1);
    }
    
    public void deshabilitar() {
        this.estado = ((byte)0);
    }
    
}
