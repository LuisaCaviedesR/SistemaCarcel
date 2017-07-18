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
public abstract class Bloque {
    protected String numeroBloque;
    protected int carcelId;
    
    public Bloque(String numeroBloque, int carcelId) {
        this.numeroBloque = numeroBloque;
        this.carcelId     = carcelId;
    }
    
    public abstract void registrarBloque(Bloque bloque);    
    public abstract void editarBloque(Bloque bloque);
    public abstract void  eliminarBloque(Bloque bloque);
    public abstract void mostrarBloque(int x);  
}
