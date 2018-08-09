/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchStatements;

/**
 *
 * @author Andrea Naranjo Lima
 */
public class CrappySwitch {
    
    public String doSomething(int foo){
        switch(foo){
            case 0: return "foo";
            case 1: return "bar";
            case 2: return "baz";
        }
        
        return null;
    }
}
