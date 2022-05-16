/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gamei
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
                int num;
                boolean continua;
                do{
                    try{
                        continua = false;
                        System.out.println("ingrese valor entero");
                        num = teclado.nextInt();
                        int cuadrado = num*num;
                        System.out.println("el cuadrado de "+ num + " es " + cuadrado);
                        
                    }catch(InputMismatchException ex){
                        System.out.println("debe registrar un numero entero");
                        teclado.next();
                        continua = true;
                    }
                }while(continua);
    }

}
