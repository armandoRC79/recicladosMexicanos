package basedatos;

import java.sql.Connection;//Conecta con la base de datos
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Rol;

public class RolDAO {
    private AdminBD admin;
    private Connection cn;
    private boolean conexionExitosa;
    private Statement stmt;
    private ResultSet rs;

    public RolDAO() {
        admin = new AdminBD();
        cn = null;
        stmt = null;
    }

    public RolDAO(Connection cn) {
        try {
            this.cn = cn;
            stmt = cn.createStatement();
            conexionExitosa = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de BD: " + ex);
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
    
    public boolean altaRol(Rol rol) {
        boolean bandera = false;
       /* JOptionPane.showMessageDialog(null, rol.getNombre()
                + "\n" + rol.getDescripcion()
                + "\n" + rol.getEstado());*/
        Rol rolAux = consultaRol(rol);
        if (rolAux == null){
            String sql = "INSERT INTO roles(nombre, descripcion, estado)"
                + "VALUES ('" + rol.getNombre() 
                    + "', '" + rol.getDescripcion() 
                    + "', '" + rol.getEstado() + "')";
            
            try {
                stmt.executeUpdate(sql);
                bandera = true;
                JOptionPane.showMessageDialog(null, "Rol registrado con éxito");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al registar rol" + ex);
            }
        }else{
            rolAux.habilitar();
            actualizar(rolAux);
            bandera = true;
        }
        return bandera;
    }
    
    private Rol consultaRol(Rol rol) {
        Rol rolRetorno = null;
        String sql = "SELECT * FROM roles WHERE nombre = '" + rol.getNombre()+"'";
        
        if(conexionExitosa == false)
            conectarBase();
        try {
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                rolRetorno = new Rol();
                rolRetorno.setIdRol(rs.getInt("idrol"));
                rolRetorno.setNombre(rs.getString("nombre"));
                rolRetorno.setDescripcion(rs.getString("descripcion"));
                rolRetorno.setEstado(rs.getByte("estado"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de consulta DB: " + ex);
        }
         return rolRetorno;
    }
    
    public boolean actualizar(Rol rol) {
        boolean bandera = false;
        String sql = "UPDATE roles SET "
                + "nombre = '" + rol.getNombre()
                + "', descripcion = '" + rol.getDescripcion()
                + "', estado = '" + rol.getEstado()
                + "' WHERE idrol = '" + rol.getIdRol() +"'";
        if(conexionExitosa == false)
            conectarBase();

        try {
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Rol actualizado");
            bandera = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error BD 2: " + ex);
        }
        return bandera;
    }
    
    public boolean eliminar(Rol rol) {
        boolean bandera = false;
        String sql = "UPDATE roles SET "
                + "nombre = '" + rol.getNombre()
                + "', descripcion = '" + rol.getDescripcion()
                + "', estado = '" + rol.getEstado()
                + "' WHERE idrol = '" + rol.getIdRol() +"'";
        if(conexionExitosa == false)
            conectarBase();

        try {
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Rol eliminado");
            bandera = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error BD 2: " + ex);
        }
        return bandera;
    }
    
    public static void main(String[] args) {
        Rol rol = new Rol();
        RolDAO rolDAO = new RolDAO();
        rol.setDescripcion("Lo ve todo");
        rol.setNombre("SuperUsuario");
        rol.habilitar();
        
        //System.out.println(rolDAO.consultaRol(rol).getDescripcion());
        //rolDAO.actualizar(rol);
        //rolDAO.altaRol(rol);
    }
}
