/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataClass;

/**
 *
 * @author Andrea Naranjo Lima
 */
public class VistaSumarioCliente {
    
    private Cliente cliente;
    
    public VistaSumarioCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public String getSumarioCliente(){
        return cliente.getSumarioCliente();
    }
    /*public String getSumarioCliente(){
        Direccion direccion = cliente.getDireccion();
        return cliente.getTitulo() +  " " + cliente.getNombre() + " " + cliente.getApellido() + ", " 
       + direccion.getCiudad() + ", " + direccion.getCodigoPostal() + ", " + direccion.getPais();
    } Se mueve este método a la clase Cliente*/
}
