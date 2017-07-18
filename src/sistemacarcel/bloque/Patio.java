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
public class Patio extends Bloque{
    public String numeroPatio;

    public Patio(String numeroBloque, int carcelId) {
        super(numeroBloque, carcelId);
    }
 
    /*
     * CRUD entidad Patio
     */
    public void registrarPatio(){
        
    }
    
    public void editarPatio(){
        
    }
    
    public void eliminarPatio(){
        
    }
    
    /*
     * Patron Composite
     */

    @Override
    public void mostrarBloque(int x) {
       System.out.println("mostrando informacion bloque "); 
    }  

    @Override
    public void registrarBloque(Bloque bloque) {
        System.out.println("no puedo registrar bloque "); 
    }

    @Override
    public void editarBloque(Bloque bloque) {
         System.out.println("no puedo editar bloque "); 
    }

    @Override
    public void eliminarBloque(Bloque bloque) {
         System.out.println("no puedo eliminar bloque "); 
    }
    
}
