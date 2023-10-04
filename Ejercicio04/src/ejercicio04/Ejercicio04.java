
package ejercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> Contactos;
        Contactos=new ArrayList();
        int opc;
        String Nombre;
        do {
            System.out.println("Agenda");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Eliminar contacto");
            opc=Opcion();
            switch(opc){
                case 1:AgregarContacto(Contactos); break;
                case 2:ListarContacto(Contactos); break;
                case 3:EliminarContacto(Contactos); break;
            } 
            
        } while (opc>3); 
        
    }
    static void AgregarContacto(ArrayList C){
        String Nombre;
        System.out.println("Ingresa el nombre del contacto");
        Nombre=Texto();
        C.add(Nombre);
    }
    
    static void ListarContacto(ArrayList C){
        int Tam;
        int i;
        Tam=C.size();
        for (i = 0; i < Tam; i++) {
            System.out.println((i+1)+" "+C.get(i));
        }
    }
    
    static void EliminarContacto(ArrayList C){
        ListarContacto(C);
        System.out.println("Ingresa eel indice para eliminar");
        int i;
        i=Opcion();
        C.remove(i-1);
    }
    
    
    static int Opcion(){
        Scanner Teclado;
        Teclado=new Scanner (System.in);
        return Teclado.nextInt();
    }
    
    static String Texto(){
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        return Teclado.nextLine();
        
    }
    


}

