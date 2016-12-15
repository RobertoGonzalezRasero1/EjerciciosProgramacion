/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

/**
 *
 * @author Arasa
 */
public class Peso {
    private float juan;
    private float pepe;




public Peso(){
   //jose=60.403f;//meto el valor fijo 
    
}

public void diferencia(float jose, float pepe){
    if (jose>pepe){
        
        
        System.out.println("Jose pesa " + (jose-pepe)+" kg mas que pepe");
    }
    else if (pepe>jose){
        System.out.println("Pepe pesa "+(pepe-jose)+" kg mas que jose");
    }
    else{
        System.out.println("No pueden pesar lo mismo compruebalo");
    
}

}
}
