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
public class Categoria_sonido {
    
    private int idCategoria;
    private String nombreCategoria;
    private String descripcionCategoria;
    private String usosPotenciales;
    private int idAdminf;

    public Categoria_sonido() {
    }

    public Categoria_sonido(int idCategoria, String nombreCategoria, String descripcionCategoria, String usosPotenciales, int idAdminf) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
        this.usosPotenciales = usosPotenciales;
        this.idAdminf = idAdminf;
    }

    public Categoria_sonido(String nombreCategoria, String descripcionCategoria, String usosPotenciales, int idAdminf) {
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
        this.usosPotenciales = usosPotenciales;
        this.idAdminf = idAdminf;
    }

  
    
    

    /**
     * Get the value of idAdminf
     *
     * @return the value of idAdminf
     */
    public int getIdAdminf() {
        return idAdminf;
    }

    /**
     * Set the value of idAdminf
     *
     * @param idAdminf new value of idAdminf
     */
    public void setIdAdminf(int idAdminf) {
        this.idAdminf = idAdminf;
    }


    /**
     * Get the value of usosPotenciales
     *
     * @return the value of usosPotenciales
     */
    public String getUsosPotenciales() {
        return usosPotenciales;
    }

    /**
     * Set the value of usosPotenciales
     *
     * @param usosPotenciales new value of usosPotenciales
     */
    public void setUsosPotenciales(String usosPotenciales) {
        this.usosPotenciales = usosPotenciales;
    }


    /**
     * Get the value of descripcionCategoria
     *
     * @return the value of descripcionCategoria
     */
    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    /**
     * Set the value of descripcionCategoria
     *
     * @param descripcionCategoria new value of descripcionCategoria
     */
    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }


    /**
     * Get the value of nombreCategoria
     *
     * @return the value of nombreCategoria
     */
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    /**
     * Set the value of nombreCategoria
     *
     * @param nombreCategoria new value of nombreCategoria
     */
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }


    /**
     * Get the value of idCategoria
     *
     * @return the value of idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * Set the value of idCategoria
     *
     * @param idCategoria new value of idCategoria
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "Categoria_sonido{" + "idCategoria=" + idCategoria + ", nombreCategoria=" + nombreCategoria + ", descripcionCategoria=" + descripcionCategoria + ", usosPotenciales=" + usosPotenciales + ", idAdminf=" + idAdminf + '}';
    }

    public boolean insertarCategoria(Categoria_sonido objC, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, objC.getNombreCategoria());
                ps.setString(2, objC.getDescripcionCategoria());
                ps.setString(3, objC.getUsosPotenciales());
                ps.setInt(4, objC.getIdAdminf());
                
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

    public LinkedList<Categoria_sonido> buscarCategoria(String sql) {
        ResultSet rs = null;
        LinkedList<Categoria_sonido> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int idc;
        String nombrec;
        String descripcion;
        String uso="";
        int idA;

        
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idc = rs.getInt("idCategoria");
                    nombrec = rs.getString("nombreCategoria");
                    descripcion = rs.getString("descripcionCategoria");
                    
                    uso = rs.getString("usosPotenciales");
                     try {
                        uso = rs.getString("usosPotenciales");
                    } catch (NullPointerException n) { }
                    if(uso==null){
                        uso = "";
                    }
                    
                    idA = rs.getInt("idAdminf");
                    
                 
                    lc.add(new Categoria_sonido(idc, nombrec, descripcion, uso, idA));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
    }

    public boolean ActualizarCategoria(Categoria_sonido objC, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, objC.getNombreCategoria());
                ps.setString(2, objC.getDescripcionCategoria());
                ps.setString(3, objC.getUsosPotenciales());
                ps.setInt(4, objC.getIdAdminf());
                ps.setInt(5, objC.getIdCategoria());
                
                ps.executeUpdate();
                System.out.println("La Categoria se actualizó exitosamente.");
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE,null, ex);
            t = false;
        }
        
        return t;
    }

    public boolean EliminarCategoria(Categoria_sonido objC, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setInt(1, objC.getIdCategoria());
                ps.execute();
                System.out.println("La Categoria se eliminó exitosamente.");
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
