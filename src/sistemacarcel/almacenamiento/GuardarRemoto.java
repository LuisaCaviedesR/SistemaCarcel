/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.almacenamiento;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class GuardarRemoto implements Guardar{

    @Override
    public void guardar(ArrayList informacion) {
         System.out.println("Guardando informacion de manera remota.");
    }
    
}
