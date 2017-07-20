/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.misprimerospasos;

import java.util.ArrayList;
import sistemacarcel.bloque.BloqueComposite;
import sistemacarcel.bloque.Patio;
import sistemacarcel.celda.Celda;
import sistemacarcel.reportes.Consultas;
import sistemacarcel.reportes.CreatorReportes;
import sistemacarcel.reportes.Reporte;


/**
 *
 * @author User
 */
public class MisPrimerosPasos {
    Celda celda;
    Patio patio;
    BloqueComposite bloqueComposite;
    CreatorReportes creadorReportes;
    ArrayList<Reporte> reportes;
    
    public MisPrimerosPasos() {
        this.bloqueComposite = new BloqueComposite("B1",1);
        this.patio = new Patio("B1",1);
        this.celda = new Celda("B1",1);
        creadorReportes = new CreatorReportes();
        this.reportes = new ArrayList<Reporte>();
    }
    
    public void agregarBloque(){
       bloqueComposite.registrarBloque(celda);
       bloqueComposite.registrarBloque(patio);       
    }
    
    public void verReportes(String tipoReporte){
        System.out.println("variable tiporeporte: " + tipoReporte);
        switch(tipoReporte){
            case "Presos":
                reportes.add(creadorReportes.crearReportePresos());                
                break;
            case "CondenaPresos":
                //creadorReportes.crearReporteCondenaPresos();
                reportes.add(creadorReportes.crearReporteCondenaPresos());
                break;
            case "Visitas":
                //creadorReportes.crearReporteVisitas();
                reportes.add(creadorReportes.crearReporteVisitas());
                break;
            case "VisitasPresos":
                //creadorReportes.crearReporteVisitasPresos();
                reportes.add(creadorReportes.crearReporteVisitasPresos());
                break;
        } 
        for (Reporte reporte : reportes) {
            System.out.println("\n--"+reporte.getClass().getSimpleName()+"--");
            for (Consultas consulta : reporte.consultas) {
                System.out.println(" "+consulta.getSql());
            }
        }
    }      
 

   /* @Override
    public void update() {
        System.out.println("En caso de hacinamiento redistribuirCupos");
        this.redistribuirPresos();
    }
    
    public void redistribuirPresos(){
         System.out.println("Redistribuir presos");
    }*/
    

}
