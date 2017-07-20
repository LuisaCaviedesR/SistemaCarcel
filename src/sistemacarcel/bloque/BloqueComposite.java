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
        System.out.println("Eliminando elemento");
    }

    @Override
    public void mostrarBloque() {    
        if (bloques.size()>0){
            System.out.println("mostrando información bloques "); 
            for (int i = 0; i < bloques.size(); i++) {
                System.out.println(i + " " + bloques.get(i).numeroBloque);
            }
            
        }else{
            System.out.println("No existen bloques");
        }
    }
  
}
