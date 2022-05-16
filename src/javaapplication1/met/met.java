/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1.met;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gamei
 */
public class met {

    public static void ex() {
        boolean id;
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        for (int i = 0; i < arr.length; i++) {
            do {
                try {
                    id =false;
                    System.out.println("Ingrese el número");
                    arr[i] = sc.nextInt();
                } catch (Exception ex) {
                    id = true;
                    System.out.println("No es un número valido vuelve a introducir los datos");
                    sc.next();
                }
            } while (id);
        }
        /*
        do{
            try{
                id=false;
                
                
                int arr[] = new int[7];
                for(int i=0;i<arr.length;i++){
                    System.out.println("Ingrese el número");
                    arr[i] = sc.nextInt();
                    
                }
            }catch(Exception ex){
                id = true;
                System.out.println("No es un número valido vuelve a introducir los datos");
                sc.next();
            }
        }while (id);*/
    }
    public static void main(String[] args) {
        ex();
    }

}
