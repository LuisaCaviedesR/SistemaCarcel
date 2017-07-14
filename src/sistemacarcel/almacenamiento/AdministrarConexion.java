/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.almacenamiento;

/**
 *
 * @author User
 */
public class AdministrarConexion {
    public static boolean Conexion;

    public AdministrarConexion() {
        Conexion = false;
    }
    
    public static void conecta(){
        Conexion = true;
    }
    
    public static void desconecta(){
        Conexion=false;
    }
    
    public static boolean Conexion(){
        return Conexion;
    }
}
