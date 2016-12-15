/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class NumeroAleatorio {
    
     public NumeroAleatorio(){
        
    
        int jugador1=Integer.parseInt(JOptionPane.showInputDialog("introduce numero a adivinar"));
     
        int intentos=intentos=Integer.parseInt(JOptionPane.showInputDialog("introduce los intentos que tiene el jugador 2"));;
      
       while(intentos<1|| intentos >50){
         intentos=Integer.parseInt(JOptionPane.showInputDialog("introduce los intentos que tiene el jugador 2"));
        }
        do{
            
        
        int jugador2=Integer.parseInt(JOptionPane.showInputDialog("introduce numero "));
        
        if (jugador1<jugador2){
            
            System.out.println("E menor");
        }
       
        else if (jugador1>jugador2){
            System.out.println("E maior ");
        }
        
        else if (jugador1==jugador2){
            System.out.println("E correcto");
          break;
        }
        
        intentos--;
        
        
        
        }while(intentos>=1);
            
        }
       
        
        }

