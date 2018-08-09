/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inappropiateIntimacy;

/**
 *
 * @author Andrea Naranjo Lima
 */
public class Motociclista {
    
    private Licencia licencia;
    private String nombre;
    private String apellido;
    private String titulo;

    /*public Motociclista(Licencia licencia, String nombre, String apellido, String titulo) {
        licencia.setMotociclista(this);
        this.licencia = licencia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
    }*/
    
    public Motociclista(Licencia licencia, String nombre, String apellido, String titulo) {
        this.licencia = licencia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
    }
    public String getSumario(Licencia licencia){
        return this.getTitulo() + " " + this.getNombre() + " " + this.getApellido() + 
        ", " + Integer.toString(licencia.getPuntos()) + " puntos";
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
    
    
}
