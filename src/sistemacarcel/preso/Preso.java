/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.preso;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Preso {
    public String nombres;
    public String apellidos;
    public String identificacion;
    private ArrayList<String> presos = new ArrayList<>();
    private static Preso instancia;
    
    public Preso(){
        
    }
    
    public static Preso getPreso(){
        if(instancia == null){
            instancia = new Preso();
        }
        return instancia;
    }
    
    public void crearPreso(){
    }
    
    public void registrarCondenaPreso(){
        
    }
}
