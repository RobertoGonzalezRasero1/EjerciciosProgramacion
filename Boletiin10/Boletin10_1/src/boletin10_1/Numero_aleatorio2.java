/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Numero_aleatorio2 {
         public Numero_aleatorio2(){
         int i=0;
      
      int aleatorio=(int)(Math.random()*50+1);
        
      int adivina;

      while((aleatorio>=1) || (aleatorio<=50)){
        adivina=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
         int resta=Math.abs(aleatorio-adivina);
        
         if (resta>20){
         System.out.println("Moi lonxe");
     
         }
         else if (resta>=10){
                 System.out.println("lonxe");
                
                 } 
         else if (resta>5){
             
             System.out.println("Preto");
            
         }
             
             else if (resta!=0){
                 System.out.println("moi preto");
                     
                     
                     }
         
             else if (resta==0){
                 System.out.println("E correcto");
              
             }
             i++;
             
     }
     
     
     }
            
       
        
        }
