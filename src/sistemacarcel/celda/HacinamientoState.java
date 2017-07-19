/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.celda;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class HacinamientoState implements CeldaState {
    
    private static ArrayList<Observer> observadores = new ArrayList<>();

    @Override
    public void asignarPresoCelda() {
        System.out.println("Existe Hacinamiento en esta Celda");
    }

    @Override
    public void cambiarPresoCelda() {
        System.out.println("Preso ha sido reubicado a otra celda, estado actual -1");  
    }

    @Override
    public void liberarCupo() {
        System.out.println("La celda ha quedado con un cupo libre, estado actual -1"); 
    }
    
    @Override
    public void notificarObserver() {
        for (int i = 0; i < observadores.size(); i++) {
            observadores.get(i).update();
        }  
    }

    @Override
    public void registrarObserver(Observer observer) {
        observadores.add(observer);  
    }

    @Override
    public void quitarObserver(Observer observer) {
        observadores.remove(observer);  
    }
}
