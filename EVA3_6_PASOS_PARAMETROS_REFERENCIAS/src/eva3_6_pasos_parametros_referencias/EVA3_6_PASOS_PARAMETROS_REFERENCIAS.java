/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_pasos_parametros_referencias;

/**
 *
 * @author invitado
 */
public class EVA3_6_PASOS_PARAMETROS_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int [10];
        System.out.println("la direccion del arreglo es " + arreglo);
        llenararreglo (arreglo);
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("[" + arreglo [i] + "]");
            
        }
    }
    public static void llenararreglo (int [] valores){
        System.out.println("la direcciion de valores es " + valores);
        for (int i = 0; i < valores.length; i++){
            valores[i] = (int)(Math.random() * 100);
            
        }
    }
    
}
