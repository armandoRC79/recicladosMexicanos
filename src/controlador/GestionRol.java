package controlador;

import basedatos.RolDAO;
import modelo.Rol;

public class GestionRol {
    private Rol rol;
    private RolDAO rolDAO;
    
    public GestionRol() {
        this.rolDAO = new RolDAO();
    }

    public GestionRol(Rol rol) {
        this.rol = rol;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    public boolean registrarRol(Rol rol) {
        return rolDAO.altaRol(rol);
    }
}
