/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.util.LinkedList;
import modelo.Administrador;
import vista.VistaInsertAdministrador;

/**
 *
 * @author Carlo
 */
public class ControlAdministrador {

    public boolean insertarAdministrador(Administrador objA) {
        boolean t= false;
        Administrador objA2 = new Administrador();
        String sql = "";       
        sql = "INSERT INTO ADMINISTRADORES(contrasenaAdmin, usuarioAdmin, correoAdmin, telefonoAdmin, direccionAdmin) VALUES(?,?,?,?,?)"; 
        t = objA2.insertarAdministrador(objA, sql);
        return t;
    }

    public LinkedList<Administrador> consultarAdministradores() {
        String sql="Select * from administradores;";
        Administrador objA = new Administrador();
        LinkedList<Administrador> listA = objA.buscarAdministrador(sql);
        
        return listA;
    }

    public boolean ActualizarAdministrador(Administrador objA) {
        boolean t= false;
        Administrador obja = new Administrador();
        String sql = "update administradores set contrasenaAdmin=?, usuarioAdmin=?, correoAdmin=?, telefonoAdmin=?, direccionAdmin=? where idAdmin=?";
        t = obja.ActualizarAdministrador(objA, sql);
        return t;
    }

    public boolean EliminarAdministrador(Administrador objA) {
        boolean t= false;
        Administrador obja = new Administrador();
        String sql = "DELETE FROM administradores WHERE idAdmin=?";
        t = obja.EliminarAdministrador(objA, sql);
        return t;
    }

    public LinkedList<Administrador> consultarAdministradores(String nombre) {
        String sql="Select * from administradores where usuarioAdmin='" + nombre + "'";
        Administrador objA = new Administrador();
        LinkedList<Administrador> listA = objA.buscarAdministrador(sql);
        
        return listA;
    }

    
    
}
