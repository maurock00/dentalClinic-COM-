
package MD;

import DP.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DienteMD {
   
    //Atributos de la clase
    private int codigoDienteMD;
    private String codigoHistoriaClinicaMD;
    private String indiceDienteMD;
    private String diagnosticoDienteMD;
    private String tratamientoDienteMD;
    private Date fechaRevisionDienteMD;
    private int caraAMD;
    private int caraBMD;
    private int caraCMD;
    private int caraDMD;
    private int caraEMD;
    
    //Constructores de la clase
    public DienteMD(Diente diente) {
        this.codigoDienteMD = diente.getCodigoDiente();
        this.codigoHistoriaClinicaMD = diente.getCodigoHistoriaClinica();
        this.indiceDienteMD = diente.getIndiceDiente();
        this.diagnosticoDienteMD = diente.getDiagnosticoDiente();
        this.tratamientoDienteMD = diente.getTratamientoDiente();
        this.fechaRevisionDienteMD = diente.getFechaRevisionDiente();
        this.caraAMD = diente.getCaraA();
        this.caraBMD = diente.getCaraB();
        this.caraCMD = diente.getCaraC();
        this.caraDMD = diente.getCaraD();
        this.caraEMD = diente.getCaraE();
    }

    public DienteMD(String codigoHistoriaClinica) {
        this.codigoHistoriaClinicaMD = codigoHistoriaClinica;
    }
    
    //Métodos para realizar inserción, eliminación, actualización, consulta y verificación de registros en la base de datos
    public void insertarDienteMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("insert into diente(codigoHistoriaClinica,indiceDiente,diagnosticoDiente,tratamientoDiente,fechaRevisionDiente, "
                  +" caraA,caraB,caraC,caraD,caraE) "
                  +" values('"+this.codigoHistoriaClinicaMD+"','"+this.indiceDienteMD+"',"
                  +" '"+this.diagnosticoDienteMD+"','"+this.tratamientoDienteMD+"','"+this.fechaRevisionDienteMD+"', "
                  +" '"+this.caraAMD+"','"+this.caraBMD+"','"+this.caraCMD+"','"+this.caraDMD+"','"+this.caraEMD+"') "); 
        } catch(SQLException ex){
            System.out.print(ex);
        }
    } 
    
    public void eliminarDienteMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("delete from diente where codigoHistoriaClinica = '"+this.codigoHistoriaClinicaMD+"' and indiceDiente='"+this.indiceDienteMD+"' ");
        } catch(SQLException ex){
            System.out.println(ex);   
        }
    }   
    
    public void actualizarDienteMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("update diente set codigoHistoriaClinica='"+this.codigoHistoriaClinicaMD+"',indiceDiente='"+this.indiceDienteMD+"',"
                  +" diagnosticoDiente='"+this.diagnosticoDienteMD+"',tratamientoDiente='"+this.tratamientoDienteMD+"',fechaRevisionDiente='"+this.fechaRevisionDienteMD+"', "
                  +" caraA='"+this.caraAMD+"',caraB='"+this.caraBMD+"',caraC='"+this.caraCMD+"',caraD='"+this.caraDMD+"',caraE='"+this.caraEMD+"'"
                  +" where codigoHistoriaClinica = '"+this.codigoHistoriaClinicaMD+"' and indiceDiente='"+this.indiceDienteMD+"' "); 
        } catch(SQLException ex){
            System.out.print(ex);
        }
    } 
    
    public Boolean verificarDienteMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          ResultSet rs = consulta.executeQuery("select codigoHistoriaClinica,indiceDiente from diente"
                  +" where codigoHistoriaClinica = '"+this.codigoHistoriaClinicaMD+"' and indiceDiente='"+this.indiceDienteMD+"' ");
          if (rs.next())
              return true;
        }catch(SQLException ex){
            System.out.print(ex);
        }
       return false;
    }   
    
    public Diente consultarDienteMD() throws ClassNotFoundException
    {
       Diente dienteTMP = new Diente(); 
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          ResultSet rs = consulta.executeQuery("select * from diente"
                  +" where codigoHistoriaClinica = '"+this.codigoHistoriaClinicaMD+"' and indiceDiente='"+this.indiceDienteMD+"' ");
          while(rs.next())
          {
            dienteTMP.setCodigoDiente(rs.getInt(1));
            dienteTMP.setCodigoHistoriaClinica(rs.getString(2));
            dienteTMP.setIndiceDiente(rs.getString(3));
            dienteTMP.setDiagnosticoDiente(rs.getString(4));
            dienteTMP.setTratamientoDiente(rs.getString(5));
            dienteTMP.setFechaRevisionDiente(rs.getDate(6));
            dienteTMP.setCaraA(rs.getInt(7));
            dienteTMP.setCaraB(rs.getInt(8));
            dienteTMP.setCaraC(rs.getInt(9));
            dienteTMP.setCaraD(rs.getInt(10));
            dienteTMP.setCaraE(rs.getInt(11));
          }
              

        }catch(SQLException ex){
            System.out.print(ex);
        }
       return dienteTMP;
    }   
    
    public ArrayList<Diente> consultarDientesMD() throws ClassNotFoundException
    {
       ArrayList<Diente> dientes = new ArrayList<Diente>(); 
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          ResultSet rs = consulta.executeQuery("select * from diente"
                  +" where codigoHistoriaClinica = '"+this.codigoHistoriaClinicaMD+"' ");
          while(rs.next())
          { 
            Diente dienteTMP = new Diente(); 
            dienteTMP.setCodigoDiente(rs.getInt(1));
            dienteTMP.setCodigoHistoriaClinica(rs.getString(2));
            dienteTMP.setIndiceDiente(rs.getString(3));
            dienteTMP.setDiagnosticoDiente(rs.getString(4));
            dienteTMP.setTratamientoDiente(rs.getString(5));
            dienteTMP.setFechaRevisionDiente(rs.getDate(6));
            dienteTMP.setCaraA(rs.getInt(7));
            dienteTMP.setCaraB(rs.getInt(8));
            dienteTMP.setCaraC(rs.getInt(9));
            dienteTMP.setCaraD(rs.getInt(10));
            dienteTMP.setCaraE(rs.getInt(11));
            dientes.add(dienteTMP);
          }
        }catch(SQLException ex){
            System.out.print(ex);
        }
       return dientes;
    }   
    
}
