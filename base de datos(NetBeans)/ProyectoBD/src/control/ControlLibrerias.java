/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.LinkedList;
import modelo.Librerias;
import modelo.Sonidos;

/**
 *
 * @author alejandro
 */
public class ControlLibrerias {
    public boolean insertarLibreria(Librerias objU) {
        boolean t= false;
        Librerias objU2 = new Librerias();
        String sql = "";       
        sql = "INSERT INTO LIBRERIAS_DE_SONIDO(nombreLibreria, descripcionLibreria, fechaCreacionLibreria, usoLibreria,cedulaf) VALUES(?,?,?,?,?)"; 
        t = objU2.insertarLibreria(objU, sql);
        return t;
    } 
    
    public boolean EliminarLibreria(Librerias objLi) {
        boolean t= false;
        Librerias objSa = new Librerias();
        String sql = "DELETE FROM librerias_de_sonido WHERE idLibreria=?";
        t = objSa.EliminarLibreria(objLi, sql);
        return t;
    }
    
    public boolean ActualizarLibreria(Librerias objLi) {
        boolean t= false;
        Librerias objSa = new Librerias();
        String sql = "update librerias_de_sonido set nombreLibreria=?, descripcionLibreria=?, fechaCreacionLibreria=?, usoLibreria=? ,  cedulaf=? where idLibreria=?";
        t = objSa.ActualizarLibreria(objLi, sql);
        return t;
    }
    
    public LinkedList<Librerias> buscarLibrerias() {
        String sql="Select * from librerias_de_sonido;";
        Librerias objSa=new Librerias();
        LinkedList<Librerias> listSa=objSa.buscarLibrerias(sql);
        
        return listSa;
    }

    public LinkedList<Librerias> buscarLibrerias(String nombre) {
//        String sql="Select * from librerias_de_sonido inner join sonidos on librerias_de_sonido.idLibreria=sonidos.idLibreriaf  where nombreLibreria='" + nombre + "'";
        String sql="Select * from librerias_de_sonido where nombreLibreria='" + nombre + "'";
        Librerias objSa=new Librerias();
        LinkedList<Librerias> listSa=objSa.buscarLibrerias(sql);
        
        return listSa;
    }

    public LinkedList<Librerias> ConsultarPorUs(String nombre) {
        String sql="Select * from librerias_de_sonido inner join usuarios on librerias_de_sonido.cedulaf=usuarios.cedula  where usuarios.nick='" + nombre + "'";
        Librerias objSa=new Librerias();
        LinkedList<Librerias> listSa=objSa.buscarLibrerias(sql);
        
        return listSa;
    }
    
}
