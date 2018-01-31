

package MD;
import DP.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HistoriaClinicaMD {
    
    //Atributos de la clase
    private String codigoHistoriaClinicaMD;
    private String codigoUsuarioMD;
    private String codigoPacienteMD;
    private Date fechaHistoriaClinicaMD;
    private String p1MD;
    private String p2MD;
    private String p3MD;
    private int p4MD;
    private int p5MD;
    private String p6MD;
    private String p7MD;
    private int p8MD;
    private int p9MD;
    private int p10MD;
    private String p11MD;
    private String p12MD;
    private int p13MD;
    private int p14MD;
    private int p15MD;
    private int p16MD;
    private String p17MD;
    private String p18MD;
    private String p19MD;
    private String p20MD;
    private String p21MD;
    private String p22MD;
    private String p23MD;
    
    //Constructores de la clase
    public HistoriaClinicaMD(HistoriaClinica historiaClinica) 
    {
        this.codigoHistoriaClinicaMD = historiaClinica.getCodigoHistoriaClinica();
        this.codigoUsuarioMD = historiaClinica.getCodigoUsuario();
        this.codigoPacienteMD = historiaClinica.getCodigoPaciente();
        this.fechaHistoriaClinicaMD = historiaClinica.getFechaHistoriaClinica();
        this.p1MD = historiaClinica.getP1();
        this.p2MD = historiaClinica.getP2();
        this.p3MD = historiaClinica.getP3();
        this.p4MD = historiaClinica.getP4();
        this.p5MD = historiaClinica.getP5();
        this.p6MD = historiaClinica.getP6();
        this.p7MD = historiaClinica.getP7();
        this.p8MD = historiaClinica.getP8();
        this.p9MD = historiaClinica.getP9();
        this.p10MD = historiaClinica.getP10();
        this.p11MD = historiaClinica.getP11();
        this.p12MD = historiaClinica.getP12();
        this.p13MD = historiaClinica.getP13();
        this.p14MD = historiaClinica.getP14();
        this.p15MD = historiaClinica.getP15();
        this.p16MD = historiaClinica.getP16();
        this.p17MD = historiaClinica.getP17();
        this.p18MD = historiaClinica.getP18();
        this.p19MD = historiaClinica.getP19();
        this.p20MD = historiaClinica.getP20();
        this.p21MD = historiaClinica.getP21();
        this.p22MD = historiaClinica.getP22();
        this.p23MD = historiaClinica.getP23();
    }
    
    //Métodos para realizar inserción, eliminación, actualización, consulta y verificación de registros en la base de datos
    public void insertarHistoriaClinicaMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("insert into historiaClinica values('"+this.codigoHistoriaClinicaMD+"','"+this.codigoUsuarioMD+"','"+this.codigoPacienteMD+"',"
                  +" '"+this.fechaHistoriaClinicaMD+"','"+this.p1MD+"','"+this.p2MD+"','"+this.p3MD+"','"+this.p4MD+"','"+this.p5MD+"','"+this.p6MD+"','"+this.p7MD+"',"
                  +" '"+this.p8MD+"','"+this.p9MD+"','"+this.p10MD+"','"+this.p11MD+"','"+this.p12MD+"','"+this.p13MD+"','"+this.p14MD+"','"+this.p15MD+"',"
                  +" '"+this.p16MD+"','"+this.p17MD+"','"+this.p18MD+"','"+this.p19MD+"','"+this.p20MD+"','"+this.p21MD+"','"+this.p22MD+"','"+this.p23MD+"') "); 
        } catch(SQLException ex){
            System.out.print(ex);
        }
    }  
    
    public void elminarHistoriaClinicaMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("delete from historiaClinica where codigoHistoriaClinica = '"+this.codigoHistoriaClinicaMD+"'");
        } catch(SQLException ex){
            System.out.println(ex);   
        }
    }   
    
    public void actualizarHistoriaClinicaMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          consulta.executeUpdate("update historiaClinica set "
                  +" fechaHistoriaClinica='"+this.fechaHistoriaClinicaMD+"',p1='"+this.p1MD+"',p2='"+this.p2MD+"',p3='"+this.p3MD+"',p4='"+this.p4MD+"',p5='"+this.p5MD+"',p6='"+this.p6MD+"',p7='"+this.p7MD+"',"
                  +" p8='"+this.p8MD+"',p9='"+this.p9MD+"',p10='"+this.p10MD+"',p11='"+this.p11MD+"',p12='"+this.p12MD+"',p13='"+this.p13MD+"',p14='"+this.p14MD+"',p15='"+this.p15MD+"',"
                  +" p16='"+this.p16MD+"',P17='"+this.p17MD+"',P18='"+this.p18MD+"',P19='"+this.p19MD+"',P20='"+this.p20MD+"',P21='"+this.p21MD+"',P22='"+this.p22MD+"',P23='"+this.p23MD+"' "); 
        } catch(SQLException ex){
            System.out.print(ex);
        }
    }  
    
    public Boolean verificarCodigoHistoriaClinicaMD() throws ClassNotFoundException
    {
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          ResultSet rs = consulta.executeQuery("select codigoHistoriaClinica from historiaClinica where codigoHistoriaClinica = '"+this.codigoHistoriaClinicaMD+"' ");
          if (rs.next())
              return true;
        }catch(SQLException ex){
            System.out.print(ex);
        }
       return false;
    }   
    
    public HistoriaClinica consultarHistoriaClinicaMD() throws ClassNotFoundException
    {
       HistoriaClinica HistoriaClinicaTMP = new HistoriaClinica();
       try {
          Connection conexion=ConexionMysql.obtenerConexion();
          Statement consulta=conexion.createStatement();
          ResultSet rs = consulta.executeQuery("select * from historiaClinica where codigoHistoriaClinica = '"+this.codigoHistoriaClinicaMD+"' ");
          while(rs.next())
          {
              HistoriaClinicaTMP.setFechaHistoriaClinica(rs.getDate(4));
              HistoriaClinicaTMP.setP1(rs.getString(5));
              HistoriaClinicaTMP.setP2(rs.getString(6));
              HistoriaClinicaTMP.setP3(rs.getString(7));
              HistoriaClinicaTMP.setP4(rs.getInt(8));
              HistoriaClinicaTMP.setP5(rs.getInt(9));
              HistoriaClinicaTMP.setP6(rs.getString(10));
              HistoriaClinicaTMP.setP7(rs.getString(11));
              HistoriaClinicaTMP.setP8(rs.getInt(12));
              HistoriaClinicaTMP.setP9(rs.getInt(13));
              HistoriaClinicaTMP.setP10(rs.getInt(14));
              HistoriaClinicaTMP.setP11(rs.getString(15));
              HistoriaClinicaTMP.setP12(rs.getString(16));
              HistoriaClinicaTMP.setP13(rs.getInt(17));
              HistoriaClinicaTMP.setP14(rs.getInt(18));
              HistoriaClinicaTMP.setP15(rs.getInt(19));
              HistoriaClinicaTMP.setP16(rs.getInt(20));
              
              
              HistoriaClinicaTMP.setP17(rs.getString(21));
              HistoriaClinicaTMP.setP18(rs.getString(22));
              HistoriaClinicaTMP.setP19(rs.getString(23));
              HistoriaClinicaTMP.setP20(rs.getString(24));
              HistoriaClinicaTMP.setP21(rs.getString(25));
              HistoriaClinicaTMP.setP22(rs.getString(26));
              HistoriaClinicaTMP.setP23(rs.getString(27));
              
          }      
        }catch(SQLException ex){
            System.out.print(ex);
        }
       
       return HistoriaClinicaTMP;
    }   
    
}
