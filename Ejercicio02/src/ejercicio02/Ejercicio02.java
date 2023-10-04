/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import javax.rmi.CORBA.Util;

import java.util.Scanner;
public class Ejercicio02 {

    public static void main(String[] args) {
        String Nombre;
        String Nombre1;
        String Nombre2;
        
        Nombre=("Israel Vazques");
        Nombre1=new String("Israel Vazques");
        Nombre2=("Israel Vazques");
        
        if (Nombre==Nombre1) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("Son diferentes");
        }
        
        
        if (Nombre==Nombre2) {
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Son diferentes");
        }
        
        
        if (Nombre.equals(Nombre1)) {
            System.out.println("Son iguales");   
        }
        else {
            System.out.println("Son difentes");
        }
        
        System.out.println(Nombre+" tiene una longitud de:"+Nombre.length());
        System.out.println("La letra en el indice 4 es:"+Nombre.charAt(4));
        System.out.println("La letra L está localizada en el indice: "+Nombre.indexOf("l"));
        System.out.println("La x es:"+Nombre.indexOf("x"));
        System.out.println("La a es:"+Nombre.indexOf("a"));
        System.out.println("La sig a es:"+Nombre.indexOf("a", 4));
        
        int i=0, c=0;
        do {
            if ((i=Nombre.indexOf("a", i))!=-1){
                c++;
                i++;
            }
            
        } while (i!=-1);
        System.out.println("La palabra tiene "+c);
        
        String Ciudad, Pais, Dummy;
        int edad;
        //Scanner Teclado;
        //Teclado=new Scanner(System.in);
        
        System.out.println("Ingresa tu edad");
        //edad=Teclado.nextInt();
        //Dummy=Teclado.nextLine();
        edad=Valor();
        System.out.println("Ingresa tu pais");
        //Pais=Teclado.nextLine();
        Pais=info();
        System.out.println("Ingresa tu ciudad");
        //Ciudad=Teclado.nextLine();
        Ciudad=info();
        
        StringBuffer Nom;
        Nom=new StringBuffer("Hola mundo");
        System.out.println("La cadena de texto de Nom es:"+Nom);
        Nom.setCharAt(3, 'o');
        System.out.println("La cadena queda como:"+Nom);
        
        }
    
    static String info(){
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        return Teclado.nextLine();
    }
    
    static int Valor(){
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        return Teclado.nextInt();
    }
    }
