/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Boletin5_2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
  int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        
        Signo sig=new Signo();
         //  sig.signo(4); o le metemos aqui el valor
        sig.signo(num);
    }
    
}
