package basedatos;

import java.sql.Connection;//Conecta con la base de datos
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Material;

public class MaterialDAO {
    private AdminBD admin;
    private Connection cn;
    private boolean conexionExitosa;
    private Statement stmt;
    private ResultSet rs;

    public MaterialDAO() {
        admin = new AdminBD();
        cn = null;
        stmt = null;
    }

    public MaterialDAO(Connection cn) {
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
    
    public boolean altaMaterial(Material material){
        boolean bandera = false;
        Material materialAux = consultaMaterial(material);
        if (materialAux == null){
            material.habilitar();
            String sql = "INSERT INTO materiales(idMaterial, tipo, precioCompra,"
                    + "precioVenta, existencia, estado)"
                    + "VALUES ('" + material.getIdMaterial()
                    + "', '" + material.getTipo()
                    + "', '" + material.getPrecioCompra()
                    + "', '" + material.getPrecioVenta()
                    + "', '" + material.getExistencia()
                    + "', '" + material.getEstado() + "')";
            
            try {
                stmt.executeUpdate(sql);
                bandera = true;
                JOptionPane.showMessageDialog(null, "Material registrado con éxito");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error BD 2" + ex);
            }
        }else{
            material.setidMaterial(materialAux.getIdMaterial());
            actualizar(material);
            bandera = true;
        }
        return bandera;
    }
    
    public Material consultaMaterial(Material material) {
        Material materialRetorno = null;
        String sql = "SELECT * FROM materiales WHERE idMaterial = '" 
                + material.getIdMaterial()+"'";
        
        if(conexionExitosa == false)
            conectarBase();
        try {
            rs = stmt.executeQuery(sql);
            if(rs.next()){
                materialRetorno = new Material();
                materialRetorno.setidMaterial(rs.getInt("idMaterial"));
                materialRetorno.setTipo(rs.getString("tipo"));
                materialRetorno.setPrecioCompra(rs.getDouble("precioCompra"));
                materialRetorno.setPrecioVenta(rs.getDouble("precioVenta"));
                materialRetorno.setExistencia(rs.getDouble("existencia"));
                materialRetorno.setEstado(rs.getByte("estado"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de DB 3: " + ex);
        }
         return materialRetorno;
    }
    
    public boolean actualizar(Material material) {
        boolean bandera = false;
        String sql = "UPDATE Materiales SET "
                + "tipo = '" + material.getTipo()
                + "', precioCompra = '" + material.getPrecioCompra()
                + "', precioVenta = '" + material.getPrecioVenta()
                + "', existencia = '" + material.getExistencia()
                + "', estado = '" + material.getEstado()
                + "' WHERE idMaterial = '" + material.getIdMaterial() +"'";
        if(conexionExitosa == false)
            conectarBase();

        try {
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Material actualizado");
            bandera = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error BD 4: " + ex);
        }
        return bandera;
    }
    
        public static void main(String[] args) {
        Material material = new Material();
        MaterialDAO materialDAO = new MaterialDAO();
        material.setidMaterial(1);
        material.setTipo("HDPT");
        material.setPrecioCompra(16.5);
        material.setPrecioVenta(17.5);
        material.setExistencia(50);
        material.habilitar();
        
        System.out.println(materialDAO.consultaMaterial(material).getTipo());
        //materialDAO.actualizar(material);
        //materialDAO.altaMaterial(material);
    }
}
