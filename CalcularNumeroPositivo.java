/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unl.cc.poo.practica;

/**
 *
 * @autores:
 * Emilio Galvez
 * Ivett Zaragocin
 * Jessica Rivas
 * Eithan Soto
 */
public class CalcularNumeroPositivo {
    /**
     * declaramos las variables
     */
    int a ;
    int b ;
    int respuesta ;

    public CalcularNumeroPositivo() {
        /**
         * Se usa el constructor por defecto e inicializamos las variables
         */
        this.a = 0;
        this.b = 0;
        this.respuesta = 0;            
    }
    /**
     * Se cambio el metodo a public void, esto debido a que si el usuario
     * ingresa valores invalidos, no se devolvera nada.
     */
    public void calcular() {
        if (a > 0 && b > 0) {
            respuesta = a + b;
            /**
             * Imprimiremos el valor de la respuesta
             */
            System.out.println("La respuesta es igual a: "+respuesta);
        }else {
            /**
             * Si no se cumple la condición lanzara una exepción y mostrara un 
             * mensaje
             */
            throw new IllegalArgumentException("Ingrese valores mayores a 0");
            
    }
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }    
}
