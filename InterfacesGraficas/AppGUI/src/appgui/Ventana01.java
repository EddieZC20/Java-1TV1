/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appgui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana01 extends JFrame implements ActionListener{
    JButton Boton1;
    BorderLayout Borde;
    
    void Init(){
        Boton1=new JButton("Hola Mundo");
        Borde=new BorderLayout();
        add(Boton1, BorderLayout.CENTER);
        Boton1.addActionListener(this);
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Boton1) {
            Boton1.setBackground(Color.red);
            setTitle("Está vivo!!");
        }
    }
    
}
