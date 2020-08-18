/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algoritmo;
/**
 *
 * @author Laboratorio
 */
public class BurbujaAlgoritmo {

  private int [] arreglo;
 public static int cont=0;
  public static int cont2=0;
 
  
 
    public  int[] burbuja(int [] arreglo) {
        this.arreglo = arreglo;
        int aux;
        
    
        for (int i = 0; i < this.arreglo.length; i++) {
            cont2 ++;
            
             
            for (int j = 0; j < this.arreglo.length - 1; j++) {
                cont ++;
                
                if (this.arreglo[j] > this.arreglo[j + 1]) {
                    aux = this.arreglo[j];
                    this.arreglo[j] = this.arreglo[j + 1];
                    this.arreglo[j + 1] = aux;
                    
                    
                 

                }

            }

        }

        return this.arreglo;
       
    }
    
    
    
      public  int[] burbujaDescendente(int [] arreglo) {
        this.arreglo = arreglo;
        int aux;
        
    
        for (int i = 0; i < this.arreglo.length; i++) {
            cont2 ++;
            
             
            for (int j = 0; j < this.arreglo.length - 1; j++) {
                cont ++;
                if (this.arreglo[j] < this.arreglo[j + 1]) {
                    aux = this.arreglo[j];
                    this.arreglo[j] = this.arreglo[j + 1];
                    this.arreglo[j + 1] = aux;

                }

            }

        }

        return this.arreglo;
       
    }
    
    
      public int [] burbujaMejorada(int [] arreglo){
         this.arreglo = arreglo;
        int aux; 
        for (int i = 0; i < this.arreglo.length; i++) {
            
            
            for (int j = 0; j < this.arreglo.length - 1- i; j++) {
                cont ++;
                if (this.arreglo[j] > this.arreglo[j + 1]) {
                    aux = this.arreglo[j];
                    this.arreglo[j] = this.arreglo[j + 1];
                    this.arreglo[j + 1] = aux;
                }
            }
        }
        return this.arreglo;
}

}
