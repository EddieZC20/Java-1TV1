/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import java.util.ArrayList;

/**
 *
 * @author Hunter
 */
public class GranjaInfo {
    private String Ubicacion;
    private String Dueño;
    private String Produccion;
    private double Tamaño;
    private ArrayList<CULTIVOS> cosecha;
    private ArrayList<ANIMALES> ganado;
    private ArrayList<EMPLEADOS> empleados;
    private ArrayList<MAQUINARIA> maquinas;
    
    public void AgregarEmpleado(EMPLEADOS E){
        empleados.add(E);
    }
    
    public int ObtenerNumEmpleados(){
        return empleados.size();
    }
    
    public EMPLEADOS ObtenerEmpleado(int index){
        if (index >= 0 && index < empleados.size()) {
            return empleados.get(index);
        } else {
            return null;
        }
    }
    
    public boolean DespedirEmpleado(int index){
        if (index >= 0 && index < empleados.size()) {
            empleados.remove(index);
            return true;
        } else {
            return false;
        }
    }
    
    public void DespedirEmpleado(EMPLEADOS E){
        empleados.remove(E);
    }
    
    public void AgregarMaquina(MAQUINARIA M){
        maquinas.add(M);
    }
    
    public int ObtenerNumMaquinas(){
        return maquinas.size();
    }
    
    public MAQUINARIA ObtenerMaquina(int index){
        if (index >= 0 && index < empleados.size()) {
            return maquinas.get(index);
        } else {
            return null;
        }
    }
    
    public boolean EliminarMaquina(int index){
        if (index >= 0 && index < maquinas.size()) {
            maquinas.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public void AgregarCosecha(CULTIVOS C) {
        cosecha.add(C);
    }

    public void AgregarGanado(ANIMALES A) {
        ganado.add(A);
    }

    public int ObtenerNumCosechas() {
        return cosecha.size();
    }

    public int ObtenerNumGanado() {
        return ganado.size();
    }

    public CULTIVOS ObtenerCosecha(int index) {
        if (index >= 0 && index < cosecha.size()) {
            return cosecha.get(index);
        } else {
            return null;
        }
    }

    public ANIMALES ObtenerAnimal(int index) {
        if (index >= 0 && index < ganado.size()) {
            return ganado.get(index);
        } else {
            return null;
        }
    }

    public boolean EliminarCosecha(int index) {
        if (index >= 0 && index < cosecha.size()) {
            cosecha.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public boolean EliminarCosecha(CULTIVOS C) {
        return cosecha.remove(C);
    }

    public boolean EliminarAnimal(int index) {
        if (index >= 0 && index < ganado.size()) {
            ganado.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public boolean EliminarAnimal(ANIMALES A) {
        return ganado.remove(A);
    }
    
    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public String getProduccion() {
        return Produccion;
    }

    public void setProduccion(String Produccion) {
        this.Produccion = Produccion;
    }

    public double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(double Tamaño) {
        this.Tamaño = Tamaño;
    }
    
}