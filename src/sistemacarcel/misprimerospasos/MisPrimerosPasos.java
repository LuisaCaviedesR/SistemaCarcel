/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.misprimerospasos;

import sistemacarcel.bloque.BloqueComposite;
import sistemacarcel.bloque.Patio;
import sistemacarcel.celda.Celda;
<<<<<<< HEAD
import sistemacarcel.reportes.CreatorReportes;
=======
import sistemacarcel.celda.Observer;
>>>>>>> 1cc4149d2ad157e71aa1cfe9bf46f9f37ae08406

/**
 *
 * @author User
 */
public class MisPrimerosPasos implements Observer {
    Celda celda;
    Patio patio;
    BloqueComposite bloqueComposite;
    CreatorReportes creadorReportes;
    
    public MisPrimerosPasos() {
        this.bloqueComposite = new BloqueComposite("B1",1);
        this.patio = new Patio("B1",1);
        this.celda = new Celda("B1",1);
<<<<<<< HEAD
        creadorReportes = new CreatorReportes();
=======
>>>>>>> 1cc4149d2ad157e71aa1cfe9bf46f9f37ae08406
    }
    public void agregarBloque(){
       bloqueComposite.registrarBloque(celda);
       bloqueComposite.registrarBloque(patio);       
<<<<<<< HEAD
    }
    
    public void verReportes(String tipoReporte){
        /*if o switch para que dependiendo del parametro se llame el reporte xyz*/
        creadorReportes.crearReportePresos();
        creadorReportes.crearReporteCondenaPresos();
        creadorReportes.crearReporteVisitas();
        creadorReportes.crearReporteVisitasPresos();
    }      
=======
    } 

    @Override
    public void update() {
        System.out.println("En caso de hacinamiento redistribuirCupos");
        this.redistribuirPresos();
    }
    
    public void redistribuirPresos(){
         System.out.println("Redistribuir presos");
    }
    
>>>>>>> 1cc4149d2ad157e71aa1cfe9bf46f9f37ae08406
}
