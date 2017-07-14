/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misprimerospasos.preso;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Condena {
    private ArrayList<String> condenas = new ArrayList<>();
    private static Condena instancia;
    
    public Condena(){
        
    }
    
    public static Condena getCondena(){
        if(instancia == null){
            instancia = new Condena();
        }
        return instancia;
    }
    
    public void registrarCondena(){
        
    }
}
