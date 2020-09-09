/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author mfigueroa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       final AutomaticWeapon weapon = new AutomaticWeapon(30);
       final Operator operator = new Operator();
       operator.operate(weapon);
    }
    
}
