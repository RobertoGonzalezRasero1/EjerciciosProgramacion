/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Superficie {
    
    
   
    public Superficie(){
        
         
        
    }
  
    public void s1(int calcula){
        
        switch (calcula){
         
             
            case 1: 
             float  lado=Float.parseFloat(JOptionPane.showInputDialog("introduce lado"));
               
         float cadrado=lado*lado;
                System.out.println("El area del cuadrado es = "+cadrado);
         break;
            
           case 2:  
               float  base=Float.parseFloat(JOptionPane.showInputDialog("introduce base"));
               float  altura=Float.parseFloat(JOptionPane.showInputDialog("introduce altura"));
            
        float  triangulo=base*altura/2;
            System.out.println("El area del triangulo es = "+triangulo);
         break;
        
           case 3 : 
               float  circulo=Float.parseFloat(JOptionPane.showInputDialog("introduce radio"));
         float radio= (float) (2*3.14*circulo);
            System.out.println("El area del cuadrado es = "+ radio);
        break;
        
           default:
               System.out.println("opcion incorrecta ");
        
        }
        
        
  
        
        
        
    }
    
    
    
}
