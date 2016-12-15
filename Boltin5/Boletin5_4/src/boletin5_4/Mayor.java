/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

/**
 *
 * @author Arasa
 */
public class Mayor {
 private int num1;
 private int num2;
 private int num3;
 
  public Mayor(){
        
   // aqui si queremos le damos valores a num1 num2 num 3 ahora por defecto tienen el valor 0
        
    }
   
  public void indicaMaior(int n1,int n2,int n3){
      
      if ((n1>n2)&&(n2>n3)){
          System.out.println("O maior e "+n1);        
          
  }
      else if((n2>n1)&&(n1>n3)){
          System.out.println("O maior e "+n2);
  }
      else if((n3>n2)&&(n2>n1)){
      System.out.println("O maior e "+n3);
  }
      
  }
  
  
}
