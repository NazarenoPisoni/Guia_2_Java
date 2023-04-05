package models;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;


    public Libro(String titulo, double precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarLibro(){
        System.out.println("[ Título del Libro: " + getTitulo() + " , Autor: " + autor.getNombre() + " " + autor.getApellido()
                + " , Precio: $" + getPrecio() + " , Stock: " + getStock() + " ]");
    }

    public void incrementarStock(int cantidad){
        stock += cantidad;
    }

    public void mostrarAutor(){
        System.out.println("[ Autor: " + autor.getNombre() + " " + autor.getApellido() + " , Email: " + autor.getEmail()
                + " , Genero: " + autor.getGenero() + " ]");
    }
}



