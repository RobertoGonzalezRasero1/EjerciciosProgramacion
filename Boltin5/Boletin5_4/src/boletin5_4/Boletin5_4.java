/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Boletin5_4 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
      int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
      int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
      int n3=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        Mayor compara=new Mayor();
        compara.indicaMaior(n1,n2,n3);
    }
    
}
