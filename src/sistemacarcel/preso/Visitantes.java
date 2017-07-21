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
public class Visitantes {
    protected String nombreVisitante;
    protected String apellidosVisitante;
    protected String identificacionVisitante;
    protected enum tipoVisitante{FAMILIAR,AMIGO};
    private ArrayList<Visitantes> visitantes = new ArrayList<>();

    public Visitantes(String nombreVisitante, String apellidosVisitante, String identificacionVisitante){
        this.nombreVisitante         = nombreVisitante;
        this.apellidosVisitante      = apellidosVisitante;
        this.identificacionVisitante = identificacionVisitante;
    }
    public void registrarVisitante(Visitantes visitante){
         visitantes.add(visitante);
         System.out.println("Registro elemento");
    }
    public void actualizarVisitante(Visitantes visitante){
         System.out.println("Registro elemento");
    }

    /**
     *
     * @param tipoVisitante
     * @param idPreso
     */
    public void relacionarconPresos(String tipoVisitante , int idPreso){
        if(tipoVisitante == "AMIGO"){
            System.out.println("Establecer relaciones con preso"); 
        }else{
            System.out.println("Indicar parentesco");      
        }
    }
    
}
