/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Boletin9_2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
     
       int base;
       int altura;
       
        
        do{ 
        
         base=Integer.parseInt(JOptionPane.showInputDialog("introduce base"));
         altura=Integer.parseInt(JOptionPane.showInputDialog("introduce altura")); 
         
           
                
        }while(base<=0||altura<=0);  
         System.out.println("o resultado e "+(base*altura));
       
               
                    
    }
        
    }
    
