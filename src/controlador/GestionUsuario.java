package controlador;

import basedatos.UsuarioDAO;
import java.util.List;
import modelo.Usuario;

public class GestionUsuario {
    private Usuario usuario;
    private UsuarioDAO usuarioDAO;

    public GestionUsuario() {
        this.usuarioDAO = new UsuarioDAO();
    }
   
    public boolean alta(Usuario usuario) {
        boolean bandera = false;
        usuario.habilitar();
        bandera = this.usuarioDAO.altaUsuario(usuario);
        return bandera;
    }
    
    public boolean modificar(Usuario usuario) {
        boolean bandera = false;
        bandera = this.usuarioDAO.altaUsuario(usuario);
        return bandera;
    }
    
    public boolean eliminar(Usuario usuario) {
        boolean bandera = false;
        usuario.deshabilitar();
        bandera = this.usuarioDAO.actualizar(usuario);
        return bandera;
    }
    
    public List<Usuario> listaUsuariosActivos() {
        return this.usuarioDAO.listaUsuarios((byte)1);
    }
    
    public Usuario ValidaUsuario(Usuario usuario){
        return usuarioDAO.consultaUsuario(usuario);
    }
}
