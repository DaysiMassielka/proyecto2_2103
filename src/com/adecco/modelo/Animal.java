package com.adecco.modelo;

public class Animal {
    //los elementos de una clase 1.Atribulo(n.patas int)
    public int numPatas;
    public String color;
    public String especie;
    public boolean peligroExtincion;

    //metodos
    public String comer(){
        return "El animal esta comiendo...";
    }

    public String comer(String tipoComida){
        return "El animal esta comiendo..." + tipoComida;
    }

    //metodo comer sobrecargado
    //siguiente metodo con dato de entrada devuelve string en capa modelo
    public String correr(double km){
        return "El animal esta corriendo " + km + " kilometros";
    }
    //ultimo mostrar informacion
    public String mostrarInfo(){
        return "numero de patas "+ numPatas + "color" + " especies " + especie
                + " peligro de extincion? " + peligroExtincion;
    }
    //constructor vacio
   public Animal(){
    }

    public Animal(int numPatas, String color, String especie, boolean peligroExtincion){
        this.numPatas = numPatas;
        this.color= color;
        this.especie = especie;
        this.peligroExtincion =peligroExtincion;
    }
}
