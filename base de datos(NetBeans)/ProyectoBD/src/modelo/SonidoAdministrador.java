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
 * @author alejandro
 */
public class SonidoAdministrador {

    
    private int idSonidoAdmin;
    private boolean sonidosAdminPublicoPrivado;
    private String duracionSonidoAdmin;//esta en estring 00:00:00
    private String adminCreador;
    private String archivoSonidoAdmin;
    private String descripcionSonidoAdmin;
    private String fechaCreacionAdmin;
    private Double precioAdmin;
    private int  idCategoriaf;
    private int idAdminf;

    public SonidoAdministrador() {
    }

    public SonidoAdministrador(int idSonidoAdmin, boolean sonidosAdminPublicoPrivado, String duracionSonidoAdmin, String adminCreador, String archivoSonidoAdmin, String descripcionSonidoAdmin, String fechaCreacionAdmin, Double precioAdmin, int idCategoriaf, int idAdminf) {
        this.idSonidoAdmin = idSonidoAdmin;
        this.sonidosAdminPublicoPrivado = sonidosAdminPublicoPrivado;
        this.duracionSonidoAdmin = duracionSonidoAdmin;
        this.adminCreador = adminCreador;
        this.archivoSonidoAdmin = archivoSonidoAdmin;
        this.descripcionSonidoAdmin = descripcionSonidoAdmin;
        this.fechaCreacionAdmin = fechaCreacionAdmin;
        this.precioAdmin = precioAdmin;
        this.idCategoriaf = idCategoriaf;
        this.idAdminf = idAdminf;
    }

    public SonidoAdministrador(boolean sonidosAdminPublicoPrivado, String duracionSonidoAdmin, String adminCreador, String archivoSonidoAdmin, String descripcionSonidoAdmin, String fechaCreacionAdmin, Double precioAdmin, int idCategoriaf, int idAdminf) {
        this.sonidosAdminPublicoPrivado = sonidosAdminPublicoPrivado;
        this.duracionSonidoAdmin = duracionSonidoAdmin;
        this.adminCreador = adminCreador;
        this.archivoSonidoAdmin = archivoSonidoAdmin;
        this.descripcionSonidoAdmin = descripcionSonidoAdmin;
        this.fechaCreacionAdmin = fechaCreacionAdmin;
        this.precioAdmin = precioAdmin;
        this.idCategoriaf = idCategoriaf;
        this.idAdminf = idAdminf;
    }
    
    
    
     /**
     * Get the value of sonidosAdminPublicoPrivado
     *
     * @return the value of sonidosAdminPublicoPrivado
     */
    public boolean isSonidosAdminPublicoPrivado() {
        return sonidosAdminPublicoPrivado;
    }
    
    /**
     * Set the value of sonidosAdminPublicoPrivado
     *
     * @param sonidosAdminPublicoPrivado new value of idSonidoAdmin
     */
    public void setSonidosAdminPublicoPrivado(boolean sonidosAdminPublicoPrivado) {
        this.sonidosAdminPublicoPrivado = sonidosAdminPublicoPrivado;
    }
    
    /**
     * Get the value of duracionSonidoAdmin
     *
     * @return the value of duracionSonidoAdmin
     */
    public String getDuracionSonidoAdmin() {
        return duracionSonidoAdmin;
    }

    /**
     * Set the value of duracionSonidoAdmin
     *
     * @param duracionSonidoAdmin new value of duracionSonidoAdmin
     */
    public void setDuracionSonidoAdmin(String duracionSonidoAdmin) {
        this.duracionSonidoAdmin = duracionSonidoAdmin;
    }

    /**
     * Get the value of adminCreador
     *
     * @return the value of adminCreador
     */
    public String getAdminCreador() {
        return adminCreador;
    }

    /**
     * Set the value of adminCreador
     *
     * @param adminCreador new value of adminCreador
     */
    public void setAdminCreador(String adminCreador) {
        this.adminCreador = adminCreador;
    }
    
    /**
     * Get the value of archivoSonidoAdmin
     *
     * @return the value of archivoSonidoAdmin
     */
    public String getArchivoSonidoAdmin() {
        return archivoSonidoAdmin;
    }
    
    /**
     * Set the value of archivoSonidoAdmin
     *
     * @param archivoSonidoAdmin new value of archivoSonidoAdmin
     */
    public void setArchivoSonidoAdmin(String archivoSonidoAdmin) {
        this.archivoSonidoAdmin = archivoSonidoAdmin;
    }
 
    /**
     * Get the value of descripcionSonidoAdmin
     *
     * @return the value of descripcionSonidoAdmin
     */
    public String getDescripcionSonidoAdmin() {
        return descripcionSonidoAdmin;
    }
 
    /**
     * Set the value of descripcionSonidoAdmin
     *
     * @param descripcionSonidoAdmin new value of descripcionSonidoAdmin
     */
    public void setDescripcionSonidoAdmin(String descripcionSonidoAdmin) {
        this.descripcionSonidoAdmin = descripcionSonidoAdmin;
    }

    /**
     * Get the value of fechaCreacionAdmin
     *
     * @return the value of fechaCreacionAdmin
     */
    public String getFechaCreacionAdmin() {
        return fechaCreacionAdmin;
    }

    /**
     * Set the value of fechaCreacionAdmin
     *
     * @param fechaCreacionAdmin new value of fechaCreacionAdmin
     */
    public void setFechaCreacionAdmin(String fechaCreacionAdmin) {
        this.fechaCreacionAdmin = fechaCreacionAdmin;
    }

    /**
     * Get the value of precioAdmin
     *
     * @return the value of precioAdmin
     */
    public Double getPrecioAdmin() {
        return precioAdmin;
    }

    /**
     * Set the value of precioAdmin
     *
     * @param precioAdmin new value of precioAdmin
     */
    public void setPrecioAdmin(Double precioAdmin) {
        this.precioAdmin = precioAdmin;
    }

    /**
     * Get the value of idCategoriaf
     *
     * @return the value of idCategoriaf
     */
    public int getIdCategoriaf() {
        return idCategoriaf;
    }

    /**
     * Set the value of idCategoriaf
     *
     * @param idCategoriaf new value of idCategoriaf
     */
    public void setIdCategoriaf(int idCategoriaf) {
        this.idCategoriaf = idCategoriaf;
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
     * Get the value of idSonidoAdmin
     *
     * @return the value of idSonidoAdmin
     */
    public int getIdSonidoAdmin() {
        return idSonidoAdmin;
    }

    /**
     * Set the value of idSonidoAdmin
     *
     * @param idSonidoAdmin new value of idSonidoAdmin
     */
    public void setIdSonidoAdmin(int idSonidoAdmin) {
        this.idSonidoAdmin = idSonidoAdmin;
    }

    @Override
    public String toString() {
        return "SonidoAdministrador{" + "idSonidoAdmin=" + idSonidoAdmin + ", sonidosAdminPublicoPrivado=" + sonidosAdminPublicoPrivado + ", duracionSonidoAdmin=" + duracionSonidoAdmin + ", adminCreador=" + adminCreador + ", archivoSonidoAdmin=" + archivoSonidoAdmin + ", descripcionSonidoAdmin=" + descripcionSonidoAdmin + ", fechaCreacionAdmin=" + fechaCreacionAdmin + ", precioAdmin=" + precioAdmin + ", idCategoriaf=" + idCategoriaf + ", idAdminf=" + idAdminf + '}';
    }

    public boolean insertarSonidoAdministrador(SonidoAdministrador objSA, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setBoolean(1, objSA.isSonidosAdminPublicoPrivado());
                ps.setString(2, objSA.getDuracionSonidoAdmin());
                ps.setString(3, objSA.getAdminCreador());
                ps.setString(4, objSA.getArchivoSonidoAdmin());
                ps.setString(5, objSA.getDescripcionSonidoAdmin());
                ps.setString(6, objSA.getFechaCreacionAdmin());
                ps.setDouble(7, objSA.getPrecioAdmin());
                ps.setInt(8, objSA.getIdCategoriaf());
                ps.setInt(9, objSA.getIdAdminf());
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
    public boolean EliminarSonidoAdministrador(SonidoAdministrador objSA, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setInt(1, objSA.getIdSonidoAdmin());
                ps.execute();
                System.out.println("el sonido se eliminó exitosamente.");
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
    public boolean ActualizarSonidoAdministrador(SonidoAdministrador objSA, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(2, objSA.getDuracionSonidoAdmin());
                ps.setBoolean(1, objSA.isSonidosAdminPublicoPrivado());
                ps.setString(3, objSA.getAdminCreador());
                ps.setString(4, objSA.getArchivoSonidoAdmin());
                ps.setString(5, objSA.getDescripcionSonidoAdmin());
                ps.setString(6, objSA.getFechaCreacionAdmin());
                ps.setDouble(7, objSA.getPrecioAdmin());
                ps.setInt(8, objSA.getIdCategoriaf());
                ps.setInt(9, objSA.getIdAdminf());
                ps.setInt(10, objSA.getIdSonidoAdmin());
                
                ps.executeUpdate();
                System.out.println("el sonido se actualizó exitosamente.");
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE,null, ex);
            t = false;
        }
        
        return t;
    }
    public LinkedList<SonidoAdministrador> buscarSonidosAdministrador(String sql) {
        ResultSet rs = null;
        LinkedList<SonidoAdministrador> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int idSonidoAd;
        String duracionSonido;
        String AdminCreador="";
        String descripcionSonido="";
        String archivoSonido;
        boolean PublicoPrivado;
        int idCategoria;
        int idAdmin;
        String fechaCreacion;
        Double precioA;

        
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idSonidoAd = rs.getInt("idSonidoAdmin");
                    duracionSonido = rs.getString("duracionSonidoAdmin");
                    archivoSonido=rs.getString("archivoSonidoAdmin");
                    descripcionSonido = rs.getString("descripcionSonidoAdmin");
                     try {
                        descripcionSonido = rs.getString("descripcionSonidoAdmin");
                    } catch (NullPointerException n) { }
                    if(descripcionSonido==null){
                        descripcionSonido = "";
                    }
                    AdminCreador = rs.getString("AdminCreador");
                     try {
                        AdminCreador = rs.getString("AdminCreador");
                    } catch (NullPointerException n) { }
                    if(AdminCreador==null){
                        AdminCreador = "";
                    }
                    
                    idCategoria = rs.getInt("idCategoriaf");
                    idAdmin = rs.getInt("idAdminf");
                    PublicoPrivado= rs.getBoolean("sonidosAdminPublicoPrivado");
                    fechaCreacion=rs.getString("fechaCreacionAdmin");
                    precioA=rs.getDouble("precioAdmin");
                    try {
                        precioA = rs.getDouble("precioAdmin");
                    } catch (NullPointerException n) { }
                    if(precioA==null){
                        precioA =(0.0);
                    }
                 
                    lc.add(new SonidoAdministrador(idSonidoAd, PublicoPrivado, duracionSonido, AdminCreador,archivoSonido, descripcionSonido,fechaCreacion,precioA,idCategoria,idAdmin));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
    }
    public LinkedList<SonidoAdministrador> buscarSonidosAdministradorCategoria(String sql,int f ) {
        ResultSet rs = null;
        LinkedList<SonidoAdministrador> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int idSonidoAd;
        String duracionSonido;
        String AdminCreador="";
        String descripcionSonido="";
        String archivoSonido;
        boolean PublicoPrivado;
        int idCategoria;
        int idAdmin;
        String fechaCreacion;
        Double precioA;

        
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idSonidoAd = rs.getInt("idSonidoAdmin");
                    duracionSonido = rs.getString("duracionSonidoAdmin");
                    archivoSonido=rs.getString("archivoSonidoAdmin");
                    descripcionSonido = rs.getString("descripcionSonidoAdmin");
                     try {
                        descripcionSonido = rs.getString("descripcionSonidoAdmin");
                    } catch (NullPointerException n) { }
                    if(descripcionSonido==null){
                        descripcionSonido = "";
                    }
                    AdminCreador = rs.getString("AdminCreador");
                     try {
                        AdminCreador = rs.getString("AdminCreador");
                    } catch (NullPointerException n) { }
                    if(AdminCreador==null){
                        AdminCreador = "";
                    }
                    
                    idCategoria = rs.getInt("idCategoriaf");
                    idAdmin = rs.getInt("idAdminf");
                    PublicoPrivado= rs.getBoolean("sonidosAdminPublicoPrivado");
                    fechaCreacion=rs.getString("fechaCreacionAdmin");
                    precioA=rs.getDouble("precioAdmin");
                    try {
                        precioA = rs.getDouble("precioAdmin");
                    } catch (NullPointerException n) { }
                    if(precioA==null){
                        precioA =(0.0);
                    }
                 
                    lc.add(new SonidoAdministrador(idSonidoAd, PublicoPrivado, duracionSonido, AdminCreador,archivoSonido, descripcionSonido,fechaCreacion,precioA,idCategoria,idAdmin));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
    }
}
