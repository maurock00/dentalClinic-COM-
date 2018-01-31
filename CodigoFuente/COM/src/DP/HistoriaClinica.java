/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DP;
import MD.*;
import java.sql.Date;

public class HistoriaClinica {
    
    //Atributos de la clase HistoriaClinica
    private String codigoHistoriaClinica;
    private String codigoUsuario;
    private String codigoPaciente;
    private Date fechaHistoriaClinica;
    private String p1;
    private String p2;
    private String p3;
    private int p4;
    private int p5;
    private String p6;
    private String p7;
    private int p8;
    private int p9;
    private int p10;
    private String p11;
    private String p12;
    private int p13;
    private int p14;
    private int p15;
    private int p16;
    private String p17;
    private String p18;
    private String p19;
    private String p20;
    private String p21;
    private String p22;
    private String p23;
    private HistoriaClinicaMD historiaClinicaMD;
    
    //Coonstructores de la clase
    public HistoriaClinica(){
    }

    public HistoriaClinica(String codigoHistoriaClinica)
    {
        this.codigoHistoriaClinica = codigoHistoriaClinica;
    }

    public HistoriaClinica(String codigoHistoriaClinica, String codigoUsuario, String codigoPaciente, Date fechaHistoriaClinica, String p1, String p2, String p3, int p4, int p5, String p6, String p7, int p8, int p9, int p10, String p11, String p12, int p13, int p14, int p15, int p16, String p17, String p18, String p19, String p20, String p21, String p22, String p23) {
        this.codigoHistoriaClinica = codigoHistoriaClinica;
        this.codigoUsuario = codigoUsuario;
        this.codigoPaciente = codigoPaciente;
        this.fechaHistoriaClinica = fechaHistoriaClinica;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
        this.p7 = p7;
        this.p8 = p8;
        this.p9 = p9;
        this.p10 = p10;
        this.p11 = p11;
        this.p12 = p12;
        this.p13 = p13;
        this.p14 = p14;
        this.p15 = p15;
        this.p16 = p16;
        this.p17 = p17;
        this.p18 = p18;
        this.p19 = p19;
        this.p20 = p20;
        this.p21 = p21;
        this.p22 = p22;
        this.p23 = p23;
    }
    
    //Métodos set de la clase
    public void setCodigoHistoriaClinica(String codigoHistoriaClinica) {
        this.codigoHistoriaClinica = codigoHistoriaClinica;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public void setFechaHistoriaClinica(Date fechaHistoriaClinica) {
        this.fechaHistoriaClinica = fechaHistoriaClinica;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public void setP4(int p4) {
        this.p4 = p4;
    }

    public void setP5(int p5) {
        this.p5 = p5;
    }

    public void setP6(String p6) {
        this.p6 = p6;
    }

    public void setP7(String p7) {
        this.p7 = p7;
    }

    public void setP8(int p8) {
        this.p8 = p8;
    }

    public void setP9(int p9) {
        this.p9 = p9;
    }

    public void setP10(int p10) {
        this.p10 = p10;
    }

    public void setP11(String p11) {
        this.p11 = p11;
    }

    public void setP12(String p12) {
        this.p12 = p12;
    }

    public void setP13(int p13) {
        this.p13 = p13;
    }

    public void setP14(int p14) {
        this.p14 = p14;
    }

    public void setP15(int p15) {
        this.p15 = p15;
    }

    public void setP16(int p16) {
        this.p16 = p16;
    }

    public void setP17(String p17) {
        this.p17 = p17;
    }

    public void setP18(String p18) {
        this.p18 = p18;
    }

    public void setP19(String p19) {
        this.p19 = p19;
    }

    public void setP20(String p20) {
        this.p20 = p20;
    }

    public void setP21(String p21) {
        this.p21 = p21;
    }

    public void setP22(String p22) {
        this.p22 = p22;
    }

    public void setP23(String p23) {
        this.p23 = p23;
    }
    
    //Métodos get de la clase
    public String getCodigoHistoriaClinica() {
        return codigoHistoriaClinica;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public Date getFechaHistoriaClinica() {
        return fechaHistoriaClinica;
    }

    public String getP1() {
        return p1;
    }

    public String getP2() {
        return p2;
    }

    public String getP3() {
        return p3;
    }

    public int getP4() {
        return p4;
    }

    public int getP5() {
        return p5;
    }

    public String getP6() {
        return p6;
    }

    public String getP7() {
        return p7;
    }

    public int getP8() {
        return p8;
    }

    public int getP9() {
        return p9;
    }

    public int getP10() {
        return p10;
    }

    public String getP11() {
        return p11;
    }

    public String getP12() {
        return p12;
    }

    public int getP13() {
        return p13;
    }

    public int getP14() {
        return p14;
    }

    public int getP15() {
        return p15;
    }

    public int getP16() {
        return p16;
    }

    public String getP17() {
        return p17;
    }

    public String getP18() {
        return p18;
    }

    public String getP19() {
        return p19;
    }

    public String getP20() {
        return p20;
    }

    public String getP21() {
        return p21;
    }

    public String getP22() {
        return p22;
    }

    public String getP23() {
        return p23;
    }
    
    //Puente con la capa de datos MD
    public void ingresarHistoriaClinica() throws ClassNotFoundException
    {
        historiaClinicaMD = new HistoriaClinicaMD(this);
        historiaClinicaMD.insertarHistoriaClinicaMD();
    }  
    
    public void elminarHistoriaClinica() throws ClassNotFoundException
    {
        historiaClinicaMD = new HistoriaClinicaMD(this);
        historiaClinicaMD.elminarHistoriaClinicaMD();
    }  
    
    public void actualizarHistoriaClinica() throws ClassNotFoundException
    {
        historiaClinicaMD = new HistoriaClinicaMD(this);
        historiaClinicaMD.actualizarHistoriaClinicaMD();
    }  
    
    public boolean verificarCodigoHistoriaClinica() throws ClassNotFoundException
    {
        historiaClinicaMD = new HistoriaClinicaMD(this);
        if(historiaClinicaMD.verificarCodigoHistoriaClinicaMD())
            return true;
        return false;
    }  
    
    public HistoriaClinica consultarHistoriaClinica() throws ClassNotFoundException
    {
         historiaClinicaMD = new HistoriaClinicaMD(this);
         HistoriaClinica historiaClinicaTMP = historiaClinicaMD.consultarHistoriaClinicaMD();
         
         return historiaClinicaTMP;
    }
    
}
