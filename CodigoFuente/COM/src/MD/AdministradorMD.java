

package MD;
import DP.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdministradorMD {
    
    //Atributos de la clase
    private int codigoAdministradorMD;
    private String nombreAdministradorMD;
    private String claveAdministradorMD;
    
    //Constructores de la clase
    public AdministradorMD(Administrador administrador) {
        this.codigoAdministradorMD = administrador.getCodigoAdministrador();
        this.nombreAdministradorMD = administrador.getNombreAdministrador();
        this.claveAdministradorMD = administrador.getClaveAdministrador();
    }

    public AdministradorMD(String nombreAdministradorMD, String claveAdministradorMD) {
        this.nombreAdministradorMD = nombreAdministradorMD;
        this.claveAdministradorMD = claveAdministradorMD;
    }

    //Métodos para realizar inserción, eliminación, actualización, consulta y verificación de registros en la base de datos
    public void insertarAdministradorMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("insert into administrador(nombreAdministrador,claveAdministrador) values('"+this.nombreAdministradorMD+"','"+this.claveAdministradorMD+"')"); 
        } catch(SQLException ex){
        }   
    }   
    
    public void eliminarAdministradorMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("delete from administrador where nombreAdministrador='"+this.nombreAdministradorMD+"' "); 
        } catch(SQLException ex){
        }   
    }   
    
    public void actualizarAdministradorMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("update administrador set nombreAdministrador='"+this.nombreAdministradorMD+"',claveAdministrador='"+this.claveAdministradorMD+"' where "
                  + " nombreAdministrador='"+this.nombreAdministradorMD+"' "); 
        } catch(SQLException ex){
        }   
    }  
    
     public Boolean verificarAdministradorMD() throws ClassNotFoundException
     {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          ResultSet rs = consulta.executeQuery("select * from administrador where nombreAdministrador = '"+this.nombreAdministradorMD+"' and claveAdministrador='"+this.claveAdministradorMD+"' ");
          if (rs.next())
              return true;
        }catch(SQLException ex){
            System.out.print(ex);
        }
       return false;
     }   
}
