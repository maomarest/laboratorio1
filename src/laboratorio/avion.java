/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;
import java.util.Scanner;

/**
 *
 * @author Mauricio Martinez Estrada
 */
public class avion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long cedula[] = new long[50];
        long cedula2 ;
        String nombre[] = new String[50];
        int clase[] = new int[50];
        int ubicacion[] = new int[50];
        int num_silla[] = new int[50]; 
        
        int num_silla_ec = 42;
        int num_silla_ej = 8;
        int num_silla_ec_v = 14;
        int num_silla_ec_c = 14;
        int num_silla_ec_p = 14;
        int num_silla_ej_v = 4;
        int num_silla_ej_p = 4;
        
        int j=0,k=0,l=0,m=0,n=0,o=0,p=0;
        int silla[] = new int[50];
        
        for(int i = 0; i < 50; i++){
            System.out.print("[" + (i+1) + "] Digite su cedula: ");
            cedula[i] = sc.nextLong();
            
            System.out.print("Digite su nombre: ");
            nombre[i] = sc.next();
           
            System.out.println("Sillas disponibles en clase económica: " + (num_silla_ec-o));
            System.out.println("Sillas disponibles en clase ejecutiva: " + (num_silla_ej-p));
            System.out.print("Digite (1) si desea viajar en clase economica o (2) en ejecutiva: ");
            clase[i] = sc.nextInt();
            
            if(clase[i] == 1){
                o++;
                System.out.println("Sillas disponibles en ventana: " + (num_silla_ec_v-j));
                System.out.println("Sillas disponibles en centro: " + (num_silla_ec_c-k));
                System.out.println("Sillas disponibles en pasillo: " + (num_silla_ec_p-l));
                System.out.print("Digite (1), (2) o (3); si desea viajar en la ventana, centro o pasillo respectivamente: ");
                ubicacion[i] = sc.nextInt();
                if(ubicacion[i]==1 && j<14){
                    silla[i]=j;
                    j++;
                }
                if(ubicacion[i]==2 && k<14){
                    silla[i]=k;
                    k++;
                }
                if(ubicacion[i]==3 && l<14){
                    silla[i]=l;
                    l++;
                }

            } else {
                p++;
                System.out.println("Sillas disponibles en ventana: " + (num_silla_ej_v-m));
                System.out.println("Sillas disponibles en pasillo: " + (num_silla_ej_p-n));
                System.out.print("Digite (1) o (3); si desea viajar en la ventana o pasillo respectivamente: ");
                ubicacion[i] = sc.nextInt();
                if(ubicacion[i]==1 && m<4){
                    silla[i]=j;
                    m++;
                }
                if(ubicacion[i]==3 && m<4){
                    silla[i]=j;
                    n++;
                }
            }                      
        }
        System.out.println("Digite cedula para conocer informacion: ");
        cedula2 = sc.nextLong();
        for(int i=0;i<50;i++){
            if(cedula2==cedula[i]){
                System.out.println("El pasajero es: " + nombre[i]);
                System.out.println("Numero de cedula: " + cedula[i]);
                if(clase[i]==1){
                    System.out.println("Sentado en clase economica ");
                    if(ubicacion[i]==1)
                        System.out.println("Sentado en el ventana " + (j));
                    if(ubicacion[i]==2)
                        System.out.println("Sentado en el centro " + (k));
                    if(ubicacion[i]==3)
                        System.out.println("Sentado en el pasillo numero " + (l));
                }
                
                if(clase[i]==2){
                    System.out.println("Sentado en clase ejecutiva ");
                    if(ubicacion[i]==1)
                        System.out.println("Sentado en la ventana " + (m));
                    if(ubicacion[i]==3)
                        System.out.println("Sentado en el pasillo " + (n));
                }
                
            }
            
        }
        sc.next();
    }
    
}