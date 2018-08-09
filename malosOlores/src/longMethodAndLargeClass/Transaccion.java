/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longMethodAndLargeClass;

/**
 *
 * @author Andrea Naranjo Lima
 */
public class Transaccion {
    
    private boolean esDebito = false;
    private float cantidad = 0;

    public Transaccion(boolean esDebito, float cantidad) {
        this.esDebito = esDebito;
        this.cantidad = cantidad;
    }

    
}
