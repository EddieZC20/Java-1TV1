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
public class EMPLEADOS {
    private String Name_Empleado;
    private String Cargo;
    private float Salario;
    private int Experiencia;

    public String getName_Empleado() {
        return Name_Empleado;
    }

    public void setName_Empleado(String Name_Empleado) {
        this.Name_Empleado = Name_Empleado;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }
    
    
}