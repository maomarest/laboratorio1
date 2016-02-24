/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmo_1;
import java.util.Scanner;
/**
 *El programa compara 3 numeros e indica 
 *cual es la mayor de estos 3.
 * 
 * @author Mauricio Martinez Estrada
 * @version 1
 * @since 24-02-2016
 */
public class algoritmo_1 {
    /**
     * @param args 
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int  mayor=0,a=0,b=0,c=0;
        
        System.out.print("Ingrese A: ");
        a = sc.nextInt();
        System.out.print("Ingrese B: ");
        b = sc.nextInt();
        System.out.print("Ingrese C: ");
        c = sc.nextInt();
        if(a>b){
            if(a>c){
                mayor=a;
            }else{
                mayor=c;
            }
        }else{
            if(b>c){
                mayor=b;
            }else{
                mayor=c;
            }
        }
        System.out.print("EL mayor es: " + mayor);
    }
}
