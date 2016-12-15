/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;

/**
 *
 * @author Arasa
 */
public class Signo {
    private int num1;


public Signo(){
   
     
    }
 public void signo(int n1){
    
 if (n1>0){
     
     System.out.println("+");
 }   
 else if (n1<0){
     
     System.out.println("-");
    
     
 }
 else{
     System.out.println("0");
 }

}
}
