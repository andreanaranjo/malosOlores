/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comments;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Andrea Naranjo Lima
 */
public class Cuenta {
    
    private int MAX_DEBITO = 1000;
    private float balance = 0;
    private List transacciones = new ArrayList();
    private String ultimaTransaccionFecha;
    
    /*public void debito(float cantidad){
        //Validar si la cantidad a debitar no excede el limite
        if(cantidad > 1000){
            throw new IllegalArgumentException("Cantidad máxima excedida");
        }
        //reducir la cantidad del balance de la cuenta
        balance -= cantidad;
        
        //registramos la transacción
        transacciones.add(new Transaccion(true, cantidad));
        
        //actualizamos la fecha del último débito
        Calendar calendar = Calendar.getInstance();
        ultimaTransaccionFecha = calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR);
        
    } Mal olor: muchos comentarios en el código explicando que hace cada parte*/
    
    public void debito(float cantidad){
        this.chequearCantidadNoExcedaLimite(cantidad);
       
        this.deducirValordeBalance(cantidad);
        
        this.registrarTransaccion(cantidad, true);
        
        this.actualizarUltimaFechaDebito();
    }
    
    public void actualizarUltimaFechaDebito(){
        Calendar calendar = Calendar.getInstance();
        ultimaTransaccionFecha = calendar.get(Calendar.DATE) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.YEAR);
    }
    
    public void deducirValordeBalance(float cantidad){
        balance -= cantidad;
    }
    
    public void registrarTransaccion(float cantidad, boolean esDebito){
        transacciones.add(new Transaccion(esDebito, cantidad));
    }
    
    public void chequearCantidadNoExcedaLimite(float cantidad){
        if(cantidad > MAX_DEBITO){
            throw new IllegalArgumentException("Cantidad máxima excedida");
        }
    }
}
