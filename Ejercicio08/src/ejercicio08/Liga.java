package ejercicio08;

import java.util.ArrayList;

public class Liga {
    String Nombre;
    private ArrayList <Equipo> Equipos;
    private ArrayList <Jugador> Jugadores;
    private ArrayList <Partido> Partidos;
    
    public void AgregarPartido(Partido P){
        Partidos.add(P);
    }
    
    public void AgregarPartido(Equipo Local, Equipo Visitante){
        Partido P;
        P=new Partido();
        P.setLocal(Local);
        P.setVisitante(Visitante);
        Partidos.add(P);
        Local.AgregarPartido(P);
        Visitante.AgregarPartido(P);
        
    }
    
    public void AgregarJugador(Jugador P){
        Jugadores.add(P);
    }
    
    public void AgregarJugador(Jugador J, Equipo E){
        AgregarJugador(J);
        E.AgregarJugador(J);
    }
    
    public void AgregarEquipo(Equipo E){
        Equipos.add(E);
    }
    
    public int ObtenerNumJugadores(){
        return Partidos.size();
    }
    
    public int ObtenerNumEquipos(){
        return Equipos.size();
    }
    
    public int ObtenerNumPartidos(){
        return Partidos.size();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
