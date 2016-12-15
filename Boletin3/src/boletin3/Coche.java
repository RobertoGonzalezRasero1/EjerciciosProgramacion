/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3;

/**
 *
 * @author Arasa
 */
public class Coche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Consumo consume=new Consumo();
        
        consume.setLitros(50);
        consume.setPgas(1.57f);
         
       //hago otro objeto
       Consumo consumo3=new Consumo();
        consumo3.setLitros(40);
        consumo3.setPgas(1.57f);
       // consumo3.setVmed(80);
        consumo3.setkm(200);
       consumo3.setConsumomedio();
        // tambien Consumo consumo3=new Consumo(50,23,22,22f);    
  
     Consumo velocidadMedia=new Consumo();
     velocidadMedia.setVmed();
     
     
    }
    
}
