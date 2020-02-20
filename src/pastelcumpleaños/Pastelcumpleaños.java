/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastelcumpleaños;

import java.util.Scanner;

public class Pastelcumpleaños {

 
    public static void main(String[] args) {
        
        
     Scanner entrada = new  Scanner(System.in);
       
        int numerovelas =0 ;
        int numeromaximo = 0;
        int velasapagadas = 0;
        int Velas[] = new int [20];
       
        System.out.println("cuantos años cumple: ");
        numerovelas = entrada.nextInt();
       
        System.out.println(" Digite la altura de la vela: ");
       
        for(int k = 0; k < numerovelas; k++){
       
        Velas[k] = entrada.nextInt();
       
        if(Velas[k] > numeromaximo){
           
            numeromaximo = Velas[k];
           
            if(Velas[k] == numeromaximo){
               
                velasapagadas++;
            }
       
        }
         
        }
       System.out.println(" el numero mayor es : "+ numeromaximo);
        System.out.println(" se apagan : "+ velasapagadas + "velas");
       
    }
   
}
