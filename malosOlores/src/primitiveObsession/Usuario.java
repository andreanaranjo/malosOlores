/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveObsession;

/**
 *
 * @author Andrea Naranjo Lima
 */
public class Usuario {
    
    
    private char const_Single = 's';
    private char const_inRelationship = 'r';
    //String relacion;
    Relacion relacion;
    
    /*public void setRelacion(String relacion){
        this.relacion = relacion;
    }
    
    public String getRelacion(){
        return this.relacion;
    }*/

    public Relacion getRelacion() {
        return relacion;
    }

    public void setRelacion(Relacion relacion) {
        this.relacion = relacion;
    }
    
    
}
