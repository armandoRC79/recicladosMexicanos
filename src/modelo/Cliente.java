package modelo;

public class Cliente {
    int idCliente;
    String razonSocial;
    String RFC;
    String telefono;
    String correo;
    byte estado;

    public Cliente() {
    }

    public Cliente(int idCliente, String razonSocial, String RFC, String telefono, String correo, byte estado) {
        this.idCliente = idCliente;
        this.razonSocial = razonSocial;
        this.RFC = RFC;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

}
