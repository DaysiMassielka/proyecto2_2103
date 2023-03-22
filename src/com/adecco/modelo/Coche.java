package com.adecco.modelo;

public class Coche {
    //modo de acceso/atributos
    public String marca;  //atributo
   public double precio;
   public int anio;
   public String color;
   //nos vamos a la capa modelo main

//    public void mostrarInfo(){ //cuando no y va el void devuelve informacion
//        System.out.println("marca :" +marca);
//        System.out.println("marca :" +precio);
//        System.out.println("marca :" +color);
//
//
//    }

    //devuelve string
    public String mostrarInfo2(){
        return "marca" + "precio" + "color" + anio ;
    }


//un constructor se llama igual que la clase
    //constructor vacio, antes el compilar lo construia
    //sobre carga cuando hay vacio, con dos, con tres parametros
    public Coche(){

    }
    //le pasamos parametros de entrada
    public Coche(String pMmarca, double preccio){
        marca = pMmarca;
        this.precio=preccio;
    }

    public Coche(String marca, double precio, int anio, String color){
        this.marca = marca;
        this.precio =precio;
        this.anio = anio;
        this.color = color;
    }

}
