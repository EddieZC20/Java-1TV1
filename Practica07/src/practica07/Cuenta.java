package practica07;

public class Cuenta {
    protected int numcuenta;
    protected double saldo;
    
    public boolean AsignarNumCuenta(int d){
        if (d>0) {
            numcuenta=d;
            return true;
            
        }
        return false;
    }
    
    public boolean AbonarDinero(double d){
            if (d>0) {
                saldo=saldo+d;
                return true;
            }
            return false;
    }
    
    public boolean RetirarDinero(double d){
        if (saldo>=d) {
            saldo=saldo-d;
            return true;
        }
        return false;
    }
    
    public double ObtenerSaldo(){
        return saldo;
    }
    
    public int ObtenerNumCuenta(){
        return numcuenta;
    }
}
