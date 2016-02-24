/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmo_4;
import java.util.Scanner;
/**
 *Este es un juego donde se intenta adivinar un numero.
 *El juego indica si el numero debe ser mayor o menor.
 *Solo se dan 7 intentos.
 * 
 * @author Mauricio Martinez Estrada
 * @version 1
 * @since 24-02-2016
 */
public class algoritmo_4 {
    /**
     * @param args funcion main, llama al juego y pregunta si volver a jugar
     */    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String playAgain="y";
        while("y".equals(playAgain)){
            algoritmo_4();
            System.out.println("Would you like to play another game(y/n)");
            playAgain=sc.next();
        }
        
    }
    
    static void algoritmo_4(){
        Scanner sc = new Scanner(System.in);
        int answer=(int) Math.floor((Math.random()*100)+1);
        int guess=0;
        int numGuesses=1;
        
        while(numGuesses<=7 && (guess!=answer)){
            
        
        System.out.print("Guess a number ");
        guess = sc.nextInt();
        if(guess<answer){
            System.out.println("Higher... ");
            
        }else{
            if(guess>answer){
                System.out.println("Lower... ");
            }else{
                System.out.println("You win ");
            }
        }
        numGuesses++;
        }
        if(numGuesses>7){
                System.out.println("You loser");
                return;
            }
    }
}
