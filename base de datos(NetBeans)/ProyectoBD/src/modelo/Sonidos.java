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
public class Sonidos {
    private int idSonido;
    private boolean sonidoPublicoPrivado;
    private String duracionSonido;//esta en estring 00:00:00
    private String SubidoPor;
    private String archivoSonido;
    private String descripcionSonido;
    private String fechaCreacion;
    private Double precioS;
    private int  idLibreriaf;
    private int  idCategoriaf;
    private int cedulaf;

    public Sonidos() {
    }


    public Sonidos(int idSonido, boolean sonidoPublicoPrivado, String duracionSonido, String SubidoPor, String archivoSonido, String descripcionSonido, String fechaCreacion, Double precioS, int idLibreriaf, int idCategoriaf, int cedulaf) {
        this.idSonido = idSonido;
        this.sonidoPublicoPrivado = sonidoPublicoPrivado;
        this.duracionSonido = duracionSonido;
        this.SubidoPor = SubidoPor;
        this.archivoSonido = archivoSonido;
        this.descripcionSonido = descripcionSonido;
        this.fechaCreacion = fechaCreacion;
        this.precioS = precioS;
        this.idLibreriaf = idLibreriaf;
        this.idCategoriaf = idCategoriaf;
        this.cedulaf = cedulaf;
    }

    public Sonidos(boolean sonidoPublicoPrivado, String duracionSonido, String SubidoPor, String archivoSonido, String descripcionSonido, String fechaCreacion, Double precioS, int idLibreriaf, int idCategoriaf, int cedulaf) {
        this.sonidoPublicoPrivado = sonidoPublicoPrivado;
        this.duracionSonido = duracionSonido;
        this.SubidoPor = SubidoPor;
        this.archivoSonido = archivoSonido;
        this.descripcionSonido = descripcionSonido;
        this.fechaCreacion = fechaCreacion;
        this.precioS = precioS;
        this.idLibreriaf = idLibreriaf;
        this.idCategoriaf = idCategoriaf;
        this.cedulaf = cedulaf;
    }
    
    

    /**
     * Get the value of idSonido
     *
     * @return the value of idSonido
     */
    public int getIdSonido() {
        return idSonido;
    }
    
    /**
     * Set the value of idSonido
     *
     * @param idSonido new value of idSonido
     */
    public void setIdSonido(int idSonido) {
        this.idSonido = idSonido;
    }
    
    /**
     * Get the value of isSonidoPublicoPrivado
     *
     * @return the value of isSonidoPublicoPrivado
     */
    public boolean isSonidoPublicoPrivado() {
        return sonidoPublicoPrivado;
    }

     /**
     * Set the value of sonidoPublicoPrivado
     *
     * @param sonidoPublicoPrivado new value of sonidoPublicoPrivado
     */
    public void setSonidoPublicoPrivado(boolean sonidoPublicoPrivado) {
        this.sonidoPublicoPrivado = sonidoPublicoPrivado;
    }
    
    /**
     * Get the value of duracionSonido
     *
     * @return the value of duracionSonido
     */
    public String getDuracionSonido() {
        return duracionSonido;
    }

    /**
     * Set the value of duracionSonido
     *
     * @param duracionSonido new value of duracionSonido
     */
    public void setDuracionSonido(String duracionSonido) {
        this.duracionSonido = duracionSonido;
    }

    /**
     * Get the value of SubidoPor
     *
     * @return the value of SubidoPor
     */
    public String getSubidoPor() {
        return SubidoPor;
    }

    /**
     * Set the value of SubidoPor
     *
     * @param SubidoPor new value of SubidoPor
     */
    public void setSubidoPor(String SubidoPor) {
        this.SubidoPor = SubidoPor;
    }
    
    /**
     * Get the value of archivoSonido
     *
     * @return the value of archivoSonido
     */
    public String getArchivoSonido() {
        return archivoSonido;
    }

    /**
     * Set the value of archivoSonido
     *
     * @param archivoSonido new value of archivoSonido
     */
    public void setArchivoSonido(String archivoSonido) {
        this.archivoSonido = archivoSonido;
    }

    /**
     * Get the value of descripcionSonido
     *
     * @return the value of descripcionSonido
     */
    public String getDescripcionSonido() {
        return descripcionSonido;
    }

    /**
     * Set the value of descripcionSonido
     *
     * @param descripcionSonido new value of descripcionSonido
     */
    public void setDescripcionSonido(String descripcionSonido) {
        this.descripcionSonido = descripcionSonido;
    }

    /**
     * Get the value of fechaCreacion
     *
     * @return the value of fechaCreacion
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Set the value of fechaCreacion
     *
     * @param fechaCreacion new value of fechaCreacion
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Get the value of precioS
     *
     * @return the value of precioS
     */
    public Double getPrecioS() {
        return precioS;
    }

    /**
     * Set the value of precioS
     *
     * @param precioS new value of precioS
     */
    public void setPrecioS(Double precioS) {
        this.precioS = precioS;
    }

    /**
     * Get the value of idLibreriaf
     *
     * @return the value of idLibreriaf
     */
    public int getIdLibreriaf() {
        return idLibreriaf;
    }

    /**
     * Set the value of idLibreriaf
     *
     * @param idLibreriaf new value of idLibreriaf
     */
    public void setIdLibreriaf(int idLibreriaf) {
        this.idLibreriaf = idLibreriaf;
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

    @Override
    public String toString() {
        return "Sonidos{" + "idSonido=" + idSonido + ", sonidoPublicoPrivado=" + sonidoPublicoPrivado + ", duracionSonido=" + duracionSonido + ", SubidoPor=" + SubidoPor + ", archivoSonido=" + archivoSonido + ", descripcionSonido=" + descripcionSonido + ", fechaCreacion=" + fechaCreacion + ", precioS=" + precioS + ", idLibreriaf=" + idLibreriaf + ", idCategoriaf=" + idCategoriaf + ", cedulaf=" + cedulaf + '}';
    }
    
    public boolean insertarSonido(Sonidos objU, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setBoolean(1, objU.isSonidoPublicoPrivado());
                ps.setString(2, objU.getDuracionSonido());
                ps.setString(3, objU.getSubidoPor());
                ps.setString(4, objU.getArchivoSonido());
                ps.setString(5, objU.getDescripcionSonido());
                ps.setString(6, objU.getFechaCreacion());
                ps.setDouble(7, objU.getPrecioS());
                ps.setInt(8, objU.getIdLibreriaf());
                ps.setInt(9, objU.getIdCategoriaf());
                ps.setInt(10, objU.getCedulaf());
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
    public boolean EliminarSonido(Sonidos objSA, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setInt(1, objSA.getIdSonido());
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
    public boolean ActualizarSonido(Sonidos objSA, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if(objb.crearConexion()){
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setString(2, objSA.getDuracionSonido());
                ps.setBoolean(1, objSA.isSonidoPublicoPrivado());
                ps.setString(3, objSA.getSubidoPor());
                ps.setString(4, objSA.getArchivoSonido());
                ps.setString(5, objSA.getDescripcionSonido());
                ps.setString(6, objSA.getFechaCreacion());
                ps.setDouble(7, objSA.getPrecioS());
                ps.setInt(8, objSA.getIdLibreriaf());
                ps.setInt(9, objSA.getIdCategoriaf());
                ps.setInt(10, objSA.getCedulaf());
                ps.setInt(11, objSA.getIdSonido());
                
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
    public LinkedList<Sonidos> buscarSonidos(String sql) {
        ResultSet rs = null;
        LinkedList<Sonidos> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int IdSonido;
        String DuracionSonido;
        String subidoPor="";
        String DescripcionSonido="";
        String archivoS;
        boolean PublicoPrivado;
        int IdCategoriaf;
        int IdLibreriaf;
        int Cedulaf;
        String FechaCreacion;
        Double PrecioS;
        
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    IdSonido = rs.getInt("idSonido");
                    PublicoPrivado = rs.getBoolean("sonidoPublicoPrivado");
                    DuracionSonido = rs.getString("duracionSonido");
                    archivoS=rs.getString("archivoSonido");
                    DescripcionSonido = rs.getString("descripcionSonido");
                     try {
                        DescripcionSonido = rs.getString("descripcionSonido");
                    } catch (NullPointerException n) { }
                    if(DescripcionSonido==null){
                        DescripcionSonido = "";
                    }
                    subidoPor = rs.getString("subidoPor");
                     try {
                        subidoPor = rs.getString("subidoPor");
                    } catch (NullPointerException n) { }
                    if(subidoPor==null){
                        subidoPor = "";
                    }
                    
                    IdCategoriaf = rs.getInt("idCategoriaf");
                    IdLibreriaf = rs.getInt("idLibreriaf");
                    Cedulaf = rs.getInt("cedulaf");
                    FechaCreacion =rs.getString("fechaCreacion");
                    PrecioS=rs.getDouble("precioS");
                    try {
                        PrecioS = rs.getDouble("precioS");
                    } catch (NullPointerException n) { }
                    if(PrecioS==null){
                        PrecioS =(0.0);
                    }
                  
                    lc.add(new Sonidos(IdSonido, PublicoPrivado, DuracionSonido, subidoPor, archivoS, DescripcionSonido, FechaCreacion, PrecioS, IdLibreriaf, IdCategoriaf, Cedulaf));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
    }
    public LinkedList<Sonidos> buscarSonidosCategoria(String sql,int n) {
        ResultSet rs = null;
        LinkedList<Sonidos> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int IdSonido;
        String DuracionSonido;
        String subidoPor="";
        String DescripcionSonido="";
        String archivoS;
        boolean PublicoPrivado;
        int IdCategoriaf;
        int IdLibreriaf;
        int Cedulaf;
        String FechaCreacion;
        Double PrecioS;
        
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    IdSonido = rs.getInt("idSonido");
                    PublicoPrivado = rs.getBoolean("sonidoPublicoPrivado");
                    DuracionSonido = rs.getString("duracionSonido");
                    archivoS=rs.getString("archivoSonido");
                    DescripcionSonido = rs.getString("descripcionSonido");
                     try {
                        DescripcionSonido = rs.getString("descripcionSonido");
                    } catch (NullPointerException f) { }
                    if(DescripcionSonido==null){
                        DescripcionSonido = "";
                    }
                    subidoPor = rs.getString("subidoPor");
                     try {
                        subidoPor = rs.getString("subidoPor");
                    } catch (NullPointerException f) { }
                    if(subidoPor==null){
                        subidoPor = "";
                    }
                    
                    IdCategoriaf = rs.getInt("idCategoriaf");
                    IdLibreriaf = rs.getInt("idLibreriaf");
                    Cedulaf = rs.getInt("cedulaf");
                    FechaCreacion =rs.getString("fechaCreacion");
                    PrecioS=rs.getDouble("precioS");
                    try {
                        PrecioS = rs.getDouble("precioS");
                    } catch (NullPointerException f) { }
                    if(PrecioS==null){
                        PrecioS =(0.0);
                    }
                  
                    lc.add(new Sonidos(IdSonido, PublicoPrivado, DuracionSonido, subidoPor, archivoS, DescripcionSonido, FechaCreacion, PrecioS, IdLibreriaf, IdCategoriaf, Cedulaf));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
    }
   
   
}
