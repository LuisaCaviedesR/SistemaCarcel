/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.noloharedenuevo;

/**
 *
 * @author User
 */
public class NoLoHareDeNuevo {
    
    private static NoLoHareDeNuevo instancia;
    
    public NoLoHareDeNuevo(){
        
    }
    
    public static NoLoHareDeNuevo getNoLoHareDeNuevo(){
        if(instancia == null){
            instancia = new NoLoHareDeNuevo();
        }
        return instancia;
    }
}
