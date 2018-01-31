/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DP;
import MD.*;

public class Usuario {
    
    //Atributos de la clase Usuario
    private String codigoUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String especialidadUsuario;
    private String celularUsuario;
    private String direccionUsuario;
    private UsuarioMD usuarioMD;
    
    //Constructores de la clase
    public Usuario()
    {
    }
    
    public Usuario(String codigoUsuario)
    {
        this.codigoUsuario = codigoUsuario;
    }

    public Usuario(String codigoUsuario, String nombreUsuario, String apellidoUsuario, String especialidadUsuario, String celularUsuario, String direccionUsuario) {
        this.codigoUsuario = codigoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.especialidadUsuario = especialidadUsuario;
        this.celularUsuario = celularUsuario;
        this.direccionUsuario = direccionUsuario;
    }
    
    //Métodos set de la clase
    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public void setEspecialidadUsuario(String especialidadUsuario) {
        this.especialidadUsuario = especialidadUsuario;
    }

    public void setCelularUsuario(String celularUsuario) {
        this.celularUsuario = celularUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }
    
    //Métodos get de la clase
    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public String getEspecialidadUsuario() {
        return especialidadUsuario;
    }

    public String getCelularUsuario() {
        return celularUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }
    
    //Puente con los métodos de la capa de datos MD
    public void ingresarUsuario() throws ClassNotFoundException
    {
        usuarioMD = new UsuarioMD(this);
        usuarioMD.insertarUsuarioMD();
    }
    
    public void eliminarUsuario() throws ClassNotFoundException
    {
        usuarioMD = new UsuarioMD(this);
        usuarioMD.eliminarUsuarioMD();
    }
    
    public void actualizarUsuario() throws ClassNotFoundException
    {
        usuarioMD = new UsuarioMD(this);
        usuarioMD.actualizarUsuarioMD();
    }
    
    public boolean verificarCodigoUsuario() throws ClassNotFoundException
    {
        usuarioMD = new UsuarioMD(this);
        if(usuarioMD.verificarCodigoUsuarioMD())
            return true;
        return false;
    }
    
    public Usuario consultarUsuario() throws ClassNotFoundException
    {
         usuarioMD = new UsuarioMD(this);
         Usuario usuarioTMP = usuarioMD.consultarUsuarioMD();
         
         return usuarioTMP;
    }
    
}
