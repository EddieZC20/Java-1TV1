 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app03;

import java.util.Scanner;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
/**
 *
 * @author sala11
 */
public class App03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double L1=4,L2=3;
        double a1,a2,x,y;
        Scanner Articulaciones;
        Articulaciones=new Scanner(System.in);
        System.out.println("Ingresa los angulos a1 y a2");
        a1=Articulaciones.nextDouble();
        a2=Articulaciones.nextDouble();
        x=L1*Math.cos(a1*Math.PI/180)+L2*Math.cos((a1+a2)*Math.PI/180);
        y=L1*Math.sin(a1)+L2*Math.sin(a1+a2);
        System.out.println("X="+x+" y Y="+y);
    }
}
