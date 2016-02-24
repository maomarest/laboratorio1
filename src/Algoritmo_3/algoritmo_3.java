/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmo_3;
import java.util.Scanner;
/**
 *Hace el uso de funciones para imprimir diferentes mensajes.
 * 
 * @author Mauricio Martinez Estrada
 * @version 1
 * @since 24-02-2016
 */
public class algoritmo_3 {
    
    static void funcion1(){        
       System.out.println("Segunda funcion ");
    }
    static void funcion2(){        
       System.out.println("Tercera funcion ");
    }
    /**
     * @param args 
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Primera funcion en Main ");
        int i;
        funcion1();
        funcion2();
        System.out.println("Se termina el main ");        
    }   
}
