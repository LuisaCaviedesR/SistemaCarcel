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
public abstract class CreatorReportes {
    
    public abstract ReportePresos reportePresos();
    public abstract ReporteVisitasPresos reporteVisitasPresos();
    public abstract ReporteVisitas reporteVisitas();
    public abstract ReporteCondenaPreso reporteCondenaPreso();
}
