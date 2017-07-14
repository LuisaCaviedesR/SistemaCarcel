/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel;

import sistemacarcel.misprimerospasos.MisPrimerosPasos;
import sistemacarcel.noloharedenuevo.NoLoHareDeNuevo;

/**
 *
 * @author User
 */
public class CarcelFacade {
    private MisPrimerosPasos misprimerospasos;
    private NoLoHareDeNuevo  noloharedenuevo;
    
    public CarcelFacade(MisPrimerosPasos misprimerospasos,NoLoHareDeNuevo noloharedenuevo) {
        this.misprimerospasos = misprimerospasos;
        this.noloharedenuevo  = noloharedenuevo;
    }
    
    public void asignarPresoCelda(){
      
    }
    public void cambiarPresoCelda(){
      
    }
    public void registrarBloque(MisPrimerosPasos misprimerospasos){
       String bloque = "B1";
       int carcel    = 1;
       misprimerospasos.agregarBloque(bloque,carcel);
    }
    public void eliminarBloque(MisPrimerosPasos misprimerospasos){
       int bloqueId = 1;
       misprimerospasos.eliminarBloque(bloqueId);
    }
    public void editarBloque(MisPrimerosPasos misprimerospasos){
       int bloqueId = 1;
       misprimerospasos.editarBloque(bloqueId);
    }
    public void registarPatio(){
       
    }    
    public void redistribuirPresos(){
        misprimerospasos.redistribuirPresos();
    }    
    public void registrarCelda(){
       
    }    
    public void editarCelda(){
        
    }
    public void eliminarCelda(){
      
    }
    
    public void VerReportes(){
        
      
    }
}
