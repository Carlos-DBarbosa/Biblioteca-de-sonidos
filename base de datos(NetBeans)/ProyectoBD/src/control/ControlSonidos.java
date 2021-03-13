/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.LinkedList;
import modelo.Sonidos;

/**
 *
 * @author alejandro
 */
public class ControlSonidos {
    public boolean insertarSonido(Sonidos objU) {
        boolean t= false;
        Sonidos objU2 = new Sonidos();
        String sql = "";       
        sql = "INSERT INTO SONIDOS(sonidoPublicoPrivado, duracionSonido, subidoPor, archivoSonido, descripcionSonido, fechaCreacion, precioS, idLibreriaf, idCategoriaf,cedulaf) VALUES(?,?,?,?,?,?,?,?,?,?)"; 
        t = objU2.insertarSonido(objU, sql);
        return t;
    } 
    public boolean EliminarSonido(Sonidos objSA) {
        boolean t= false;
        Sonidos objSa = new Sonidos();
        String sql = "DELETE FROM sonidos WHERE idSonido=?";
        t = objSa.EliminarSonido(objSA, sql);
        return t;
    }
    public boolean ActualizarSonido(Sonidos objSA) {
        boolean t= false;
        Sonidos objSa = new Sonidos();
        String sql = "update sonidos set sonidoPublicoPrivado=?, duracionSonido=?, subidoPor=?, archivoSonido=? , descripcionSonido=? ,fechaCreacion=?, precioS=?, idLibreriaf=?, idCategoriaf=?, cedulaf=? where idSonido=?";
        t = objSa.ActualizarSonido(objSA, sql);
        return t;
    }
    public LinkedList<Sonidos> buscarSonidos() {
        String sql="Select * from sonidos;";
        Sonidos objSa=new Sonidos();
        LinkedList<Sonidos> listSa=objSa.buscarSonidos(sql);
        
        return listSa;
    }

    public LinkedList<Sonidos> SonidosPorUsuario(String nombre) {
        Sonidos objSa=new Sonidos();
        
        String sql="Select * from sonidos where subidoPor='" + nombre + "'";
        
        LinkedList<Sonidos> listSa=objSa.buscarSonidos(sql);
        
        return listSa;
    }

    public LinkedList<Sonidos> SonidosPorFecha(String fecha) {
         Sonidos objSa=new Sonidos();
        
        String sql="Select * from sonidos where fechaCreacion='" + fecha + "'";
        
        LinkedList<Sonidos> listSa=objSa.buscarSonidos(sql);
        
        return listSa;
    }
     public LinkedList<Sonidos> buscarSonidosCategoria(int n) {
        String sql="call sonidosCategoria("+n+");";
        Sonidos objSa=new Sonidos();
        LinkedList<Sonidos> listSa=objSa.buscarSonidos(sql);
        return listSa;
    }
    


    
}
