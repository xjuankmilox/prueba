/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1par;

import java.util.Scanner;

/**
 *
 * @author gamei
 */
public class par {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número");
        num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("su número es par");
        }else{
            System.out.println("su numero es impar");
        }
    }
    
}
