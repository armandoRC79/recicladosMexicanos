package controlador;

import basedatos.RolDAO;
import java.util.List;
import modelo.Rol;

public class GestionRol {
    private Rol rol;
    private RolDAO rolDAO;
    
    public GestionRol() {
        this.rolDAO = new RolDAO();
    }
    
    public boolean alta(Rol rol) {
        boolean bandera = false;
        rol.habilitar();
        bandera = this.rolDAO.altaRol(rol);
        return bandera;
    }
    
    public boolean modificar(Rol rol) {
        boolean bandera = false;
        bandera = this.rolDAO.actualizar(rol);
        return bandera;
    }
    
    public boolean eliminar(Rol rol) {
        boolean bandera = false;
        rol.deshabilitar();
        bandera = this.rolDAO.actualizar(rol);
        return bandera;
    }
            
    public List<Rol> lista() {
        return this.rolDAO.listaRoles();
    }
}
