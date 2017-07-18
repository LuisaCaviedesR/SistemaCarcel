/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.celda;
import sistemacarcel.bloque.Bloque;
/**
 *
 * @author User
 */
public class Celda extends Bloque {
    private CeldaState estado;
    public int capacidad;
    public int cantidadActual;
    public String numeroCelda;

    public Celda(String numeroBloque, int carcelId) {
        super(numeroBloque, carcelId);
    }
    /*
     *Implementación de Patrón State
     */
    public void setEstado(CeldaState e){
        estado=e;
    }
    public void asignarPresoCelda(){
        estado.asignarPresoCelda();
    }
    public void cambiarPresoCelda(){
        estado.cambiarPresoCelda();
    }
    public void liberarCupo(){
        estado.asignarPresoCelda();
    }
    
    /*
     * CRUD entidad Celda
     */
    public void registrarCelda(){
        
    }
    
    public void editarCelda(){
        
    }
    
    public void eliminarCelda(){
        
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
