/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1par.raiz;

import java.util.Scanner;

/**
 *
 * @author gamei
 */
public class raiz {

    public static int Raiz(int a){
    
        //Scanner sc = new Scanner(System.in);
        double x = 1.0;
        System.out.println("Ingrese el valor de a: ");
        //int a = sc.nextInt();
        int k;
        for(k = 1; k < 10; k++){
            x = (x + a/x) / 2;
            
        }
        System.out.println("La raiz de " + a + " después de " + (k - 1) + " iteraciones es de " + x);
        return a;
    }
    public static int Raizq(int n) {

if ((n + 1) * (n + 1) <= 25) {
//lower = lower + 1;
Raizq(n+1);
}else{
    System.out.println("La raiz recursiva es de "+n);
}

return n;
}
    public static void main(String[] args) {     
        //Raiz(9);
        Raizq(0);
        /*
        int num=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número");
        num = sc.nextInt();
        if(num>0){
            double raiz = Math.sqrt(num);
            System.out.println("la raiz cuadrada de su numero es "+ raiz);
        }else{
             System.out.println("error número indefinido");
        }*/
        
    }
    
}
