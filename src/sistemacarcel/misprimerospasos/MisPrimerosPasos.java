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
import sistemacarcel.celda.CeldaState;
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
    private static MisPrimerosPasos instancia;
    
    public MisPrimerosPasos() {
        creadorReportes = new CreatorReportes();
        bloqueComposite = new BloqueComposite("B1",1);
        celda           = new Celda("B1",1,4,0,"C1");
        patio           = new Patio("B1",1,"P1");
        preso           = new Preso();
        this.reportes = new ArrayList<Reporte>();
    }
    
    public static MisPrimerosPasos getMisPrimerosPasos(){
        if(instancia == null){
            instancia = new MisPrimerosPasos();
        }
        return instancia;
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
        CeldaState estado = celda.getEstado();
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
            case "AsignarPreso":
                if (estado.getClass().getSimpleName().equals("HacinamientoState")){
                    redistribuirCupo();
                }else{
                    celda.asignarPresoCelda();
                }                
                break;
            case "CambiarPreso":
                celda.cambiarPresoCelda();
                break;
            case "LiberarCupo":
                celda.liberarCupo();
                break;
            default:
                celda.mostrarCelda();
                break;
        }       
    }
    
    public void redistribuirCupo(){
        System.out.println("Se debe redistribuir Cupo de la Celda");
    }
    
    public void gestionarPatio(String action) {
        switch(action){ 
            case "Adicionar":
                patio.registrarPatio(patio);
                break;
            case "Editar":    
                patio.editarPatio(patio);
            
            case "Eliminar":
                patio.eliminarPatio(patio);
        }        
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
}
