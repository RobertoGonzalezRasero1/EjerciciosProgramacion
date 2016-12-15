/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Boletin5_5 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
      
           Productos producto1=new Productos();
        
    int cant=Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidade de vendas"));
        producto1.tipo(cant);
    }
    
}