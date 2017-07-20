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
public class ReportePresos extends Reporte{

    @Override
    public void crearReporte() {
        System.out.println("crearReporte");
        consultas.add(new ConsultaPreso("Select * from Presos"));
        System.out.println("lista consultas" + consultas.get(0));
    }    
}    
