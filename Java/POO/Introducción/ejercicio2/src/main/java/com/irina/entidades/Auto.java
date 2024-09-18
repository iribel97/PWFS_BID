package com.irina.entidades;

public class Auto {

    private String model, brand;
    private int year;

    //Contrusctor vacio
    public Auto() {
        this.model = "Sin modelo";
        this.brand = "Sin marca";
        this.year = 0;
    }

    //Constructor que inicialice marca, modelo y año
    public Auto(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    //Constructor que inicialice marca y modelo
    public Auto(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    //Constructor que inicialice solamente la marca
    public Auto(String brand) {
        this.brand = brand;
    }

 
    public void imprimirDatos() {
        System.out.println("Marca: " + brand + ", Modelo: " + model + ", Año: " + year);
    }

    //Getters y Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
