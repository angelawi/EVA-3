/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_metodo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_1_METODO {

    public static void main(String[] args) {
         imprimirMensaje("Hola mundo!!!", 5);
       
        Scanner input = new Scanner(System.in);
    }
    public static void imprimirMensaje(String mensaje, int cant){
        for (int i = 0; i < cant; i++) 
              System.out.println(mensaje);
    }
}
