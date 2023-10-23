package ejercicio08;

public class Partido {
    int GolesLocal;
    int GolesVisitante;
    boolean jugado;
    Equipo Local;
    Equipo Visitante;

    public int getGolesLocal() {
        return GolesLocal;
    }

    public void setGolesLocal(int GolesLocal) {
        this.GolesLocal = GolesLocal;
    }

    public int getGolesVisitante() {
        return GolesVisitante;
    }

    public void setGolesVisitante(int GolesVisitante) {
        this.GolesVisitante = GolesVisitante;
    }

    public Equipo getLocal() {
        return Local;
    }

    public void setLocal(Equipo Local) {
        this.Local = Local;
    }

    public Equipo getVisitante() {
        return Visitante;
    }

    public void setVisitante(Equipo Visitante) {
        this.Visitante = Visitante;
    }

    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }
    
    
}
