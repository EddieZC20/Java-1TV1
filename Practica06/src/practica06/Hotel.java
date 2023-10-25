package practica06;

import java.util.ArrayList;

public class Hotel {
    protected String NombreHotel;
    private ArrayList Habitaciones;
    private ArrayList Clientes;
    private ArrayList Registros;
    private ArrayList Reservaciones;

    public String getNombreHotel() {
        return NombreHotel;
    }

    public void setNombreHotel(String NombreHotel) {
        this.NombreHotel = NombreHotel;
    }
    
}
