/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

/**
 *
 * @author Arasa
 */
public class Boletin9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int i;
     for (i=2; i<=10; i+=2){
         
         System.out.println("+" +i);
      
     }
      for (i=1; i<=6; i++){
         System.out.println("-" +i);
         System.out.println("+" +i);
         
    }
     int primero=0;
     int segundo=1;
     int res=0;
    
    for (i=3;i<=10;i++){
    if(primero==0)
    System.out.print(primero+" "+segundo+" ");
    res=primero+segundo;
    System.out.print(res+" ");
    //Hacemos cambios de varibales para la suma de la siguiente iteracion
    primero=segundo;
    segundo=res;
}
    
    }
}
