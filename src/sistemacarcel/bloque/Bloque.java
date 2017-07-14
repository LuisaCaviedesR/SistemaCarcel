/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.bloque;

/**
 *
 * @author User
 */
public class Bloque {
    public String numeroBloque;
    public int carcelId;
    
    public void registrarBloque(String numeroBloque, int carcelId){
        System.out.println("Creando Bloque : "+numeroBloque+"de la carcel" +carcelId);
    }
    
    public void editarBloque(int bloqueId){
         System.out.println("Editando Bloque : "+bloqueId);
    }
    
    public void eliminarBloque(int bloqueId){
         System.out.println("Eliminando Bloque : "+bloqueId);
    }
    
}
