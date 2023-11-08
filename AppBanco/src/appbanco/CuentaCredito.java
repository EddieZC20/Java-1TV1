/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appbanco;

/**
 *
 * @author sala11
 */
public class CuentaCredito extends Cuenta{
    double LimiteCredito;
    
    public boolean RetirarDinero(double Retiro){
        if ((-saldo+Retiro<=LimiteCredito)) {
            saldo=saldo-Retiro;
            return true;
            
        }
        return false;
    }
    
    public void setLimite(double L){
        LimiteCredito=L; 
    }
}
