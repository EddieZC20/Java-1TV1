/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package apphotel001;

import java.util.ArrayList;

/**
 *
 * @author sala11
 */
public class HabitacionResidente extends Habitacion{
    protected int DiasHospedaje;
    ArrayList <Huespedes> Inquilinos;

    public int getDiasHospedaje() {
        return DiasHospedaje;
    }

    public void setDiasHospedaje(int DiasHospedaje) {
        this.DiasHospedaje = DiasHospedaje;
    }
    
}
