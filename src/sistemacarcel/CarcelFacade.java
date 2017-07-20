/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel;

import java.util.Scanner;
import sistemacarcel.misprimerospasos.MisPrimerosPasos;
import sistemacarcel.noloharedenuevo.NoLoHareDeNuevo;

/**
 *
 * @author User
 */
public class CarcelFacade {
    
    NoLoHareDeNuevo  noloharedenuevo = new NoLoHareDeNuevo();
    static MisPrimerosPasos misprimerospasos = new MisPrimerosPasos();
    public static void muestraMenu(){
        StringBuffer menu = new StringBuffer();
        menu.append("---------------------------------\n");
        menu.append("SELECCIONE EL TIPO DE REPORTE\n");
        menu.append("1. Presos 2. CondenaPresos 3.Visitas 4.VisitasPresos 0.Salir\n");
        menu.append("---------------------------------\n");
        System.out.println(menu.toString());
    }
    
    public static void main(String[] args) {
        String opcionReporte;
        Scanner entradaDatos = new Scanner(System.in);
        do{
            muestraMenu();
            opcionReporte=entradaDatos.nextLine();
            switch(opcionReporte){
                case "1": misprimerospasos.verReportes("Presos");
                        break;
                case "2": misprimerospasos.verReportes("CondenaPresos");
                        break;
                case "3": misprimerospasos.verReportes("Visitas");
                        break;
                case "4": misprimerospasos.verReportes("VisitasPresos");
                        break;
                case "0": System.exit(0);
                default: System.out.println("Error. opción no válida");
                         break;
            }
        }while(opcionReporte != "0");     
    }
       
    public void gestionarCelda(){
        misprimerospasos.gestionarCelda();
    }    
    public void gestionarBloque(){
        misprimerospasos.gestionarBloque();
    }
    public void gestionarPatio(){
        misprimerospasos.gestionarPatio();
    }  
    public void gestionarPresos(){
        misprimerospasos.gestionarPresos();
    }
}
