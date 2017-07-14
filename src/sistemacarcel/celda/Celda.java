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
    
    
}
