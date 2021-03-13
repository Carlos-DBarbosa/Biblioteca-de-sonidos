/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.SonidoAdministrador;

/**
 *
 * @author Alejandro
 */
public class ControlSonidoAdministrador {


    public boolean insertarSonidoAdministrador(SonidoAdministrador objU) {
        boolean t= false;
        SonidoAdministrador objU2 = new SonidoAdministrador();
        String sql = "";       
        sql = "INSERT INTO SONIDOS_ADMINISTRADOR(sonidosAdminPublicoPrivado, duracionSonidoAdmin, adminCreador, archivoSonidoAdmin, descripcionSonidoAdmin, fechaCreacionAdmin, precioAdmin, idCategoriaf,idAdminf) VALUES(?,?,?,?,?,?,?,?,?)"; 
        t = objU2.insertarSonidoAdministrador(objU, sql);
        return t;
    }  
    public boolean EliminarSonidoAdministrador(SonidoAdministrador objSA) {
        boolean t= false;
        SonidoAdministrador objSa = new SonidoAdministrador();
        String sql = "DELETE FROM sonidos_administrador WHERE idSonidoAdmin=?";
        t = objSa.EliminarSonidoAdministrador(objSA, sql);
        return t;
    }
    public boolean ActualizarSonidoAdministrador(SonidoAdministrador objSA) {
        boolean t= false;
        SonidoAdministrador objSa = new SonidoAdministrador();
        String sql = "update sonidos_administrador set sonidosAdminPublicoPrivado=?, duracionSonidoAdmin=?, adminCreador=?, archivoSonidoAdmin=? , descripcionSonidoAdmin=? ,fechaCreacionAdmin=?, precioAdmin=?, idCategoriaf=?, idAdminf=? where idSonidoAdmin=?";
        t = objSa.ActualizarSonidoAdministrador(objSA, sql);
        return t;
    }
    public LinkedList<SonidoAdministrador> buscarSonidosAdministrador() {
        String sql="Select * from sonidos_administrador;";
        SonidoAdministrador objSa=new SonidoAdministrador();
        LinkedList<SonidoAdministrador> listSa=objSa.buscarSonidosAdministrador(sql);
        
        return listSa;
    }

    public LinkedList<SonidoAdministrador> buscarSonidosAdministrador(String nombre) {
        String sql="Select * from sonidos_administrador where adminCreador='" + nombre + "'";
        SonidoAdministrador objSa=new SonidoAdministrador();
        LinkedList<SonidoAdministrador> listSa=objSa.buscarSonidosAdministrador(sql);
        
        return listSa;
    }
    
    public LinkedList<SonidoAdministrador> SonidosPorFecha(String fecha) {
        String sql="Select * from sonidos_administrador where fechaCreacionAdmin='" + fecha + "'";
        SonidoAdministrador objSa=new SonidoAdministrador();
        LinkedList<SonidoAdministrador> listSa=objSa.buscarSonidosAdministrador(sql);
        
        return listSa;
    }
    public LinkedList<SonidoAdministrador> buscarSonidosAdministradorCategoria(String nombre, int n) {
        String sql="call sonidos_administradorCategoria("+n+");";
        SonidoAdministrador objSa=new SonidoAdministrador();
        LinkedList<SonidoAdministrador> listSa=objSa.buscarSonidosAdministrador(sql);
        
        return listSa;
    }
}
