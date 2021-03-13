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
 *int idLibreria;
    String nombreLibreria;
    String descripcionLibreria;
    String fechaCreacionLibreria;
    String usoLibreria;
    int cedulaf;
 * @author alejandro
 */

public class Librerias {
    
    private int idLibreria;
    private String nombreLibreria;
    private String descripcionLibreria;
    private String fechaCreacionLibreria;
    private String usoLibreria;
    private int cedulaf;

    public Librerias() {
    }

    public Librerias(int idLibreria, String nombreLibreria, String descripcionLibreria, String fechaCreacionLibreria, String usoLibreria, int cedulaf) {
        this.idLibreria = idLibreria;
        this.nombreLibreria = nombreLibreria;
        this.descripcionLibreria = descripcionLibreria;
        this.fechaCreacionLibreria = fechaCreacionLibreria;
        this.usoLibreria = usoLibreria;
        this.cedulaf = cedulaf;
    }

    public Librerias(String nombreLibreria, String descripcionLibreria, String fechaCreacionLibreria, String usoLibreria, int cedulaf) {
        this.nombreLibreria = nombreLibreria;
        this.descripcionLibreria = descripcionLibreria;
        this.fechaCreacionLibreria = fechaCreacionLibreria;
        this.usoLibreria = usoLibreria;
        this.cedulaf = cedulaf;
    }
    
    

    /**
     * Get the value of cedulaf
     *
     * @return the value of cedulaf
     */
    public int getCedulaf() {
        return cedulaf;
    }

    /**
     * Set the value of cedulaf
     *
     * @param cedulaf new value of cedulaf
     */
    public void setCedulaf(int cedulaf) {
        this.cedulaf = cedulaf;
    }

    /**
     * Get the value of usoLibreria
     *
     * @return the value of usoLibreria
     */
    public String getUsoLibreria() {
        return usoLibreria;
    }

    /**
     * Set the value of usoLibreria
     *
     * @param usoLibreria new value of usoLibreria
     */
    public void setUsoLibreria(String usoLibreria) {
        this.usoLibreria = usoLibreria;
    }


    /**
     * Get the value of fechaCreacionLibreria
     *
     * @return the value of fechaCreacionLibreria
     */
    public String getFechaCreacionLibreria() {
        return fechaCreacionLibreria;
    }

    /**
     * Set the value of fechaCreacionLibreria
     *
     * @param fechaCreacionLibreria new value of fechaCreacionLibreria
     */
    public void setFechaCreacionLibreria(String fechaCreacionLibreria) {
        this.fechaCreacionLibreria = fechaCreacionLibreria;
    }


    /**
     * Get the value of descripcionLibreria
     *
     * @return the value of descripcionLibreria
     */
    public String getDescripcionLibreria() {
        return descripcionLibreria;
    }

    /**
     * Set the value of descripcionLibreria
     *
     * @param descripcionLibreria new value of descripcionLibreria
     */
    public void setDescripcionLibreria(String descripcionLibreria) {
        this.descripcionLibreria = descripcionLibreria;
    }


    /**
     * Get the value of nombreLibreria
     *
     * @return the value of nombreLibreria
     */
    public String getNombreLibreria() {
        return nombreLibreria;
    }

    /**
     * Set the value of nombreLibreria
     *
     * @param nombreLibreria new value of nombreLibreria
     */
    public void setNombreLibreria(String nombreLibreria) {
        this.nombreLibreria = nombreLibreria;
    }

    /**
     * Get the value of idLibreria
     *
     * @return the value of idLibreria
     */
    public int getIdLibreria() {
        return idLibreria;
    }

    /**
     * Set the value of idLibreria
     *
     * @param idLibreria new value of idLibreria
     */
    public void setIdLibreria(int idLibreria) {
        this.idLibreria = idLibreria;
    }

    @Override
    public String toString() {
        return "Librerias{" + "idLibreria=" + idLibreria + ", nombreLibreria=" + nombreLibreria + ", descripcionLibreria=" + descripcionLibreria + ", fechaCreacionLibreria=" + fechaCreacionLibreria + ", usoLibreria=" + usoLibreria + ", cedulaf=" + cedulaf + '}';
    }
    public boolean insertarLibreria(Librerias objU, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, objU.getNombreLibreria());
                ps.setString(2, objU.getDescripcionLibreria());
                ps.setString(3, objU.getFechaCreacionLibreria());
                ps.setString(4, objU.getUsoLibreria());
                ps.setInt(5, objU.getCedulaf());
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

    public boolean EliminarLibreria(Librerias objLi, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setInt(1, objLi.getIdLibreria());
                ps.execute();
                System.out.println("la libreria se eliminó exitosamente.");
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
    
    public boolean ActualizarLibreria(Librerias objLi, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(1, objLi.getNombreLibreria());
                ps.setString(2, objLi.getDescripcionLibreria());
                ps.setString(3, objLi.getFechaCreacionLibreria());
                ps.setString(4, objLi.getUsoLibreria());
                ps.setInt(5, objLi.getCedulaf());
                ps.setInt(6, objLi.getIdLibreria());
                
                ps.executeUpdate();
                System.out.println("la libreria se actualizó exitosamente.");
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE,null, ex);
            t = false;
        }
        
        return t;
    }
   
    public LinkedList<Librerias> buscarLibrerias(String sql) {
        ResultSet rs = null;
        LinkedList<Librerias> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int idLibreria;
        String nombreLibreria;
        String descripcionLibreria="";
        String usoLibreria="";
        String fechaCreacionLibreria;
        int cedulaf;

        
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idLibreria = rs.getInt("idLibreria");
                    nombreLibreria = rs.getString("nombreLibreria");
                    fechaCreacionLibreria=rs.getString("fechaCreacionLibreria");
                    descripcionLibreria = rs.getString("descripcionLibreria");
                     try {
                        descripcionLibreria = rs.getString("descripcionLibreria");
                    } catch (NullPointerException n) { }
                    if(descripcionLibreria==null){
                        descripcionLibreria = "";
                    }
                    usoLibreria = rs.getString("usoLibreria");
                     try {
                        usoLibreria = rs.getString("usoLibreria");
                    } catch (NullPointerException n) { }
                    if(usoLibreria==null){
                        usoLibreria = "";
                    }
                    
                    cedulaf = rs.getInt("cedulaf");
                    
                 
                    lc.add(new Librerias(idLibreria, nombreLibreria, descripcionLibreria, fechaCreacionLibreria,usoLibreria,cedulaf));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
    }
    
}
