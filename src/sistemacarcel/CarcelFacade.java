/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel;

import sistemacarcel.misprimerospasos.MisPrimerosPasos;
import sistemacarcel.noloharedenuevo.NoLoHareDeNuevo;

/**
 *
 * @author User
 */
public class CarcelFacade {
    private MisPrimerosPasos misprimerospasos;
    private NoLoHareDeNuevo  noloharedenuevo;
        
    public CarcelFacade(MisPrimerosPasos misprimerospasos,NoLoHareDeNuevo noloharedenuevo) {
        this.misprimerospasos = misprimerospasos;
        this.noloharedenuevo  = noloharedenuevo;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here  
        /*GestorAlmacenamiento almacenamientoInformacion = new GestorAlmacenamiento();
        ArrayList datos = new ArrayList();
        almacenamientoInformacion.guardar(datos); */
    }
       
    public void gestionarCelda(){      
    }    
    public void gestionarBloque(){
        misprimerospasos.gestionarBloque();
    }
    public void gestionarPatio(){
    }  
    public void gestionarPresos(){
    }
    
    public void VerReportes(){        
        //misprimerospasos.verReportes(tipoReporte);
    }
}
