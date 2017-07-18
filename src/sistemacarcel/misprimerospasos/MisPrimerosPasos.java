/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.misprimerospasos;

import sistemacarcel.bloque.BloqueComposite;
import sistemacarcel.bloque.Patio;
import sistemacarcel.celda.Celda;

/**
 *
 * @author User
 */
public class MisPrimerosPasos {
    Celda celda;
    Patio patio;
    BloqueComposite bloqueComposite;

    public MisPrimerosPasos() {
        this.bloqueComposite = new BloqueComposite();
        this.patio = new Patio();
        this.celda = new Celda();
    }
    public void agregarBloque(){
       bloqueComposite.registrarBloque(celda);
       
    }
}
