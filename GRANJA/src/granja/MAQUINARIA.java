/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

/**
 *
 * @author Hunter
 */
public class MAQUINARIA {
    private String Name_Maquina;
    private String Tipo;
    private String Estado;
    
    //METODOS A IMPLEMENTAR

    public String getName_Maquina() {
        return Name_Maquina;
    }

    public void setName_Maquina(String Name_Maquina) {
        this.Name_Maquina = Name_Maquina;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}