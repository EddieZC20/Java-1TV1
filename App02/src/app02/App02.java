/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app02;

import java.util.Scanner;

/**
 *
 * @author Sala11
 */
public class App02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean grados=true;
        double f=32, valor=0, a=5/9;
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        System.out.println(grados);
        System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
        valor=Teclado.nextDouble();
        System.out.println("El valor en grados Fahrenheites de:"+valor);
        System.out.println("El valor de Celsius es:"+(valor-f)*(a));
        
    }
}
