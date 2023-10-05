/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DESKTOP-TPC6SO4
 */
public class Conectar {
   
    public static String db = "proyectofinal";
    public static String url = "jdbc:mysql://localhost:3307/"+db;
    public static String user = "root";
    public static String pass = "root";
    
   private static Connection link = null;
    
   public static Connection getConnection(){
       if (link != null) {
            return link;
        }
       
       try{
           Class.forName("org.gjt.mm.mysql.Driver");
           link = DriverManager.getConnection(Conectar.url, Conectar.user, Conectar.pass);
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
       }
       return link;
   }
}
