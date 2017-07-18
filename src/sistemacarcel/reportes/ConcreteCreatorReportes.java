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
    public void reportePresos() {
        System.out.println(super.consulta1);
        System.out.println(super.consulta2);
    }    

    @Override
    public void reporteVisitas() {
    }

    @Override
    public void reporteCondenaPreso() {
    }

    @Override
    public void reporteVisitasPresos() {
    }
}

/*   @Override
    public void reportePresosBloque() {
        //todo implementar la lógica  del reporte.
       System.out.println("Lista de presos por bloque");
    }*/