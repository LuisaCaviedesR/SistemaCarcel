/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.bloque;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BloqueComposite extends Bloque{
    
    private ArrayList<Bloque> bloques = new ArrayList<>();
    
    public BloqueComposite(String numeroBloque, int carcelId) {
         super(numeroBloque, carcelId);
    }

    @Override
    public void registrarBloque(Bloque bloque) {
         bloques.add(bloque);
         System.out.println("Registro elemento");
    }

    @Override
    public void editarBloque(Bloque bloque) {
         System.out.println("Editando elemento");
    }

    @Override
    public void eliminarBloque(Bloque bloque) {
        bloques.remove(bloque);
    }

    @Override
    public void mostrarBloque(int x) {
       System.out.println("mostrando informacion bloque "); 
    }
  
}
