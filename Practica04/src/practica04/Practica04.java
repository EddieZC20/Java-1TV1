package practica04;

import java.util.Scanner;

public class Practica04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Valori, Divisa, error;
        String Cantidad, Moneda;
        Double Lana;
        
        Scanner Teclado;
        Teclado=new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad que deseas transformar y su divisa al final (ej. 120 MXN)");
        System.out.println("(USD - Dolar, MXN - Peso, EUR - Euro, JPY - Yen japones, GBP - Libra Esterlina)");
        Valori=Teclado.nextLine();
        
        Cantidad=Valori.substring(0, Valori.indexOf(" "));
        Lana=Double.parseDouble(Cantidad);
        Moneda=Valori.substring(Valori.indexOf(" ")+1, Valori.length());
        // System.out.println(Lana+" "+Moneda );
        
        
        if (Moneda.equals("US")) {
            Lana=Lana;
            
        }
        
        else if (Moneda.equals("MXN")) {
            Lana=Lana/17.66;
            
        }
        
        else if (Moneda.equals("EUR")) {
            Lana=Lana/0.95;
            
        }
        
        else if (Moneda.equals("JPY")) {
            Lana=Lana/149.56;
            
        }
        
        else if (Moneda.equals("GBP")) {
            Lana=Lana/0.82;
            
        }
        
        //System.out.println("La lanita es de "+Lana );
        
        
        System.out.println("Ingresa la moneda a transformar (US, MXN, EUR, JPY, GBP)");
        Divisa=Teclado.nextLine();
        
        
        
        if (Divisa.equals("US")) {
            Lana=Lana;
            
            
        }
        
        else if (Divisa.equals("MXN")) {
            Lana=Lana*17.66;
        }
        
        else if (Divisa.equals("EUR")) {
            Lana=Lana*0.95;
        }
        
        else if (Divisa.equals("JPY")) {
            Lana=Lana*149.56;
        }
        
        else if (Divisa.equals("GBP")) {
            Lana=Lana*0.82;
        }
        
        else{
            System.out.println("No se ingresó ninguna divisa valida");
        }
        
        System.out.println(Valori+" = "+Lana+" "+Divisa);
        
        
        
    }
    
}
