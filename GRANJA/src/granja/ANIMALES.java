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
public class ANIMALES {
    private String Name_animal;
    private String Raza;
    private int edad;
    private String genero;
    private double Peso;
    private double salud;
    
    //Metodos a implementar
    public void alimentar(String comida){
        System.out.println(Name_animal+" esta siendo alimentado "+comida);
    }
    public void cuidar(){
        System.out.println(Name_animal+" esta recibientodo cuidados generales");
    }
    public void informacion(){
        System.out.println("Informacion de "+Name_animal+": ");
        System.out.println("Raza: "+ Raza);
        System.out.println("Edad: "+ edad);
        System.out.println("Genero: "+genero);
        System.out.println("Peso: "+Peso);
        System.out.println("Salud: "+salud);
    }

    public String getName_animal() {
        return Name_animal;
    }

    public void setName_animal(String Name_animal) {
        this.Name_animal = Name_animal;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }
    
}