/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.reportes;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public abstract class CreatorReportes {
    protected ArrayList<String> consultas = new ArrayList();
    
    public CreatorReportes(){
        /**
         * preguntar si se incluyen los métodos de los reportes en el constructor
         * de la clase abstracta
         */
        //this.reportePresos();
    }
    
    protected String consulta1 = "Select * from presos;";
    protected String consulta2 = "Select * from bloques;";
    protected String consulta3 = "Select * from visitas;";
    protected String consulta4 = "Select * from condena;";
    
    public abstract void reportePresos();
    public abstract void reporteVisitasPresos();
    public abstract void reporteVisitas();
    public abstract void reporteCondenaPreso();
}
