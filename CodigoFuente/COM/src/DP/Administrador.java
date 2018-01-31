/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DP;
import MD.*;

public class Administrador {
    
    //Atributos clase administrador
    private int codigoAdministrador;
    private String nombreAdministrador;
    private String claveAdministrador;
    private AdministradorMD administradorMD; 
    
    //Constructores clase administrador
    public Administrador() {
    }

    public Administrador(int codigoAdministrador, String nombreAdministrador, String claveAdministrador) {
        this.codigoAdministrador = codigoAdministrador;
        this.nombreAdministrador = nombreAdministrador;
        this.claveAdministrador = claveAdministrador;
    }

    public Administrador(String nombreAdministrador, String claveAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
        this.claveAdministrador = claveAdministrador;
    }
    
    //Métodos set clase administrador --- setean los valores de los atributos
    public void setCodigoAdministrador(int codigoAdministrador) {
        this.codigoAdministrador = codigoAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public void setClaveAdministrador(String claveAdministrador) {
        this.claveAdministrador = claveAdministrador;
    }
    
    //Métodos get clase administrador --- devuelven el valor de los atributos 
    public int getCodigoAdministrador() {
        return codigoAdministrador;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public String getClaveAdministrador() {
        return claveAdministrador;
    }
    //
    
    //Métodos para puente a la capa de datos MD
    public void ingresarAdministrador() throws ClassNotFoundException
    {
        administradorMD = new AdministradorMD(this);
        administradorMD.insertarAdministradorMD();
    }
    
    public void actualizarAdministrador() throws ClassNotFoundException
    {
        administradorMD = new AdministradorMD(this);
        administradorMD.actualizarAdministradorMD();
    }
    
    public void eliminarAdministrador() throws ClassNotFoundException
    {
        administradorMD = new AdministradorMD(this);
        administradorMD.eliminarAdministradorMD();
    }
    
    public boolean verificarAdministrador() throws ClassNotFoundException
    {
        administradorMD = new AdministradorMD(this.nombreAdministrador,this.claveAdministrador);
        if(administradorMD.verificarAdministradorMD())
            return true;
        return false;
    }
    
}
