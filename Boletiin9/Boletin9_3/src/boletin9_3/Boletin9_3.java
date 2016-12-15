/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Boletin9_3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
   
        int numero =Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
      int  i=0;
    
      while(numero!=0){
      
      do {
          System.out.println(numero+"x" +i+ "=" + (numero*i));
          
          
          i++;
      }while (i<=10);
          break;
          
      }
          
        
        
        
    }
    
}
