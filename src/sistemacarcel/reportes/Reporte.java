/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.reportes;

import java.util.ArrayList;

/**
 *
 * @author Tefa Marin
 */
public abstract class Reporte{
    
    public ArrayList<Consultas> consultas = new ArrayList();

    public Reporte() {
        this.crearReporte();
    }

    public ArrayList<Consultas> getConsultas() {
        return consultas;
    }

    public abstract void crearReporte();   
    
}
