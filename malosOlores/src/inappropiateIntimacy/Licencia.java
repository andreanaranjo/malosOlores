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
public class Licencia {
    
    private Motociclista motociclista;
    private int puntos = 0;

    public Licencia(Motociclista motociclista) {
        this.motociclista = motociclista;
    }

    Licencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getPuntos() {
        return puntos;
    }
    
    public void agregarPuntos(int puntos){
        this.puntos += puntos;
    }

    /*public void setMotociclista(Motociclista motociclista) {
        this.motociclista = motociclista;
    } YA NO SE NECESITA ESTA FUNCION */

    public Motociclista getMotociclista() {
        return motociclista;
    }
    
    /*public String getSumario(Licencia licencia){
        return motociclista.getTitulo() + " " + motociclista.getNombre() + " " + motociclista.getApellido() + 
        ", " + Integer.toString(licencia.getPuntos()) + " puntos";
    } SE MUEVE ESTE METODO A LA CLASE MOTOCICLISTA YA QUE ESTE METODO SE REFIERE MAS A ESE OBJETO*/
}
