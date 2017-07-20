/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.reportes;

/**
 *
 * @author User
 */
public class CreatorReportes {

    public CreatorReportes() {
    }
    
    public Reporte crearReportePresos(){
        System.out.println("crearReportePresos");
        return new ReportePresos();
    }
    
    public Reporte crearReporteCondenaPresos(){
        return new ReporteCondenaPreso();
    }
    
    public Reporte crearReporteVisitas(){
        return new ReporteVisitas();
    }
    
    public Reporte crearReporteVisitasPresos(){
        return new ReporteVisitasPresos();
    }
    
}
