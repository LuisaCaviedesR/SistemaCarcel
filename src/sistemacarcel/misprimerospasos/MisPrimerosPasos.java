/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.misprimerospasos;

import sistemacarcel.bloque.BloqueComposite;
import sistemacarcel.reportes.CreatorReportes;


/**
 *
 * @author User
 */
public class MisPrimerosPasos {
    CreatorReportes creadorReportes;
    BloqueComposite bloqueComposite;
    
    public MisPrimerosPasos() {
        creadorReportes = new CreatorReportes();
        bloqueComposite = new BloqueComposite("B1",1);
    }
    public void gestionarBloque(){
        bloqueComposite.registrarBloque(bloqueComposite);
        bloqueComposite.editarBloque(bloqueComposite);
        bloqueComposite.eliminarBloque(bloqueComposite);
        bloqueComposite.mostrarBloque(1);
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
