/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.misprimerospasos;

import java.util.ArrayList;
import sistemacarcel.bloque.Bloque;
import sistemacarcel.bloque.BloqueComposite;
import sistemacarcel.bloque.Patio;
import sistemacarcel.celda.Celda;
import sistemacarcel.celda.DisponibleState;
import sistemacarcel.celda.FullState;
import sistemacarcel.celda.HacinamientoState;
import sistemacarcel.reportes.Consultas;
import sistemacarcel.preso.Preso;
import sistemacarcel.reportes.CreatorReportes;
import sistemacarcel.reportes.Reporte;


/**
 *
 * @author User
 */
public class MisPrimerosPasos {
    CreatorReportes creadorReportes;
    BloqueComposite bloqueComposite;
    Celda celda;
    Patio patio;
    ArrayList<Reporte> reportes;
    Preso preso;
    
    public MisPrimerosPasos() {
        creadorReportes = new CreatorReportes();
        bloqueComposite = new BloqueComposite("B1",1);
        celda           = new Celda("B1",1,4,0,"C1");
        patio           = new Patio("B1",1);
        preso           = new Preso();
        this.reportes = new ArrayList<Reporte>();
    }
    
    /**
     *
     * @param action
     */
    public void gestionarBloque(String action){
        switch(action){
            case "Adicionar":
                bloqueComposite.registrarBloque(bloqueComposite);
                break;
            case "Editar":
                bloqueComposite.editarBloque(bloqueComposite);
                break;
            case "Eliminar":
                bloqueComposite.eliminarBloque(bloqueComposite);
                break;
            case "Mostrar":
                bloqueComposite.mostrarBloque();
                break;
            default:
                bloqueComposite.mostrarBloque();
                break;
        }
    }
    
    public void gestionarCelda(String action) {
        switch(action){
            case "Adicionar":
                celda.registrarCelda(celda);
                break;
            case "Editar":
                celda.editarCelda(celda);
                break;
            case "Eliminar":
                celda.eliminarCelda(celda);
                break;
            case "Mostrar":
                celda.mostrarCelda();
                break;
            default:
                celda.mostrarCelda();
                break;
        }       
    }

    public void gestionarPatio() {
        patio.registrarPatio();
        patio.editarPatio();
        patio.eliminarPatio();
    }

    public void gestionarPresos() {
        preso.crearPreso();        
    }
    
    
    public void verReportes(String tipoReporte){
        switch(tipoReporte){
            case "Presos":
                reportes.add(creadorReportes.crearReportePresos());                
                break;
            case "CondenaPresos":
                reportes.add(creadorReportes.crearReporteCondenaPresos());
                break;
            case "Visitas":
                reportes.add(creadorReportes.crearReporteVisitas());
                break;
            case "VisitasPresos":
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
    
    //Celda alarma = new Celda(numeroBloque, 0, 0, 0, numeroCelda);
        HacinamientoState hacinam = new HacinamientoState();
        DisponibleState dispo = new DisponibleState();
        FullState full = new FullState();
        
    public void estado(String estado){
        switch(estado){
            case "full":
                 celda.setEstado(full);                
                break;
            case "disponible":
                 celda.setEstado(dispo);
                break;
            case "hacinamiento":
                 celda.setEstado(hacinam);
                break;
        } 
        celda.asignarPresoCelda();
        celda.cambiarPresoCelda();
        celda.liberarCupo();         
    }
}
