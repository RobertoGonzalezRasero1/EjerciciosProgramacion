/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Boletin9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int num;   
      int conta=0; // declaro esto para que siga haciendo el bucle
       
        do{
            num =Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
          if (num <0){
              System.out.println(num+ " E negativo");
              
          }
          else if
              (num>0){
              
              System.out.println(num+ " E positivo");
          }
          else {
              System.out.println(" O numero de ceros son "+conta);
          }   
          
          conta++;
    }while(conta<=10);
    
}
}
