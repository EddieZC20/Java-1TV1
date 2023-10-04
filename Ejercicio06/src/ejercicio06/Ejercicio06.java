package ejercicio06;

import java.util.Scanner;


public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Numeros[], opc;
        int Valores[]={1, 2, 3};
        
        Numeros= new int[4];
        int Tablero[][];
        
        Tablero= new int [8][];
        for (int i = 0; i < 8; i++) {
            opc=Opcion();
            Tablero[i]=new int [opc];
            
        }
        
        for (int i = 0; i < Tablero.length; i++) {
            for (int j = 0; j < Tablero[i].length; j++) {
                System.out.print(Tablero[i]+"   ");
            }
            System.out.println(" ");
        }
    }
    
    static int Opcion(){
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        return Teclado.nextInt();
        
        
    
    }
}
