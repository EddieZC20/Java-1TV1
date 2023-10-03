package practica02;
import java.util.Scanner;
import static java.lang.Math.*;

public class Practica02 {

    public static void main(String[] args) {
        double a, b, c, x1, x2;
        
         Scanner leer;
         leer = new Scanner(System.in);
         
         System.out.println("Ingrese una ecuacion cuadrática para determinar sus raices reales: ");
         System.out.println("Ingrese los coeficientes en este orden: coeficiente de x^2, x y c");
         
         System.out.println("Ingrese el valor de a: ");
         a = leer.nextDouble();
          
         System.out.println("Ingrese el valor de b: ");
         b = leer.nextDouble(); 
         
         System.out.println("Ingrese el valor de c: ");
         c = leer.nextDouble();
         
         x1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
         x2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
          
         
         
         System.out.println("Los resultados son \n x= " + x1 + "\n x= " + x2 );
        
    }
    
}
