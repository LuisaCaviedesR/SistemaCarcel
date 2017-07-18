/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.celda;

/**
 *
 * @author User
 */
public interface CeldaState {
    /*
     * patrón state
    */
    public void asignarPresoCelda();
    public void cambiarPresoCelda();
    public void liberarCupo();
    /*
     * patrón observer
    */
    public void notificarObserver();
    public void registrarObserver(Observer observer);
    public void quitarObserver(Observer observer);
    
}
