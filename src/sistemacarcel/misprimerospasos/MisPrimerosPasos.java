/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.misprimerospasos;

import sistemacarcel.bloque.BloqueComposite;
import sistemacarcel.bloque.Patio;
import sistemacarcel.celda.Celda;
import sistemacarcel.reportes.CreatorReportes;


/**
 *
 * @author User
 */
public class MisPrimerosPasos {
    Celda celda;
    Patio patio;
    BloqueComposite bloqueComposite;
    CreatorReportes creadorReportes;
    
    public MisPrimerosPasos() {
        this.bloqueComposite = new BloqueComposite("B1",1);
        this.patio = new Patio("B1",1);
        this.celda = new Celda("B1",1);
        creadorReportes = new CreatorReportes();
    }
    public void agregarBloque(){
       bloqueComposite.registrarBloque(celda);
       bloqueComposite.registrarBloque(patio);       
    }
    
    public void verReportes(String tipoReporte){
        /*if o switch para que dependiendo del parametro se llame el reporte xyz*/
        creadorReportes.crearReportePresos();
        creadorReportes.crearReporteCondenaPresos();
        creadorReportes.crearReporteVisitas();
        creadorReportes.crearReporteVisitasPresos();
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
