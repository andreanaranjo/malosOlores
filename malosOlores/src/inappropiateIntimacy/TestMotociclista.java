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
public class TestMotociclista {
    
    /*public void sumarioLicenciaCompleto(){
        Licencia licencia = new Licencia();
        licencia.agregarPuntos(3);
        Motociclista motociclista = new Motociclista(licencia, "Jason", "Bateman", "Mr");
        "Mr Jason Bateman, 3 puntos".equals(licencia.getMotociclista().getSumario(licencia));
    }*/
    
    public void sumarioLicenciaCompleto(){
        Licencia licencia = new Licencia();
        licencia.agregarPuntos(3);
        Motociclista motociclista = new Motociclista(licencia, "Jason", "Bateman", "Mr");
        "Mr Jason Bateman, 3 puntos".equals(motociclista.getSumario(licencia));
    }
}
