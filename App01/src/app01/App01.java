/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app01;

import java.util.Scanner;

/**
 *
 * @author Sala11
 */
public class App01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean Valor=true;
        double Numero=10.5;
        int a=10, b=15;
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        System.out.println(Valor);        
        System.out.println("El valor de numero es:"+Numero);
        System.out.println("El valor de a+b es:"+(a+b));
        System.out.println("Ingresa tu edad:");
        Numero=Teclado.nextDouble();
        System.out.println("Tu edad es de :"+Numero);
        System.out.println("a>b"+(+a>b));
        System.out.println("a<b"+(+a<b));
        boolean A1=true;
        boolean A2=false;
         System.out.println("A1 AND A2="+(A1 && A2));
       
    }
    
}

