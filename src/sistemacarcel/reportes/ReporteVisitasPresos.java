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
public class ReporteVisitasPresos extends Reporte{

    @Override
    public void crearReporte() {
        consultas.add(new ConsultaPreso("Select * from Presos"));
        consultas.add(new ConsultaVisitas("Select * from Visitas"));
    }   
}
