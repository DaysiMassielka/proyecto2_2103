package com.adecco.presentacion;
import com.adecco.modelo.Animal;
import com.adecco.modelo.Animal;
import com.adecco.modelo.Coche;

public class main {
    public static void main(String[] args) {
      Coche c3 = new Coche("Seat", 45000);
      System.out.println("Hola Mundo");

      System.out.println(c3.mostrarInfo2());

      Coche c4 = new Coche("Decia",3500, 2000, "rojo");

      variables();

      metodo_poo();
      //metodo y constructor sobrecarga
      crearObjetosAnimal();
      Animal a1 = new Animal();
      a1.numPatas = 4;
      a1.color = "negro";
      a1.especie = "mamifero";
      a1.peligroExtincion=false;
      System.out.println(a1.comer());
      System.out.println(a1.correr(2));
      System.out.println(a1.mostrarInfo());

      Animal a2 = new Animal();
      a2.numPatas =2;
      a2.color="banco";
      a1.especie="ave";
      a2.peligroExtincion=false;

      System.out.println(a2.comer());
      System.out.println(a1.comer("carne"));
      System.out.println(a2.correr(5));
      System.out.println(a2.mostrarInfo());

      Animal a3= new Animal(2,"negro", "canino", false);
      System.out.println(a3.mostrarInfo());




    }

  private static void crearObjetosAnimal() {
      //instar o crear objeto
  }

  private static void variables() {
    short vShort = 123;
    int vInt = 123_123;
    long vLong = 123_123L;
    byte vByte = 7;
    //tipos de variables con decimales
    float vFloat = 143.45f;
    double vDouble = 123_123.845;
    char vChar ='c';
    boolean vBoolean = true;

    System.out.println("valor de variable byte" +vByte);
    System.out.println("valor de variable byte" +vShort);
    System.out.println("valor de variable byte" +vInt);
    System.out.println("valor de variable byte" +vShort);

    String vString = "hola mundo";
    System.out.println(vString);

    //cambiando
    Integer vInteger = 500;
    System.out.println("tipo envvolvente de int ->" +vInteger);

    Character vCharacter = 'c';
    System.out.println("tipo envolvente de ccha -> CCaracter " + vCharacter);

    Byte vBytE = 5;
    System.out.println("tipos envolventes de byte ->" + vBytE);

  }

  private static void metodo_poo() {
        //vamos instanciar o crear objeto
      Coche c1 = new Coche(); // asi construimos la clase coche
        c1.marca = "Toyota";
        c1.color = "Gris";
        c1.precio = 60.000;
        c1.anio = 2023;

        //System.out.println("La marca del coche es ->" +c1.marca);
//        System.out.println("La COLOR del coche es ->" +c1.color);
//        System.out.println("La precio del coche es ->" +c1.precio);
//        System.out.println("La aniodel coche es ->" +c1.anio);
    System.out.println(c1.mostrarInfo2());
        Coche c2 = new Coche();
        c2.marca = "Renol";
        c2.precio = 68000;
        c2.anio = 2000;
        c2.color ="Blanco";


//        System.out.println("La marca del coche es ->" +c2.marca);
//        System.out.println("La COLOR del coche es ->" +c2.color);
//        System.out.println("La precio del coche es ->" +c2.precio);
//        System.out.println("La aniodel coche es ->" +c2.anio);


//        c1.mostrarInfo();
      System.out.println(c2.mostrarInfo2());






    }
}
