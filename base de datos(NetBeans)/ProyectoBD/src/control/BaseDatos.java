/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static java.lang.Class.forName;
import java.sql.*;

/**
 *
 * @author Carlo
 */
public class BaseDatos {
    
    Connection conexion;
    Statement st;

    public BaseDatos() {
    }

    public Connection getConexion() {
        return conexion;
    }
    
    public boolean crearConexion(){
       
        boolean t = false;
        
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectobases", "root", "root");
           st = conexion.createStatement();
           t= true;
       }catch(SQLException ex){
           ex.printStackTrace();
           t = false;
       }catch(ClassNotFoundException ex){
           ex.printStackTrace();
           t = false;
       } 
       
       return t;
    }
}
