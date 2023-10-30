/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import java.util.Scanner;

/**
 *
 * @author Hunter
 */
public class GRANJA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        do{
            System.out.println("+---GESTION---+");
            System.out.println("|1.-Establos  |");
            System.out.println("|2.-Cultivos  |");
            System.out.println("|3.-Empleados |");
            System.out.println("|4.-Maquinas  |");
            System.out.println("|5.-Salir     |");
            System.out.println("+-------------+");
            op=valor();
            switch(op){
                case 1:
                    
                break;
                case 2:
                    
                break;
                case 3:
                    
                break;
                case 4:
                    
                break;
                default:
                    System.out.println("Comando Invalido...");
                break;
            }
        }while(op!=5);
    }
    static int valor() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
}
