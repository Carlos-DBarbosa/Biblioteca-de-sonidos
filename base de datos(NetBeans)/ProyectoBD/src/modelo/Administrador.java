/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
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
public class Administrador {
    
    private int idAdmin;
    private String contrasenaAdmin;
    private String usuarioAdmin;
    private String correoAdmin;
    private String telefonoAdmin;
    private String direccionAdmin;

    public Administrador() {
    }

    public Administrador(int idAdmin, String contrasenaAdmin, String usuarioAdmin, String correoAdmin, String telefonoAdmin, String direccionAdmin) {
        this.idAdmin = idAdmin;
        this.contrasenaAdmin = contrasenaAdmin;
        this.usuarioAdmin = usuarioAdmin;
        this.correoAdmin = correoAdmin;
        this.telefonoAdmin = telefonoAdmin;
        this.direccionAdmin = direccionAdmin;
    }

    public Administrador(String contrasenaAdmin, String usuarioAdmin, String correoAdmin, String telefonoAdmin, String direccionAdmin) {
        this.contrasenaAdmin = contrasenaAdmin;
        this.usuarioAdmin = usuarioAdmin;
        this.correoAdmin = correoAdmin;
        this.telefonoAdmin = telefonoAdmin;
        this.direccionAdmin = direccionAdmin;
    }
    
    

    /**
     * Get the value of direccionAdmin
     *
     * @return the value of direccionAdmin
     */
    public String getDireccionAdmin() {
        return direccionAdmin;
    }

    /**
     * Set the value of direccionAdmin
     *
     * @param direccionAdmin new value of direccionAdmin
     */
    public void setDireccionAdmin(String direccionAdmin) {
        this.direccionAdmin = direccionAdmin;
    }


    /**
     * Get the value of telefonoAdmin
     *
     * @return the value of telefonoAdmin
     */
    public String getTelefonoAdmin() {
        return telefonoAdmin;
    }

    /**
     * Set the value of telefonoAdmin
     *
     * @param telefonoAdmin new value of telefonoAdmin
     */
    public void setTelefonoAdmin(String telefonoAdmin) {
        this.telefonoAdmin = telefonoAdmin;
    }


    /**
     * Get the value of correoAdmin
     *
     * @return the value of correoAdmin
     */
    public String getCorreoAdmin() {
        return correoAdmin;
    }

    /**
     * Set the value of correoAdmin
     *
     * @param correoAdmin new value of correoAdmin
     */
    public void setCorreoAdmin(String correoAdmin) {
        this.correoAdmin = correoAdmin;
    }


    /**
     * Get the value of usuarioAdmin
     *
     * @return the value of usuarioAdmin
     */
    public String getUsuarioAdmin() {
        return usuarioAdmin;
    }

    /**
     * Set the value of usuarioAdmin
     *
     * @param usuarioAdmin new value of usuarioAdmin
     */
    public void setUsuarioAdmin(String usuarioAdmin) {
        this.usuarioAdmin = usuarioAdmin;
    }


    /**
     * Get the value of contrasenaAdmin
     *
     * @return the value of contrasenaAdmin
     */
    public String getContrasenaAdmin() {
        return contrasenaAdmin;
    }

    /**
     * Set the value of contrasenaAdmin
     *
     * @param contrasenaAdmin new value of contrasenaAdmin
     */
    public void setContrasenaAdmin(String contrasenaAdmin) {
        this.contrasenaAdmin = contrasenaAdmin;
    }


    /**
     * Get the value of idAdmin
     *
     * @return the value of idAdmin
     */
    public int getIdAdmin() {
        return idAdmin;
    }

    /**
     * Set the value of idAdmin
     *
     * @param idAdmin new value of idAdmin
     */
    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdmin=" + idAdmin + ", contrasenaAdmin=" + contrasenaAdmin + ", usuarioAdmin=" + usuarioAdmin + ", correoAdmin=" + correoAdmin + ", telefonoAdmin=" + telefonoAdmin + ", direccionAdmin=" + direccionAdmin + '}';
    }

    public boolean insertarAdministrador(Administrador objA, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, objA.getContrasenaAdmin());
                ps.setString(2, objA.getUsuarioAdmin());
                ps.setString(3, objA.getCorreoAdmin());
                ps.setString(4, objA.getTelefonoAdmin());
                ps.setString(5, objA.getDireccionAdmin());
                
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

    public LinkedList<Administrador> buscarAdministrador(String sql) {
        ResultSet rs = null;
        LinkedList<Administrador> lA = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int idA;
        String contraseñaA;
        String nombreA;
        String correo;
        String telefono="";
        String direccion="";

        
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idA = rs.getInt("idAdmin");
                    contraseñaA = rs.getString("contrasenaAdmin");
                    nombreA = rs.getString("usuarioAdmin");
                    correo = rs.getString("correoAdmin");
                    
                    telefono = rs.getString("telefonoAdmin");
                     try {
                        telefono = rs.getString("telefonoAdmin");
                    } catch (NullPointerException n) { }
                    if(telefono==null){
                        telefono = "";
                    }
                    
                    direccion = rs.getString("direccionAdmin");
                     try {
                        direccion = rs.getString("direccionAdmin");
                    } catch (NullPointerException n) { }
                    if(direccion==null){
                        direccion = "";
                    }
                    
                 
                    lA.add(new Administrador(idA, contraseñaA, nombreA, correo, telefono, direccion));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lA;
    }

    public boolean ActualizarAdministrador(Administrador objA, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, objA.getContrasenaAdmin());
                ps.setString(2, objA.getUsuarioAdmin());
                ps.setString(3, objA.getCorreoAdmin());
                ps.setString(4, objA.getTelefonoAdmin());
                ps.setString(5, objA.getDireccionAdmin());
                ps.setInt(6, objA.getIdAdmin());
                
                ps.executeUpdate();
                System.out.println("El registro se actualizó exitosamente.");
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE,null, ex);
            t = false;
        }
        
        return t;
    }

    public boolean EliminarAdministrador(Administrador objA, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setInt(1, objA.getIdAdmin());
                ps.execute();
                System.out.println("El registro se eliminó exitosamente.");
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
