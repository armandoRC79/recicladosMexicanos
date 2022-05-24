package controlador;

import basedatos.UsuarioDAO;
import modelo.Usuario;

public class GestionUsuario {
    private Usuario usuario;
    private UsuarioDAO usuarioDAO;

    public GestionUsuario() {
        this.usuarioDAO = new UsuarioDAO();
    }
   
    public boolean alta(Usuario usuario) {
        boolean bandera = false;
        bandera = this.usuarioDAO.altausuario(usuario);
        return bandera;
    }
    
    public boolean modificar(Usuario usuario) {
        boolean bandera = false;
        bandera = this.usuarioDAO.altausuario(usuario);
        return bandera;
    }
    
    public boolean eliminar(Usuario usuario) {
        boolean bandera = false;
        usuario.deshabilitar();
        bandera = this.usuarioDAO.actualizar(usuario);
        return bandera;
    }
    
}
