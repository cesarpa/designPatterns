package com.patterns.creational.singleton.java;

public class Humano {

    String nombre;
    static Boolean estaVivo = true;

    public Humano(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Humano{" +
                "nombre='" + nombre + '\'' +
                ", estaVivo=" + estaVivo +
                '}';
    }


    public static void main(String[] args) {
        Humano c = new Humano("cesar");
        Humano a = new Humano("anyela");
        Humano j = new Humano("juan");

        Humano.setEstaVivo(false);

        Humano.estaVivo = true;


        System.out.println("Se destruyo la Tierra");

        System.out.println(c.toString());
        System.out.println(a.toString());
        System.out.println(j.toString());
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Boolean getEstaVivo() {
        return estaVivo;
    }

    public static void setEstaVivo(Boolean estaVivo) {
        Humano.estaVivo = estaVivo;
    }
}
