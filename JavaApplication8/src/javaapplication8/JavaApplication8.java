/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author diego
 */
import java.util.Scanner;
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arreglo = {4,5,6,8};
              
       
       
       int llave = 8;
       int posicion =0;
       
        
       for(int i = 1; i<arreglo.length;i++){
           if(arreglo[i] == llave){
               llave =  arreglo.length;
               posicion = i;
               
               System.out.println("El valor de la llave =  " + posicion);
    }
       }
       int numero;
       int contador =0;
       
       Scanner ing = new Scanner(System.in);
       System.out.print("Favor Ingrese Numero :");
       numero = ing.nextInt();
       
       for (int i =1; i<(numero+1); i++){
           if (numero %i==0){
               contador ++;
           }
         
        
       }if(contador !=2){
           System.out.println("False");}
       else{
           System.out.println("True");
       
       }
       
       
       
    }
}
