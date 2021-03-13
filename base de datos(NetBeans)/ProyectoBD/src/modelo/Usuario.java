/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Carlo
 */
public class Usuario {
    
    private int cedula;
    private String nick;
    private String fechaNacimiento;
    private String correoU;
    private String contrasenaU;
    private String telefonoU;
    private String fotoPerfil;
    private String direccionU;

    public Usuario() {
    }

    public Usuario(int cedula, String nick, String fechaNacimiento, String correoU, String contrasenaU, String telefonoU, String fotoPerfil, String direccionU) {
        this.cedula = cedula;
        this.nick = nick;
        this.fechaNacimiento = fechaNacimiento;
        this.correoU = correoU;
        this.contrasenaU = contrasenaU;
        this.telefonoU = telefonoU;
        this.fotoPerfil = fotoPerfil;
        this.direccionU = direccionU;
    }
    
    

    /**
     * Get the value of direccionU
     *
     * @return the value of direccionU
     */
    public String getDireccionU() {
        return direccionU;
    }

    /**
     * Set the value of direccionU
     *
     * @param direccionU new value of direccionU
     */
    public void setDireccionU(String direccionU) {
        this.direccionU = direccionU;
    }


    /**
     * Get the value of fotoPerfil
     *
     * @return the value of fotoPerfil
     */
    public String getFotoPerfil() {
        return fotoPerfil;
    }

    /**
     * Set the value of fotoPerfil
     *
     * @param fotoPerfil new value of fotoPerfil
     */
    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }


    /**
     * Get the value of telefonoU
     *
     * @return the value of telefonoU
     */
    public String getTelefonoU() {
        return telefonoU;
    }

    /**
     * Set the value of telefonoU
     *
     * @param telefonoU new value of telefonoU
     */
    public void setTelefonoU(String telefonoU) {
        this.telefonoU = telefonoU;
    }


    /**
     * Get the value of contrasenaU
     *
     * @return the value of contrasenaU
     */
    public String getContrasenaU() {
        return contrasenaU;
    }

    /**
     * Set the value of contrasenaU
     *
     * @param contrasenaU new value of contrasenaU
     */
    public void setContrasenaU(String contrasenaU) {
        this.contrasenaU = contrasenaU;
    }


    /**
     * Get the value of correoU
     *
     * @return the value of correoU
     */
    public String getCorreoU() {
        return correoU;
    }

    /**
     * Set the value of correoU
     *
     * @param correoU new value of correoU
     */
    public void setCorreoU(String correoU) {
        this.correoU = correoU;
    }


    /**
     * Get the value of fechaNacimiento
     *
     * @return the value of fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Set the value of fechaNacimiento
     *
     * @param fechaNacimiento new value of fechaNacimiento
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Get the value of nick
     *
     * @return the value of nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * Set the value of nick
     *
     * @param nick new value of nick
     */
    public void setNick(String nick) {
        this.nick = nick;
    }


    /**
     * Get the value of cedula
     *
     * @return the value of cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * Set the value of cedula
     *
     * @param cedula new value of cedula
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean insertarUsuario(Usuario objU, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                File file = new File(objU.getFotoPerfil());
                fis = new FileInputStream(file);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setInt(1, objU.getCedula());
                ps.setString(2, objU.getNick());
                ps.setString(3, objU.getFechaNacimiento());
                ps.setString(4, objU.getCorreoU());
                ps.setString(5, objU.getContrasenaU());
                ps.setString(6, objU.getTelefonoU());
                ps.setBinaryStream(7, fis, (int) file.length());
                ps.setString(8, objU.getDireccionU());
                
                ps.executeUpdate();
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE,null, ex);
            t = false;
        }
        
        return t;
    }

    public LinkedList<Usuario> buscarUsuario(String sql) {
        ResultSet rs = null;
        LinkedList<Usuario> lU = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int cedula;
        String usuario;
        String fechaN;
        String correo;
        String contraseña;
        String telefono="";
        String fotoP="";
        String direccion="";

        
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    cedula = rs.getInt("cedula");
                    usuario = rs.getString("nick");
                    fechaN = rs.getString("fechaNacimiento");
                    correo = rs.getString("correoU");
                    contraseña = rs.getString("contrasenaU");
                    
                    telefono = rs.getString("telefonoU");
                     try {
                        telefono = rs.getString("telefonoU");
                    } catch (NullPointerException n) { }
                    if(telefono==null){
                        telefono = "";
                    }
                    
                    fotoP = rs.getString("fotoPerfil");
                     try {
                        fotoP = rs.getString("fotoPerfil");
                    } catch (NullPointerException n) { }
                    if(fotoP==null){
                        fotoP = "";
                    }
                    
                    direccion = rs.getString("direccionU");
                     try {
                        direccion = rs.getString("direccionU");
                    } catch (NullPointerException n) { }
                    if(direccion==null){
                        direccion = "";
                    }
                    
                 
                    lU.add(new Usuario(cedula, usuario, fechaN, correo, contraseña, telefono, fotoP, direccion));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lU;
    }

    public boolean ActualizarUsuario(Usuario objU, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
//                ps.setInt(1, objU.getCedula());
                ps.setString(1, objU.getNick());
                ps.setString(2, objU.getFechaNacimiento());
                ps.setString(3, objU.getCorreoU());
                ps.setString(4, objU.getContrasenaU());
                ps.setString(5, objU.getTelefonoU());
                ps.setString(6, objU.getFotoPerfil());
                ps.setString(7, objU.getDireccionU());
                ps.setInt(8, objU.getCedula());
                
                ps.executeUpdate();
                System.out.println("El Usuario se actualizó exitosamente.");
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE,null, ex);
            t = false;
        }
        
        return t;
    }

    public boolean EliminarUsuario(Usuario objU, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setInt(1, objU.getCedula());
                ps.execute();
                System.out.println("El Usuario se eliminó exitosamente.");
                ps.close();
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE,null, ex);
            t = false;
        }
        
        return t;
    }

}
