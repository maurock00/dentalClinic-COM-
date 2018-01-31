/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DP;

import MD.*;
import java.sql.Date;
import java.util.ArrayList;

public class Diente {
    
    //Atributos de la clase Diente
    private int codigoDiente;
    private String codigoHistoriaClinica;
    private String indiceDiente;
    private String diagnosticoDiente;
    private String tratamientoDiente;
    private Date fechaRevisionDiente;
    private int caraA;
    private int caraB;
    private int caraC;
    private int caraD;
    private int caraE;
    private DienteMD dienteMD;
    
    //Constructores de la clase diente
    public Diente() {
    }

    public Diente(String codigoHistoriaClinica) {
        this.codigoHistoriaClinica = codigoHistoriaClinica;
    }

    public Diente(String codigoHistoriaClinica, String indiceDiente) {
        this.codigoHistoriaClinica = codigoHistoriaClinica;
        this.indiceDiente = indiceDiente;
    }
    
    public Diente(int codigoDiente, String codigoHistoriaClinica, String indiceDiente, String diagnosticoDiente, String tratamientoDiente, Date fechaRevisionDiente, int caraA, int caraB, int caraC, int caraD, int caraE) {
        this.codigoDiente = codigoDiente;
        this.codigoHistoriaClinica = codigoHistoriaClinica;
        this.indiceDiente = indiceDiente;
        this.diagnosticoDiente = diagnosticoDiente;
        this.tratamientoDiente = tratamientoDiente;
        this.fechaRevisionDiente = fechaRevisionDiente;
        this.caraA = caraA;
        this.caraB = caraB;
        this.caraC = caraC;
        this.caraD = caraD;
        this.caraE = caraE;
    }
    
    //Métodos set de la clase diente
    public void setCodigoDiente(int codigoDiente) {
        this.codigoDiente = codigoDiente;
    }

    public void setCodigoHistoriaClinica(String codigoHistoriaClinica) {
        this.codigoHistoriaClinica = codigoHistoriaClinica;
    }

    public void setIndiceDiente(String indiceDiente) {
        this.indiceDiente = indiceDiente;
    }

    public void setDiagnosticoDiente(String diagnosticoDiente) {
        this.diagnosticoDiente = diagnosticoDiente;
    }

    public void setTratamientoDiente(String tratamientoDiente) {
        this.tratamientoDiente = tratamientoDiente;
    }

    public void setFechaRevisionDiente(Date fechaRevisionDiente) {
        this.fechaRevisionDiente = fechaRevisionDiente;
    }

    public void setCaraA(int caraA) {
        this.caraA = caraA;
    }

    public void setCaraB(int caraB) {
        this.caraB = caraB;
    }

    public void setCaraC(int caraC) {
        this.caraC = caraC;
    }

    public void setCaraD(int caraD) {
        this.caraD = caraD;
    }

    public void setCaraE(int caraE) {
        this.caraE = caraE;
    }
    
    //Métodos get de la clase diente
    public int getCodigoDiente() {
        return codigoDiente;
    }

    public String getCodigoHistoriaClinica() {
        return codigoHistoriaClinica;
    }

    public String getIndiceDiente() {
        return indiceDiente;
    }

    public String getDiagnosticoDiente() {
        return diagnosticoDiente;
    }

    public String getTratamientoDiente() {
        return tratamientoDiente;
    }

    public Date getFechaRevisionDiente() {
        return fechaRevisionDiente;
    }

    public int getCaraA() {
        return caraA;
    }

    public int getCaraB() {
        return caraB;
    }

    public int getCaraC() {
        return caraC;
    }

    public int getCaraD() {
        return caraD;
    }

    public int getCaraE() {
        return caraE;
    }
    
    //Puente con la capa de datos MD
    public void ingresarDiente() throws ClassNotFoundException
    {
        dienteMD = new DienteMD(this);
        dienteMD.insertarDienteMD();
    }
    
    public void eliminarDiente() throws ClassNotFoundException
    {
        dienteMD = new DienteMD(this);
        dienteMD.eliminarDienteMD();
    }
    
    public void actualizarDiente() throws ClassNotFoundException
    {
        dienteMD = new DienteMD(this);
        dienteMD.actualizarDienteMD();
    }
    
    public boolean verificarDiente() throws ClassNotFoundException
    {
        dienteMD = new DienteMD(this);
        if(dienteMD.verificarDienteMD())
            return true;
        return false;
    }
    
    public Diente consultarDiente() throws ClassNotFoundException
    {
         dienteMD = new DienteMD(this);
         Diente dienteTMP = dienteMD.consultarDienteMD();
         
         return dienteTMP;
    }
    
    public ArrayList<Diente> consultarDientes() throws ClassNotFoundException
    {
         dienteMD = new DienteMD(this.codigoHistoriaClinica);
         ArrayList<Diente> dientes = dienteMD.consultarDientesMD();
         /*for(int i = 0; i<dientes.size();i++)
             System.out.print(dientes.get(i).getCodigoDiente());*/
         return dientes;
    }
    
}
