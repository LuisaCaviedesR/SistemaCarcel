/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacarcel.bloque;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Patio extends Bloque{
    protected String numeroPatio;
    private ArrayList<Patio> patios = new ArrayList<>();


    public Patio(String numeroBloque, int carcelId , String numeroPatio) {
        super(numeroBloque, carcelId);
        this.numeroPatio = numeroPatio;
        this.numeroBloque= numeroBloque;
    }
 
    /*
     * CRUD entidad Patio
     */
    public void registrarPatio(Patio patio){
         patios.add(patio);
         System.out.println("Registro elemento");
    }
    
    public void editarPatio(Patio patio){
        System.out.println("Editando elemento");
    }
    
    public void eliminarPatio(Patio patio){
        patios.remove(patio);
        System.out.println("Eliminando elemento");
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
