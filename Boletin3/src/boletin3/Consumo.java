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
 
public class Consumo {
    
    private  int km;
    
    private int litros;
    
    private int vmed;
    
    private float pgas;


public Consumo(){
    
    km=0;
    litros=0;
    vmed=80;
    pgas=0;
    
}
    
    public Consumo(int k,int li,int v,float p){
        
        km=k;
        litros=li;
        vmed=v;
        pgas=p;
        
    }
    
    public int getTempo(){
        return km*vmed;
        
        
    
    }   
    
    public void setConsumomedio(){
        
    System.out.println("El consumo medio de este viaje es de "+litros*100/km +" L ");
        
     
}

public float getConsumoEuros(){
    
    return pgas*km/100;
    
}

public void setkm(int k){
    km=k;
    
}
public void setLitros(int li){
    litros=li;
    
}

public void setVmed(){
    System.out.println("La velocidad media del viaje es de "+vmed+"Km/h");
    
}
public void setPgas(float p){
    pgas=p;
}



}
