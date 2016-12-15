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
public class Boletin5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     int c= Integer.parseInt(JOptionPane.showInputDialog("Introduce opcion : \n 1:cadrado \n 2:triangulo \n 3:circulo"));
     
    Superficie s1=new Superficie();
    
    s1.s1(c);
    
   
    }
    
}
