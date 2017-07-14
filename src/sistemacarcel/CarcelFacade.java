/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel;

import sistemacarcel.bloque.Bloque;
import sistemacarcel.bloque.Patio;
import sistemacarcel.celda.Celda;
import sistemacarcel.misprimerospasos.MisPrimerosPasos;

/**
 *
 * @author User
 */
public class CarcelFacade {
    private Bloque bloque;
    private Celda celda;
    private Patio patio;
    private MisPrimerosPasos misprimerospasos;
    
    public CarcelFacade(Bloque bloque, Celda celda, Patio patio,MisPrimerosPasos misprimerospasos) {
        this.bloque           = bloque;
        this.celda            = celda;
        this.patio            = patio;
        this.misprimerospasos = misprimerospasos;
    }
    
    public void asignarPresoCelda(){
      celda.asignarPresoCelda();
    }
    public void cambiarPresoCelda(){
      celda.asignarPresoCelda();
    }
    public void registrarBloque(){
        bloque.registrarBloque();
    }
    public void eliminarBloque(){
        bloque.eliminarBloque();
    }
    public void editarBloque(){
       bloque.editarBloque();
    }
    public void registarPatio(){
        patio.registrarPatio();
    }    
    public void redistribuirPresos(){
        misprimerospasos.redistribuirPresos();
    }    
    public void registrarCelda(){
        celda.registrarCelda();
    }    
    public void editarCelda(){
        celda.editarCelda();
    }
    public void eliminarCelda(){
        celda.eliminarCelda();
    }
    
    public void VerReportes(){
    }
}
