/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unl.cc.poo.practica;

import java.util.Scanner;

/**
 *
 * @autores:
 * Emilio Galvez
 * Ivett Zaragocin
 * Jessica Rivas
 * Ethan Soto
 */
public class Vista {

    /**
     * Creamos un objeto de la clase Scanner para leer los datos que ingresa el
     * usuario
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Se instancia un objeto de la clase Utils para usar sus metodos y
         * atributos
         */
        CalcularNumeroPositivo utils = new CalcularNumeroPositivo();
        /**
         * Se crea una variable de tipo entero. El valor de esta variable se
         * guardara en la variable a de la clase Utils con el metodo setA()
         */
        System.out.println("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();
        utils.setA(numero1);
        /**
         * Se crea una variable de tipo entero. El valor de esta variable se
         * guardara en la variable a de la clase Utils con el metodo setA()
         */
        System.out.println("Ingrese el segundo numero: 25"
                + "");
        int numero2 = sc.nextInt();
        utils.setB(numero2);
        /**
         * Se llama al metodo calcular para mostar el resultado.
         */
        utils.calcular();
    }
}
