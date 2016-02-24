/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmo_2;

/**
 *Aparecen asteriscos agrupados en grupos siguiendo la logica de los numeros
 *impares. 1-3-5-7-9. Forma piramidal.
 * 
 * @author Mauricio Martinez Estrada
 * @version 1
 * @since 24-02-2016
 */
public class algoritmo_2 {
    /**
     * @param args 
     */
    public static void main(String[] args){
        
        int cuenta_as=1;
        int contador=1;
        int blan=1;
        int num=5;
        String ast="*";
        String esp=" ";
        System.out.println("");
        
        while(contador<=num){
            blan=num-contador;
            while(blan>0){
                System.out.print(esp);
                blan=blan-1;
            }
        
        cuenta_as=1;
        while(cuenta_as<(2*contador)){
            System.out.print(ast);
            cuenta_as=cuenta_as+1;
        }
        contador=contador+1;
        System.out.println("");
        }
    }    
}
