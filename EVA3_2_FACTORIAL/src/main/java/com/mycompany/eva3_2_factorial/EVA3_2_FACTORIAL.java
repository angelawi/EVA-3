/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_factorial;

/**
 *
 * @author Usuario
 */
public class EVA3_2_FACTORIAL {

    public static void main(String[] args) {
        int valor = 5;
        System.out.println("Factorial de 5 = " + calcularFactorial(valor));
        //CREAR MÉTODO calcularPotencia(int base, int potencia) --> regresa entero
        System.out.println(calcularPotencia(5, 3));
    }
    
   public static int calcularFactorial(int valor){
       int acumulador = 1;
       for (int i = 1; i <= valor; i++) {
         acumulador *= i; //guaradar = guaradar * i; 
       }
       return acumulador;
   }
   
   public static int calcularPotencia(int base, int potencia){
       int res = 1;
       for (int i = 1; i <= potencia; i++) {
         res = res * base;
       }
       return res;
   
    }
}
