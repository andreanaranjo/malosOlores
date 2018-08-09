/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateCode;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Andrea Naranjo Lima
 */
public class Cuenta {
    
    private float balance = 0;
    private List transacciones = new ArrayList();
    private String ultimaTransaccionFecha;
    
    /*public void debito(float cantidad){
        balance -= cantidad;
        transacciones.add(new Transaccion(true, cantidad));
        Calendar calendar = Calendar.getInstance();
        ultimaTransaccionFecha = calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR);
        
    } 
    public void credito(float cantidad){
        balance += cantidad;
        transacciones.add(new Transaccion(true, cantidad));
        Calendar calendar = Calendar.getInstance();
        ultimaTransaccionFecha = calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR);
    } LOS METODOS CREDITO Y DEBITO SE PARECEN MUCHO, POR LO QUE SE ATRIBUYE EL MAL OLOR */
    
    public void ejecutarYActualizarTransaccion(float cantidad){
        balance += cantidad;
        transacciones.add(new Transaccion(true, cantidad));
        Calendar calendar = Calendar.getInstance();
        ultimaTransaccionFecha = calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR);
    }
    
    public void credito(float cantidad){
        this.ejecutarYActualizarTransaccion(cantidad);
    }
    
    public void debito(float cantidad){
        this.ejecutarYActualizarTransaccion(-cantidad);
    }
   
}
