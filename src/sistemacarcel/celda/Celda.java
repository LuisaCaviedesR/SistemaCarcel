/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.celda;
import java.util.ArrayList;
import sistemacarcel.bloque.Bloque;
/**
 *
 * @author User
 */
public class Celda extends Bloque {
    private CeldaState estado;
    protected int capacidad;
    protected int cantidadActual;
    protected String numeroCelda;
    protected String numeroBlo;
    private ArrayList<Celda> celdas = new ArrayList<>();

      
    public Celda(String numeroBloque, int carcelId, int capacidad, int cantidadActual, String numeroCelda) {
        super(numeroBloque, carcelId);
        this.cantidadActual = cantidadActual;
        this.capacidad      = capacidad;
        this.numeroCelda    = numeroCelda;
        this.numeroBlo      = numeroBloque;
        this.estado         = new FullState();
    }

    /*
     *Implementación de Patrón State
     */
    public void setEstado(CeldaState e){
        estado=e;
    }
    public void asignarPresoCelda(){
        estado.asignarPresoCelda();
    }
    public void cambiarPresoCelda(){
        estado.cambiarPresoCelda();
    }
    public void liberarCupo(){
        estado.liberarCupo();
    }
    
    /*
     * CRUD entidad Celda
     */
    public void registrarCelda(Celda celda){
         celdas.add(celda);
         System.out.println("Registro elemento");
    }
    
    public void editarCelda(Celda celda){
       System.out.println("Editando elemento");
    }
    
    public void eliminarCelda(Celda celda){
        celdas.remove(celda);
        System.out.println("Eliminando elemento");
    } 
    
    public void mostrarCelda() {
       if (celdas.size()>0){
            System.out.println("mostrando información celdas "); 
            for (int i = 0; i < celdas.size(); i++) {
                System.out.println(i + " " + celdas.get(i).numeroCelda + " "+celdas.get(i).capacidad);
            }            
        }else{
            System.out.println("No existen Celdas");
        }
    }

   /*
     * Patron Composite
     */

    @Override
    public void mostrarBloque() {
       System.out.println("mostrando informacion bloque "); 
    }  

    @Override
    public void registrarBloque(Bloque bloque) {
        System.out.println("no puedo registrar bloque "); 
    }

    @Override
    public void editarBloque(Bloque bloque) {
         System.out.println("no puedo editar bloque "); 
    }

    @Override
    public void eliminarBloque(Bloque bloque) {
         System.out.println("no puedo eliminar bloque "); 
    }

    
    
}
