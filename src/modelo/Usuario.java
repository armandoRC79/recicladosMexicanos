package modelo;

public class Usuario {
    private int idUsuario;
    private int idRol;
    private String nombreUsuario;
    private String claveIngreso;
    private byte estado;

    public Usuario() {
    }

    public Usuario(int idUsuario, int idRol, String nombreUsuario, String claveIngreso, byte estado) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.nombreUsuario = nombreUsuario;
        this.claveIngreso = claveIngreso;
        this.estado = estado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClaveIngreso() {
        return claveIngreso;
    }

    public void setClaveIngreso(String claveIngreso) {
        this.claveIngreso = claveIngreso;
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