package practica01;

import java.util.Scanner;

public class Practica01 {
    public static void main(String[] args) {
        double fahrenh, res;
        System.out.println("Programa para transformar grados Fahrenheit a Celsius");
        System.out.println("Introduce los grados en Fahrenheit°");
        Scanner cin;
        cin=new Scanner(System.in);
        fahrenh=cin.nextDouble();
        res=(fahrenh-32)*5/9;
        System.out.println("Los grados en Celsius son "+res);
    }
}