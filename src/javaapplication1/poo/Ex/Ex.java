 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1.poo.Ex;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gamei
 */
public class Ex {
    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        boolean id;
        do{
            try{
                id = false;
                System.out.println("Ingrese el número");
                n = sc.nextInt();
                
                if(n>=0){
                    System.out.println("Tu número es " + n);
                }else{
                    throw new Exception();
                }
            }catch (Exception ex){
                id = true;
                System.out.println("No se registro un número positivo mayor a 0"+ "\n Introduzca el nuevo número"); 
            }
        }while (id);
    }
    
}
