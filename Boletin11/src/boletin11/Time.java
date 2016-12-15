/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import javax.swing.JOptionPane;
/**
 *
 * @author Arasa
 */
public class Time {

    public Time() {
  // guardar timestamp inicio
  long start = System.currentTimeMillis();
        
System.out.println("ESCRIBE A SEGUINTE FRASE: \n A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática .");

String frase = "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática .";

String validaFrase = JOptionPane.showInputDialog("Introduce a frase anterior e pulsa Enter para rematar");
long end = System.currentTimeMillis();
  long res = end - start;
 if (frase.equals(validaFrase)) {
    
System.out.println("TARDACHES " +(res/1000)+ " SEGUNDOS EN ESCRIBIR A FRASE ");
 } 
 else {
     System.out.println("lo has escrito mal vuelve a intentarlo");
        }

    }

}
