
package MD;
import DP.*;
import java.sql.*;

public class UsuarioMD {
    
    //Atributos de la clase
    private String codigoUsuarioMD;
    private String nombreUsuarioMD;
    private String apellidoUsuarioMD;
    private String especialidadUsuarioMD;
    private String celularUsuarioMD;
    private String direccionUsuarioMD;
    
    //Constructores de la clase
    public UsuarioMD(Usuario usuario)
    {
        codigoUsuarioMD = usuario.getCodigoUsuario();
        nombreUsuarioMD = usuario.getNombreUsuario();
        apellidoUsuarioMD = usuario.getApellidoUsuario();
        especialidadUsuarioMD = usuario.getEspecialidadUsuario();
        celularUsuarioMD = usuario.getCelularUsuario();
        direccionUsuarioMD = usuario.getDireccionUsuario();
    }
    
    //Métodos para realizar inserción, eliminación, actualización, consulta y verificación de registros en la base de datos
    public void insertarUsuarioMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("insert into usuario values('"+this.codigoUsuarioMD+"','"+this.nombreUsuarioMD+"','"+this.apellidoUsuarioMD+"',"
                  + "'"+this.especialidadUsuarioMD+"','"+this.celularUsuarioMD+"','"+this.direccionUsuarioMD+"')"); 
        } catch(SQLException ex){
        }
       
    }   
    
    public void eliminarUsuarioMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("delete from usuario where codigoUsuario = '"+this.codigoUsuarioMD+"'");
        } catch(SQLException ex){
        }
    }   
    
    public void actualizarUsuarioMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("update usuario set nombreUsuario='"+this.nombreUsuarioMD+"',apellidoUsuario='"+this.apellidoUsuarioMD+"',"
                  +" especialidadUsuario='"+this.especialidadUsuarioMD+"',celularUsuario='"+this.celularUsuarioMD+"',direccionUsuario='"+this.direccionUsuarioMD+"' "
                  +" where codigoUsuario='"+this.codigoUsuarioMD+"' ");  
        } catch(SQLException ex){
            System.out.print(ex);
        }
    }   
    
    public Boolean verificarCodigoUsuarioMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          ResultSet rs = consulta.executeQuery("select codigoUsuario from usuario where codigoUsuario = '"+this.codigoUsuarioMD+"' ");
          if (rs.next())
              return true;
        }catch(SQLException ex){
            System.out.print(ex);
        }
       return false;
    }   
    
    public Usuario consultarUsuarioMD() throws ClassNotFoundException
    {
       Usuario usuarioTMP = new Usuario();
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          ResultSet rs = consulta.executeQuery("select * from usuario where codigoUsuario = '"+this.codigoUsuarioMD+"' ");
          while(rs.next())
          {
              usuarioTMP.setCodigoUsuario(rs.getString(1));
              usuarioTMP.setNombreUsuario(rs.getString(2));
              usuarioTMP.setApellidoUsuario(rs.getString(3));
              usuarioTMP.setEspecialidadUsuario(rs.getString(4));
              usuarioTMP.setCelularUsuario(rs.getString(5));
              usuarioTMP.setDireccionUsuario(rs.getString(6));
          }      
        }catch(SQLException ex){
            System.out.print(ex);
        }
       
       return usuarioTMP;
    }   
}
