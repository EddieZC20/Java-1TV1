/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author sala11
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Programa de transformarción de divisas de dolar, peso, euro y yen");
        String Moneda, MonedaV, Divisa;
        Moneda="20000 MNX";
        MonedaV=Moneda.substring(0,Moneda.indexOf(" "));
        Divisa=Moneda.substring(Moneda.indexOf(" ")+1,Moneda.length());
        double valor;
        valor=Double.parseDouble(MonedaV);
        System.out.println("El valor es:"+valor+" "+Divisa);
        
    }
}
