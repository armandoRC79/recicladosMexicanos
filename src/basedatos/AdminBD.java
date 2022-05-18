package basedatos;

import java.sql.Connection;//Conecta con la base de datos
import java.sql.DriverManager;//Gestiona los dirves
import java.sql.SQLException;//Se encarga del tratamiento de errores en BD SQL
import javax.swing.JOptionPane;

public class AdminBD {
    private final String URL;
    private final String usuario;
    private final String psw;
    private final String esquema;
    private final String host;
    private final String baseDatos;
    private final String driver;

    public AdminBD() {
        esquema = "jdbc:mysql:";
        host = "localhost";
        baseDatos = "bdrecicladosmexicanos";
        usuario = "root";
        psw = "";
        driver ="com.mysql.jdbc.Driver";
        URL = esquema + "//" + host + "/" + baseDatos;
    }
    
    public Connection getConexion () {
        Connection conexion = null;
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(URL,usuario,psw);
            System.out.println("conectado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error BD 1: "+ex);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error general de aplicación\n" + e);
        }
        return conexion;
    }
}
