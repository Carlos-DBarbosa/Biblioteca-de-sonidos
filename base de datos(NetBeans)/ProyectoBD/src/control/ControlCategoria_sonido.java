/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Categoria_sonido;

/**
 *
 * @author Carlo
 */
public class ControlCategoria_sonido {
    
    public boolean insertarCategoria(Categoria_sonido objC) {
        boolean t= false;
        Categoria_sonido objC2 = new Categoria_sonido();
        String sql = "";       
        sql = "INSERT INTO CATEGORIAS_SONIDO(nombreCategoria, descripcionCategoria, usosPotenciales, idAdminf) VALUES(?,?,?,?)"; 
        t = objC2.insertarCategoria(objC, sql);
        return t;
    }

    public LinkedList<Categoria_sonido> consultarCategorias() {
        String sql="Select * from categorias_sonido;";
        Categoria_sonido objc=new Categoria_sonido();
        LinkedList<Categoria_sonido> listc=objc.buscarCategoria(sql);
        
        return listc;
    }

    public boolean ActualizarCategoria(Categoria_sonido objC) {
        boolean t= false;
        Categoria_sonido objc = new Categoria_sonido();
        String sql = "update categorias_sonido set nombreCategoria=?, descripcionCategoria=?, usosPotenciales=?, idAdminf=? where idCategoria=?";
        t = objc.ActualizarCategoria(objC, sql);
        return t;
    }

    public boolean EliminarCategoria(Categoria_sonido objC) {
        boolean t= false;
        Categoria_sonido objc = new Categoria_sonido();
        String sql = "DELETE FROM categorias_sonido WHERE idCategoria=?";
        t = objc.EliminarCategoria(objC, sql);
        return t;
    }

    public LinkedList<Categoria_sonido> consultarPorNombre(String nombre) {
        String sql="Select * from categorias_sonido inner join administradores on categorias_sonido.idAdminf=administradores.idAdmin  where administradores.usuarioAdmin='" + nombre + "'";
        Categoria_sonido objc=new Categoria_sonido();
        LinkedList<Categoria_sonido> listc=objc.buscarCategoria(sql);
        
        return listc;
    }
}
