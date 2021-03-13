/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;

import modelo.SubidosAdminPorCategoria;

/**
 *
 * @author Windows
 */
public class ControlSubidosAdminPorCategoria {
    public LinkedList<SubidosAdminPorCategoria> buscarSubidosAdminPorCategoria(int n) {
        String sql="call sonidosAdminBuscarCategoria("+n+")";
        SubidosAdminPorCategoria objSa=new SubidosAdminPorCategoria();
        LinkedList<SubidosAdminPorCategoria> listSa=objSa.buscarSubidosAdminPorCategoria(sql, n);
        
        return listSa;
    }
    
}
