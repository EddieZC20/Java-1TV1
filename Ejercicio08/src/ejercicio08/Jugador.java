package ejercicio08;

public class Jugador {
    protected String Nombre;
    protected int Numero;
    protected int Posicion;
    
    public String AsignarNombre(String name){
        Nombre=name;
        return Nombre;
    }
    
    public int AsignarNumero(int number){
        Numero=number;
        return Numero;
    }
    
    public int AsignarPosicion(int Pos){
        Posicion=Pos;
        return Posicion;
    }
    
}
