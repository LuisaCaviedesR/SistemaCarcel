/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.misprimerospasos;

import sistemacarcel.bloque.BloqueComposite;
import sistemacarcel.bloque.Patio;
import sistemacarcel.celda.Celda;
import sistemacarcel.preso.Preso;
import sistemacarcel.reportes.CreatorReportes;


/**
 *
 * @author User
 */
public class MisPrimerosPasos {
    CreatorReportes creadorReportes;
    BloqueComposite bloqueComposite;
    Celda celda;
    Patio patio;
    Preso preso;
    
    public MisPrimerosPasos() {
        creadorReportes = new CreatorReportes();
        bloqueComposite = new BloqueComposite("B1",1);
        celda           = new Celda("B1",1);
        patio           = new Patio("B1",1);
        preso           = new Preso();
    }
    public void gestionarBloque(){
        bloqueComposite.registrarBloque(bloqueComposite);
        bloqueComposite.editarBloque(bloqueComposite);
        bloqueComposite.eliminarBloque(bloqueComposite);
        bloqueComposite.mostrarBloque(1);
    }
    
    public void gestionarCelda() {
        celda.registrarCelda();
        celda.editarCelda();
        celda.eliminarCelda();
    }

    public void gestionarPatio() {
        patio.registrarPatio();
        patio.editarPatio();
        patio.eliminarPatio();
    }

    public void gestionarPresos() {
        preso.crearPreso();
        preso.registrarCondenaPreso();
    }
    
    
    public void verReportes(String tipoReporte){
        /*if o switch para que dependiendo del parametro se llame el reporte xyz*/
        creadorReportes.crearReportePresos();
        creadorReportes.crearReporteCondenaPresos();
        creadorReportes.crearReporteVisitas();
        creadorReportes.crearReporteVisitasPresos();
    }      
 
    
    

}
