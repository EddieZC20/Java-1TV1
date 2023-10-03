package practica03;

import java.util.Scanner;

public class Practica03 {

    
    public static void main(String[] args) {
        Scanner Tec;
        Tec=new Scanner(System.in);
        double umbral, promedio, consumo, todo=0;
        int x;
        System.out.println("Ingresa el numero de computadoras conectadas en la red");
        x=Tec.nextInt();
        
        System.out.println("Ingresa el umbral mb/s");
        umbral=Tec.nextDouble();
        
        for (int i = 1; i <= x; i++) {
            System.out.println("Ingresa el consumo de la computadora  "+i);
            consumo=Tec.nextDouble();
            todo = todo + consumo;
        }
        promedio=todo/x;
        
        
        System.out.println("El promedio de consumo de banda por computadora es de "+promedio+" mb/s");
        
        if (promedio>umbral) {
            System.out.println("El ancho de banda no es suficiente");
            
        }
        
        else 
        {
            System.out.println("Si es suficiente");
            
        }
       
        
    }
    
}
