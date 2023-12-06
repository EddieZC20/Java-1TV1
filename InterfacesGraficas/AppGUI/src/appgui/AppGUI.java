/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appgui;

/**
 *
 * @author sala11
 */
public class AppGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana01 V;
        V= new Ventana01();
        V.Init();
        
        Ventana02 V2;
        V2= new Ventana02();
        V2.setVisible(true);
    }
}
