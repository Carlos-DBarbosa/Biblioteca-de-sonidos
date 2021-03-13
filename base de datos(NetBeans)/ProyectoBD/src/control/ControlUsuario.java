/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Usuario;

/**
 *
 * @author Carlo
 */
public class ControlUsuario {

    public boolean insertarUsuario(Usuario objU) {
        boolean t= false;
        Usuario objU2 = new Usuario();
        String sql = "";       
        sql = "INSERT INTO USUARIOS(cedula, nick, fechaNacimiento, correoU, contrasenaU, telefonoU, fotoPerfil, direccionU) VALUES(?,?,?,?,?,?,?,?)"; 
        t = objU2.insertarUsuario(objU, sql);
        return t;
    }

    public LinkedList<Usuario> consultarUsuarios() {
        String sql="Select * from usuarios;";
        Usuario objU = new Usuario();
        LinkedList<Usuario> listU = objU.buscarUsuario(sql);
        
        return listU;
    }

    public boolean ActualizarUsuario(Usuario objU) {
        boolean t= false;
        Usuario obju = new Usuario();
        String sql = "update usuarios set nick=?, fechaNacimiento=?, correoU=?, contrasenaU=?, telefonoU=?, fotoPerfil=?, direccionU=? where cedula=?";
        t = obju.ActualizarUsuario(objU, sql);
        return t;
    }

    public boolean EliminarUsuario(Usuario objU) {
        boolean t= false;
        Usuario obju = new Usuario();
        String sql = "DELETE FROM usuarios WHERE cedula=?";
        t = obju.EliminarUsuario(objU, sql);
        return t;
    }

    public LinkedList<Usuario> consultarUsuarios(String nombre) {
        String sql="Select * from usuarios where nick='" + nombre + "'";
        Usuario objU = new Usuario();
        LinkedList<Usuario> listU = objU.buscarUsuario(sql);
        
        return listU;
    }
    
}
