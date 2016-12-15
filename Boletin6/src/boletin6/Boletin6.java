/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

/**
 *
 * @author Arasa
 */
public class Boletin6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Conta bbva=new Conta();
     
     bbva.setCliente("Juan");
     bbva.setConta("ES98473638346734");
     bbva.setSaldo(500);
     bbva.ingreso(600);
     bbva.reingreso(200);
     bbva.amosar();
     bbva.transferencia("ES24354554354", 0);
        
        
    }
    
    
    
    
}