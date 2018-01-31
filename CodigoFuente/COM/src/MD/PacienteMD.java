

package MD;

import java.sql.Date;
import DP.*; 
import java.sql.*;

public class PacienteMD {
    
    //Atributos de la clase
    private String codigoPacienteMD;
    private String claveNoPacienteMD;
    private String nombrePacienteMD;
    private String apellidoPacienteMD;
    private Date fechaNacimientoPacienteMD;
    private String empresaPacienteMD;
    private String telefonoPacienteMD;
    private String ocupacionPacienteMD; 
    
    //Constructores de la clase
    public PacienteMD(Paciente paciente) {
        this.codigoPacienteMD = paciente.getCodigoPaciente();
        this.claveNoPacienteMD = paciente.getClaveNoPaciente();
        this.nombrePacienteMD = paciente.getNombrePaciente();
        this.apellidoPacienteMD = paciente.getApellidoPaciente();
        this.fechaNacimientoPacienteMD = paciente.getFechaNacimientoPaciente();
        this.empresaPacienteMD = paciente.getEmpresaPaciente();
        this.telefonoPacienteMD = paciente.getTelefonoPaciente();
        this.ocupacionPacienteMD = paciente.getOcupacionPaciente();
    }
    
    //Métodos para realizar inserción, eliminación, actualización, consulta y verificación de registros en la base de datos
    public void insertarPacienteMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("insert into paciente values('"+this.codigoPacienteMD+"','"+this.claveNoPacienteMD+"','"+this.nombrePacienteMD+"',"
                  +" '"+this.apellidoPacienteMD+"','"+this.fechaNacimientoPacienteMD+"','"+this.empresaPacienteMD+"','"+this.telefonoPacienteMD+"',"
                  +" '"+this.ocupacionPacienteMD+"') "); 
        } catch(SQLException ex){
            System.out.print(ex);
        }
       
    }   
    
    public void eliminarPacienteMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("delete from paciente where codigoPaciente = '"+this.codigoPacienteMD+"'");
        } catch(SQLException ex){
        }
    }   
    
    public void actualizarPacienteMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("update paciente set claveNopaciente='"+this.claveNoPacienteMD+"',nombrePaciente='"+this.nombrePacienteMD+"',apellidoPaciente='"+this.apellidoPacienteMD+"',"
                  +" fechaNacimientoPaciente='"+this.fechaNacimientoPacienteMD+"',empresaPaciente='"+this.empresaPacienteMD+"',telefonoPaciente='"+this.telefonoPacienteMD+"', "
                  +" ocupacionPaciente='"+this.ocupacionPacienteMD+"' where codigoPaciente='"+this.codigoPacienteMD+"' ");  
        } catch(SQLException ex){
            System.out.print(ex);
        }
    }   
    
    public Boolean verificarCodigoPacienteMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          ResultSet rs = consulta.executeQuery("select codigoPaciente from paciente where codigoPaciente = '"+this.codigoPacienteMD+"' ");
          if (rs.next())
              return true;
        }catch(SQLException ex){
            System.out.print(ex);
        }
       return false;
    }   
    
    public Paciente consultarPacienteMD() throws ClassNotFoundException
    {
       Paciente pacienteTMP = new Paciente();
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          ResultSet rs = consulta.executeQuery("select * from paciente where codigoPaciente = '"+this.codigoPacienteMD+"' ");
          while(rs.next())
          {
              pacienteTMP.setCodigoPaciente(rs.getString(1));
              pacienteTMP.setClaveNoPaciente(rs.getString(2));
              pacienteTMP.setNombrePaciente(rs.getString(3));
              pacienteTMP.setApellidoPaciente(rs.getString(4));
              pacienteTMP.setFechaNacimientoPaciente(rs.getDate(5));
              pacienteTMP.setEmpresaPaciente(rs.getString(6));
              pacienteTMP.setTelefonoPaciente(rs.getString(7));
              pacienteTMP.setOcupacionPaciente(rs.getString(8));
          }      
        }catch(SQLException ex){
            System.out.print(ex);
        }
       
       return pacienteTMP;
    }   
    
}
