/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.misprimerospasos;

import sistemacarcel.bloque.Bloque;

/**
 *
 * @author User
 */
public class MisPrimerosPasos {
    public Bloque bloque;

    public MisPrimerosPasos() {
        this.bloque = new Bloque();
    }
    public void redistribuirPresos(){
    }
    
    public void agregarBloque(String numeroBloque, int carcelId){
        bloque.registrarBloque(numeroBloque,carcelId);
    }    
    public void eliminarBloque(int bloqueId){
        bloque.eliminarBloque(bloqueId);
    }
    public void editarBloque(int bloqueId) {
       bloque.editarBloque(bloqueId);
    }
}
