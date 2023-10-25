package practica06;

public class Habitaciones {
    protected int idHabitacion;
    protected boolean Uso;
    protected int Capacidad;
    protected int Tipohabitacion;

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getidHabitacion() {
        return idHabitacion;
    }

    public void setidHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public boolean isUso() {
        return Uso;
    }

    public void setUso(boolean Uso) {
        this.Uso = Uso;
    }
    
}
