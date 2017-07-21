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
    
    public static void muestraMenuPrincipal(){
        StringBuffer menu = new StringBuffer();
        menu.append("---------------------------------\n");
        menu.append("MENÚ PRINCIPAL\n");
        menu.append("1.Gestión Bloques 2. Gestión Celdas 3.Reportes 0.Salir\n");
        menu.append("---------------------------------\n");
        System.out.println(menu.toString());
    }
    
    public static void muestraMenuBloque(){
        StringBuffer menu = new StringBuffer();
        menu.append("---------------------------------\n");
        menu.append("GESTIÓN BLOQUES: SELECCIONE LA ACCIÓN QUE DESEA REALIZAR\n");
        menu.append("1.Adicionar 2.Editar 3.Eliminar 4.Mostrar 0.Atrás\n");
        menu.append("---------------------------------\n");
        System.out.println(menu.toString());
    }
    
    public static void muestraMenuCelda(){
        StringBuffer menu = new StringBuffer();
        menu.append("---------------------------------\n");
        menu.append("GESTIÓN CELDA: SELECCIONE LA ACCIÓN QUE DESEA REALIZAR\n");
        menu.append("1.Adicionar 2.Editar 3.Eliminar 4.Mostrar 0.Atrás\n");
        menu.append("---------------------------------\n");
        System.out.println(menu.toString());
    }
    
    public static void muestraMenuReporte(){
        StringBuffer menu = new StringBuffer();
        menu.append("---------------------------------\n");
        menu.append("REPORTES: SELECCIONE EL TIPO DE REPORTE QUE DESEA VER\n");
        menu.append("1. Presos 2. CondenaPresos 3.Visitas 4.VisitasPresos 0.Atrás\n");
        menu.append("---------------------------------\n");
        System.out.println(menu.toString());
    }
    
    public static void main(String[] args) {
        NoLoHareDeNuevo  noloharedenuevo = new NoLoHareDeNuevo();
        MisPrimerosPasos misprimerospasos = new MisPrimerosPasos();
        
        Scanner  entradaDatosMenu = new Scanner(System.in);
        String opcionMenu;
        do{
            muestraMenuPrincipal();
            opcionMenu=entradaDatosMenu.nextLine();
            switch(opcionMenu){
                case "1":
                    String opcionBloque;
                    Scanner entradaDatosBloque = new Scanner(System.in);
                    do{
                        muestraMenuBloque();
                        opcionBloque=entradaDatosBloque.nextLine();
                        switch(opcionBloque){
                            case "1": misprimerospasos.gestionarBloque("Adicionar");
                                break;
                            case "2": misprimerospasos.gestionarBloque("Editar");
                                break;
                            case "3": misprimerospasos.gestionarBloque("Eliminar");
                                break;
                            case "4": misprimerospasos.gestionarBloque("Mostrar");
                                break;
                            case "0": 
                                break;
                            default: System.out.println("Error. opción no válida");
                                break;
                        }
                    }while(!opcionBloque.equals("0")); 
                    break;
                case "2":
                    String opcionCelda;
                    Scanner entradaDatosCelda = new Scanner(System.in);
                    do{
                        muestraMenuBloque();
                        opcionCelda=entradaDatosCelda.nextLine();
                        switch(opcionCelda){
                            case "1": misprimerospasos.gestionarBloque("Adicionar");
                                break;
                            case "2": misprimerospasos.gestionarBloque("Editar");
                                break;
                            case "3": misprimerospasos.gestionarBloque("Eliminar");
                                break;
                            case "4": misprimerospasos.gestionarBloque("Mostrar");
                                break;
                            case "0": 
                                break;
                            default: System.out.println("Error. opción no válida");
                                break;
                        }
                    }while(!opcionCelda.equals("0")); 
                    break;
                case "3":
                    String opcionReporte;
                    Scanner entradaDatosReporte = new Scanner(System.in);
                    do{
                        muestraMenuReporte();
                        opcionReporte=entradaDatosReporte.nextLine();
                        switch(opcionReporte){
                            case "1": misprimerospasos.verReportes("Presos");
                                    break;
                            case "2": misprimerospasos.verReportes("CondenaPresos");
                                    break;
                            case "3": misprimerospasos.verReportes("Visitas");
                                    break;
                            case "4": misprimerospasos.verReportes("VisitasPresos");
                                    break;
                            case "0": 
                                break;
                            default: System.out.println("Error. opción no válida");
                                     break;
                        }
                    }while(!opcionReporte.equals("0"));
                    break;
                case "0": System.exit(0);
            }
        }while(!opcionMenu.equals("0"));           
    }
}