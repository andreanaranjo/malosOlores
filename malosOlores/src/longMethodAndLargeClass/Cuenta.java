/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longMethodAndLargeClass;

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
        
    } En esta función se puede ver el mal olor Long Method*/
    
    public void debito(float cantidad){
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
}
