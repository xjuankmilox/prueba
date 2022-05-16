/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1.poo;

/**
 *
 * @author gamei
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Celular celular1 = new Celular ("Iphone","Dorado"); 
        celular1.llamar();

        Celular celular2 = new Celular ("Xiaomi","Negro");
        celular2.llamar();

        Celular detalleCelular = new Celular();
        detalleCelular.detalleCelular(celular1);
    }    
}
