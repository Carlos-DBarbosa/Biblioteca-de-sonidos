/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import control.BaseDatos;

/**
 *
 * @author Carlo
 */
public class ProyectoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BaseDatos objb = new BaseDatos();
        boolean t = objb.crearConexion();
        if(t==true){
            System.out.println("Conexion exitosa");
        }else{
            System.out.println("Conexion No exitosa");
        }
    }
    
}
