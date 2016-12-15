/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_5;

/**
 *
 * @author Arasa
 */
public class Productos {
    private float cant;
   public Productos(){
       cant=0;
       
   }
   public Productos(int cant){
       this.cant=cant;
   }
   public void tipo (float n1){
       if (n1<=100)
           System.out.println("bajo consumo ");
       else if (n1>100&&n1<=500)
           System.out.println("medio consumo ");
       else if (n1>500&&cant<=1000)
           System.out.println("alto consumo");
      else 
           System.out.println("primeira necesidad"); 

   }
}
