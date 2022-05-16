package modelo;

public class Usuario {
    int idUsuario;
    int idRol;
    String nombreUsuario;
    String claveIngreso;

    public Usuario() {
    }

    public Usuario(int idUsuario, int idRol, String nombreUsuario, String claveIngreso) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.nombreUsuario = nombreUsuario;
        this.claveIngreso = claveIngreso;
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
}