/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DP;

import java.sql.*;
import MD.*;

public class Paciente {
    
    //Atributos de la clase Paciente
    private String codigoPaciente;
    private String claveNoPaciente;
    private String nombrePaciente;
    private String apellidoPaciente;
    private Date fechaNacimientoPaciente;
    private String empresaPaciente;
    private String telefonoPaciente;
    private String ocupacionPaciente; 
    private PacienteMD pacienteMD;
    
    //Constructores de la clase
    public Paciente()
    {
    }
    
    public Paciente(String codigoPaciente)
    {
        this.codigoPaciente = codigoPaciente;
    }

    public Paciente(String codigoPaciente, String claveNoPaciente, String nombrePaciente, String apellidoPaciente, Date fechaNacimientoPaciente, String empresaPaciente, String telefonoPaciente, String ocupacionPaciente) {
        this.codigoPaciente = codigoPaciente;
        this.claveNoPaciente = claveNoPaciente;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
        this.empresaPaciente = empresaPaciente;
        this.telefonoPaciente = telefonoPaciente;
        this.ocupacionPaciente = ocupacionPaciente;
    }
    
    //Métodos set de la Clase
    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public void setClaveNoPaciente(String claveNoPaciente) {
        this.claveNoPaciente = claveNoPaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public void setFechaNacimientoPaciente(Date fechaNacimientoPaciente) {
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
    }

    public void setEmpresaPaciente(String empresaPaciente) {
        this.empresaPaciente = empresaPaciente;
    }

    public void setTelefonoPaciente(String telefonoPaciente) {
        this.telefonoPaciente = telefonoPaciente;
    }

    public void setOcupacionPaciente(String ocupacionPaciente) {
        this.ocupacionPaciente = ocupacionPaciente;
    }
    
    //Métodos get de la clase
    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public String getClaveNoPaciente() {
        return claveNoPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public Date getFechaNacimientoPaciente() {
        return fechaNacimientoPaciente;
    }

    public String getEmpresaPaciente() {
        return empresaPaciente;
    }

    public String getTelefonoPaciente() {
        return telefonoPaciente;
    }

    public String getOcupacionPaciente() {
        return ocupacionPaciente;
    }
    
    //Puente con los métodos de la capa de datos MD
    public void ingresarPaciente() throws ClassNotFoundException
    {
        pacienteMD = new PacienteMD(this);
        pacienteMD.insertarPacienteMD();
    }
    
    public void eliminarPaciente() throws ClassNotFoundException
    {
       pacienteMD = new PacienteMD(this);
        pacienteMD.eliminarPacienteMD();
    }
    
    public void actualizarPaciente() throws ClassNotFoundException
    {
        pacienteMD = new PacienteMD(this);
        pacienteMD.actualizarPacienteMD();
    }
    
    public boolean verificarCodigoPaciente() throws ClassNotFoundException
    {
        pacienteMD = new PacienteMD(this);
        if(pacienteMD.verificarCodigoPacienteMD())
            return true;
        return false;
    }
    
    public Paciente consultarPaciente() throws ClassNotFoundException
    {
         pacienteMD = new PacienteMD(this);
         Paciente pacienteTMP = pacienteMD.consultarPacienteMD();
         
         return pacienteTMP;
    }
    
    
}
