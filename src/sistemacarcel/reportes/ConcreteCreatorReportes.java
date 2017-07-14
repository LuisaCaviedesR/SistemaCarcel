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
public class ConcreteCreatorReportes extends CreatorReportes  {

    @Override
    public ReportePresos reportePresos() {
         return new ConcreteReportePresos();
    }    

    @Override
    public ReporteVisitas reporteVisitas() {
        return new ConcreteReporteVisitas();
    }

    @Override
    public ReporteCondenaPreso reporteCondenaPreso() {
       return new ConcreteReporteCondenaPreso();
    }

    @Override
    public ReporteVisitasPresos reporteVisitasPresos() {
        return new ConcreteReporteVisitasPresos();
    }
}
