/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel;
import java.util.ArrayList;
import sistemacarcel.almacenamiento.GestorAlmacenamiento;
import sistemacarcel.bloque.BloqueComposite;
import sistemacarcel.reportes.*;

/**
 *
 * @author User
 */
public class SistemaCarcel {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        GestorAlmacenamiento almacenamientoInformacion = new GestorAlmacenamiento();
        ArrayList datos = new ArrayList();
        almacenamientoInformacion.guardar(datos);
        
        ConcreteCreatorReportes rep = new ConcreteCreatorReportes();        
        rep.reportePresos();
        
       // BloqueComposite bloqueComposite = new BloqueComposite();
        
    }    
}
