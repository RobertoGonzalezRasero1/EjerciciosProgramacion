/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int n=Integer.parseInt(JOptionPane.showInputDialog("inserta numero"));
        Positivo numero=new Positivo();
        numero.Positivo(n);
    }
    
}
