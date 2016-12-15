/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Conta {
   private String cliente;
   private double saldo;
   private String nº_conta;
   
   
   
  public Conta(){
     
     
      
  }
   
  public Conta (String cliente, double saldo, String nº_conta){
      
     cliente="Juan"; 
     saldo=2000;
     nº_conta="ES774736437637";  
       
   }
  public void setCliente(String cliente1){
    
      this.cliente=cliente1;
  }

      public void setSaldo(double saldo1){
         
          this.saldo=saldo1;
          
      }
   
       public void setConta(String conta){
          
           this.nº_conta=conta;
           
       }
    
    public String getCliente(){
        
        return cliente;
    }   
       public double getSaldo(){
           
           return saldo;
       }
       public String getConta(){
           
           return nº_conta;
       }
       
       public void ingreso(double ing){
           
           ing=saldo+ing;
           if (ing<=0){
           
           System.out.println("false");
       }
           else{
               System.out.println("true");
           }
       } 
           public void reingreso(double reing){
               
               
             reing=saldo-reing;  
              
             if (saldo<=0){
                   
                   System.out.println("false");
               }
               else{
                   System.out.println("true");
               }
           }
               public void amosar(){
                   
                   System.out.println("O cliente "+cliente+" ten un saldo de "+saldo+" na conta "+nº_conta );
                   
                   
               }
          
public void transferencia(String destino,int cant){
   if (saldo<=0){
       System.out.println("No hay saldo suficiente para realizar la transferencia ");
   }
   else{
    destino = (JOptionPane.showInputDialog("Introduce cuenta de destino"));
   cant =  Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad a transferir"));
    System.out.println("Enhorabuena ha transferido una cantidad de "+cant+" en la cuenta "+ destino);
    
    
}


}
}


