/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Boletin5_1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
        short num1=Short.parseShort(JOptionPane.showInputDialog("Introduce numero"));
        short num2=Short.parseShort(JOptionPane.showInputDialog("Introduce numero"));
        
        metodos comp=new metodos();
        
        comp.compara(num1, num2);
       
    }
    
}
