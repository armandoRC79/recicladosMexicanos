package basedatos;

import java.sql.Connection;//Conecta con la base de datos
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class UsuarioDAO {
    private AdminBD admin;
    private Connection cn;
    private Statement stmt;
    private ResultSet rs;
    private boolean conexionExitosa;

    public UsuarioDAO() {
        admin = new AdminBD();
        cn = null;
        stmt = null;
    }

    public UsuarioDAO(Connection cn) {
        try {
            this.cn = cn;
            stmt = cn.createStatement();
            conexionExitosa = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD 1: " + ex);
        }
    }
    
    public void conectarBase() {
        try {
            cn = admin.getConexion();
            stmt = cn.createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD 1: " + ex);
        }
    }
    
    public boolean altausuario(Usuario usuario){
        boolean bandera = false;
        
        Usuario usuarioAux = consultausuario(usuario);
        if (usuarioAux == null && usuario != null){
            String sql = "INSERT INTO usuarios(idRol, nombreUsuario,"
                    + "claveIngreso, estado)"
                    + "VALUES ('" + usuario.getIdRol()
                    + "', '" + usuario.getNombreUsuario()
                    + "', '" + usuario.getClaveIngreso()
                    + "', '" + usuario.getEstado() + "')";
            
            try {
                stmt.executeUpdate(sql);
                bandera = true;
                //JOptionPane.showMessageDialog(null, "usuario registrado con éxito");
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "Error MUBD 2" + ex);
                System.out.println("Error de BD en MUser alta: " + ex);
            }
        }else{
            usuario.setIdUsuario(usuarioAux.getIdUsuario());
            actualizar(usuario);
            bandera = true;
        }
        return bandera;
    }
    
    public Usuario consultausuario(Usuario usuario) {
        Usuario usuarioRetorno = null;
        String sql = "SELECT * FROM usuarios WHERE idusuario = '" 
                + usuario.getIdUsuario()+"'";
        
        if(conexionExitosa == false)
            conectarBase();
        try {
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                usuarioRetorno = new Usuario();
                usuarioRetorno.setIdUsuario(rs.getInt("idUsuario"));
                usuarioRetorno.setIdRol(rs.getInt("idRol"));
                usuarioRetorno.setNombreUsuario(rs.getString("nombreUsuario"));
                usuarioRetorno.setClaveIngreso(rs.getString("claveIngreso"));
                usuarioRetorno.setEstado(rs.getByte("estado"));
            }
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error de MUDB 3: " + ex);
            System.out.println("Error de BD en MUser consulta: " + ex);
        }
         return usuarioRetorno;
    }
    
    public boolean actualizar(Usuario usuario) {
        boolean bandera = false;
        String sql = "UPDATE usuarios SET "
                + "idRol = '" + usuario.getIdRol()
                + "', nombreUsuario = '" + usuario.getNombreUsuario()
                + "', claveIngreso = '" + usuario.getClaveIngreso()
                + "', estado = '" + usuario.getEstado()
                + "' WHERE idUsuario = '" + usuario.getIdUsuario() +"'";
        if(conexionExitosa == false)
            conectarBase();

        try {
            stmt.executeUpdate(sql);
           // JOptionPane.showMessageDialog(null, "usuario actualizado");
            bandera = true;
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Error MUBD 4: " + ex);
            System.out.println("Error de BD en MUser actualiza: " + ex);
        }
        return bandera;
    }
    
        public static void main(String[] args) {
        Usuario usuario = new Usuario();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuario.setIdUsuario(1);
        usuario.setIdRol(1);
        usuario.setNombreUsuario("SuperUsuario");
        usuario.setClaveIngreso("123456");
        usuario.habilitar();
        
        System.out.println(usuarioDAO.consultausuario(usuario).getNombreUsuario());
        //materialDAO.actualizar(material);
        //usuarioDAO.altausuario(usuario);
    }
}
