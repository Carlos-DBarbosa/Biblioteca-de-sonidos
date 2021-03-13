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
 * @author Windows
 */
public class SubidosAdminPorCategoria {
    
    private int idCategoria;
    private String usuarioAdmin;
    private boolean sonidosAdminPublicoPrivado;
    private String adminCreador;
    private String archivoSonidoAdmin;

    public SubidosAdminPorCategoria() {
    }

    public SubidosAdminPorCategoria(int idCategoria, String usuarioAdmin, boolean sonidosAdminPublicoPrivado, String adminCreador, String archivoSonidoAdmin) {
        this.idCategoria = idCategoria;
        this.usuarioAdmin = usuarioAdmin;
        this.sonidosAdminPublicoPrivado = sonidosAdminPublicoPrivado;
        this.adminCreador = adminCreador;
        this.archivoSonidoAdmin = archivoSonidoAdmin;
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
     * @param sonidosAdminPublicoPrivado new value of sonidosAdminPublicoPrivado
     */
    public void setSonidosAdminPublicoPrivado(boolean sonidosAdminPublicoPrivado) {
        this.sonidosAdminPublicoPrivado = sonidosAdminPublicoPrivado;
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
    
    public LinkedList<SubidosAdminPorCategoria> buscarSubidosAdminPorCategoria(String sql, int n) {
        ResultSet rs = null;
        LinkedList<SubidosAdminPorCategoria> lU = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
        int idCategoria;
        String usuarioAdmin;
        boolean sonidosAdminPublicoPrivado;
        String adminCreador;
        String archivoSonidoAdmin;
 

        
        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idCategoria = rs.getInt("idCategoria");
                    usuarioAdmin = rs.getString("usuarioAdmin");
                    sonidosAdminPublicoPrivado = rs.getBoolean("sonidosAdminPublicoPrivado");
                    adminCreador = rs.getString("adminCreador");
                     try {
                        adminCreador = rs.getString("adminCreador");
                    } catch (NullPointerException f) { }
                    if(adminCreador==null){
                        adminCreador = "";
                    }
                    archivoSonidoAdmin = rs.getString("archivoSonidoAdmin");
                
                    
                 
                    lU.add(new SubidosAdminPorCategoria(idCategoria, usuarioAdmin, sonidosAdminPublicoPrivado, adminCreador, archivoSonidoAdmin));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lU;
    }

}
