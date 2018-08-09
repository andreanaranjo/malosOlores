/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shotgunSurgery;

/**
 *
 * @author Andrea Naranjo Lima
 */
public class ShotgunSurgery {
    
           public static void main(String[] args) throws Exception {

              Account acc = new Account("Personal","AC1234",1000);

              acc.debit(500);

              acc.sendWarningMessage();

              //acc.debit(500);

       }
}
