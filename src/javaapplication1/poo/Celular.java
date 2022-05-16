/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.poo;

/**
 *
 * @author gamei
 */
public class Celular {

    private String nombre, color;

    public Celular(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Celular() {
    }

    public void llamar() {
        System.out.println("Llamando de " + nombre + " Color: " + color);
    }

    public void detalleCelular(Celular celular) {
        System.out.println("------------------------------------------------------");
        System.out.println("Nombre: " + celular.nombre + "\nColor: " + celular.color);
        System.out.println("------------------------------------------------------");
    }
}
