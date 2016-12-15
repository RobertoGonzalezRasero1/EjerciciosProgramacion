/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

/**
 *
 * @author Arasa
 */
public class Boletin9_5 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       
      int cuenta=0;
      float sueldo;
      int senior=0;
      int junior=0;
  
      do{  
         
           sueldo=Float.parseFloat(JOptionPane.showInputDialog("Introduce sueldo"));
       
               
           if (sueldo>=1000&&sueldo<=1750){
               senior++;
               
           }
           else if (sueldo<1000){
             junior++; 
           }
          
      
           cuenta++;
         
       }while(sueldo !=0);
        
        System.out.println("Hay "+(senior)+" personas con un sueldo de entre 1000 y 1750 €");   
        
        System.out.println("El  "+(junior*100/cuenta-10)+" % "+" de los trabajadores cobra menos de 1000 €");
    }

      }
