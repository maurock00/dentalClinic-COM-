

package MD;
import java.sql.*;

public class ConexionMysql {
    
   private static Connection cnx = null;
   public static Connection obtenerConexion() throws SQLException, ClassNotFoundException {
      if (cnx == null) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/com", "root", "");
         } catch (SQLException ex) {
            throw new SQLException(ex);
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         }
      }
      return cnx;
   }
   public static void cerrarConexion() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }
}
