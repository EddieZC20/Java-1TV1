package ejercicio08;

import java.util.ArrayList;

public class Equipo {
    private String Nombre;
    private String Tecnico;
    private String Dueño;
    private int PosicionTabla;
    private ArrayList <Jugador> Jugadores;
    private ArrayList <Partido> Partidos;
    
    public void AgregarPartido(Partido P){
        Partidos.add(P);
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPosicionTabla() {
        return PosicionTabla;
    }

    public void setPosicionTabla(int PosicionTabla) {
        this.PosicionTabla = PosicionTabla;
    }

    public String getTecnico() {
        return Tecnico;
    }

    public void setTecnico(String Tecnico) {
        this.Tecnico = Tecnico;
    }
    
    
    
}
