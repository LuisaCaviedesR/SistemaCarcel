/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.preso;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Visitas {
    protected Date fechaVisita;
    protected Time horaVisita;
    protected int  idVisitante;
    protected int  idPreso;
    
    public ArrayList<Visitas> visitas = new ArrayList<>();
    
    /**
     *
     * @param fechaVisita
     * @param horaVisita
     * @param idPreso
     * @param idVisitante
     */
    public void Visitas(Date fechaVisita,Time horaVisita, int idPreso, int idVisitante){
        this.fechaVisita = fechaVisita;
        this.horaVisita  = horaVisita;
        this.idPreso     = idPreso;
        this.idVisitante = idVisitante;
    }
    
    public void registrarVisita(Visitas visita){
        visitas.add(visita);
        System.out.println("Registro visita");
    }
    
}
