/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.misprimerospasos;

import sistemacarcel.bloque.BloqueComposite;
import sistemacarcel.bloque.Patio;
import sistemacarcel.celda.Celda;
import sistemacarcel.celda.Observer;

/**
 *
 * @author User
 */
public class MisPrimerosPasos implements Observer {
    Celda celda;
    Patio patio;
    BloqueComposite bloqueComposite;

    public MisPrimerosPasos() {
        this.bloqueComposite = new BloqueComposite("B1",1);
        this.patio = new Patio("B1",1);
        this.celda = new Celda("B1",1);
    }
    public void agregarBloque(){
       bloqueComposite.registrarBloque(celda);
       bloqueComposite.registrarBloque(patio);       
    } 

    @Override
    public void update() {
        System.out.println("En caso de hacinamiento redistribuirCupos");
        this.redistribuirPresos();
    }
    
    public void redistribuirPresos(){
         System.out.println("Redistribuir presos");
    }
    
}
