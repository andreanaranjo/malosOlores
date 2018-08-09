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
public class Direccion {
    
    private String ciudad;
    private String codigoPostal;
    private String pais;

    public Direccion(String ciudad, String codigoPostal, String pais) {
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String getSumarioDireccion(){
        return this.getCiudad() + ", " + this.getCodigoPostal() + ", " + this.getPais();
    }
}
