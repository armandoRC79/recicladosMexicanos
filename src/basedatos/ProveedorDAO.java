package basedatos;

import java.sql.Connection;//Conecta con la base de datos
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Proveedor;

public class ProveedorDAO {
    private AdminBD admin;
    private Connection cn;
    private boolean conexionExitosa;
    private Statement stmt;
    private ResultSet rs;

    public ProveedorDAO() {
        admin = new AdminBD();
        cn = null;
        stmt = null;
    }

    public ProveedorDAO(Connection cn) {
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
    
    public boolean altaProveedor(Proveedor proveedor){
        boolean bandera = false;
        Proveedor proveedorAux = consultaProveedor(proveedor);
        if (proveedorAux == null){
            proveedor.habilitar();
            String sql = "INSERT INTO proveedores(idCobro, razonSocial,"
                    + "RFC, telefono, direccion, correo, estado)"
                    + "VALUES ('" + proveedor.getIdCobro()
                    + "', '" + proveedor.getRazonSocial()
                    + "', '" + proveedor.getRFC()
                    + "', '" + proveedor.getTelefono()
                    + "', '" + proveedor.getDireccion()
                    + "', '" + proveedor.getCorreo()
                    + "', '" + proveedor.getEstado() + "')";
            
            try {
                stmt.executeUpdate(sql);
                bandera = true;
                JOptionPane.showMessageDialog(null, "Proveedor registrado con éxito");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error MPBD 2" + ex);
            }
        }else{
            proveedor.setIdProveedor(proveedorAux.getIdProveedor());
            actualizar(proveedor);
            bandera = true;
        }
        return bandera;
    }
    
    public Proveedor consultaProveedor(Proveedor proveedor) {
        Proveedor proveedorRetorno = null;
        String sql = "SELECT * FROM proveedores WHERE idProveedor = '" 
                + proveedor.getIdProveedor()+"'";
        
        if(conexionExitosa == false)
            conectarBase();
        try {
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                proveedorRetorno = new Proveedor();
                proveedorRetorno.setIdProveedor(rs.getInt("idProveedor"));
                proveedorRetorno.setIdCobro(rs.getInt("idCobro"));
                proveedorRetorno.setRazonSocial(rs.getString("razonSocial"));
                proveedorRetorno.setRFC(rs.getString("RFC"));
                proveedorRetorno.setTelefono(rs.getString("telefono"));
                proveedorRetorno.setDireccion(rs.getString("direccion"));
                proveedorRetorno.setCorreo(rs.getString("correo"));
                proveedorRetorno.setEstado(rs.getByte("estado"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de MPDB 3: " + ex);
        }
         return proveedorRetorno;
    }
    
    public boolean actualizar(Proveedor proveedor) {
        boolean bandera = false;
        String sql = "UPDATE proveedores SET "
                + "idCobro = '" + proveedor.getIdCobro()
                + "', razonSocial = '" + proveedor.getRazonSocial()
                + "', RFC = '" + proveedor.getRFC()
                + "', telefono = '" + proveedor.getTelefono()
                + "', direccion = '" + proveedor.getDireccion()
                + "', correo = '" + proveedor.getCorreo()
                + "', estado = '" + proveedor.getEstado()
                + "' WHERE idMaterial = '" + proveedor.getIdProveedor() +"'";
        if(conexionExitosa == false)
            conectarBase();

        try {
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Proveedor actualizado");
            bandera = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error MPBD 4: " + ex);
        }
        return bandera;
    }
    
        public static void main(String[] args) {
        Proveedor proveedor = new Proveedor();
        ProveedorDAO proveedorDAO = new ProveedorDAO();
        proveedor.setIdProveedor(1);
        proveedor.setIdCobro(1);
        proveedor.setRazonSocial("Tomates del monte");
        proveedor.setRFC("TMSA010605ELS");
        proveedor.setTelefono("55524525633");
        proveedor.setDireccion("Calle alamo");
        proveedor.setCorreo("tomaste@delmonte.com");
        proveedor.habilitar();
        
        System.out.println(proveedorDAO.consultaProveedor(proveedor).getRazonSocial());
        //materialDAO.actualizar(material);
        //proveedorDAO.altaProveedor(proveedor);
    }
}
