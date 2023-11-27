/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_pasos_parametros;

/**
 *
 * @author invitado
 */
public class EVA3_6_PASOS_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5;
        System.out.println("el valor x en el main () es de " + x);
        pasoporvalor(x);
    }
    // en paso por valor de argumentos se envia una copia al metodo
    public static void pasoporvalor(int valor){
        System.out.println("el valor que recibio en el metodo es de " + valor);
        valor++;
        System.out.println("el valor modificado en el metodo es de " + valor);
    }
    
}
