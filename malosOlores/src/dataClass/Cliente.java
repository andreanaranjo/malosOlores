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
public class Cliente {
    
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private String titulo;

    public Cliente(String nombre, String apellido, Direccion direccion, String titulo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public String getSumarioCliente(){
        return this.getTitulo() +  " " + this.getNombre() + " " + this.getApellido() + ", " 
       + direccion.getSumarioDireccion();
    }
   
}
