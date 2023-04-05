package models;

public class ClienteBancario {
    private String id;
    private String nombre;
    private char genero;

    public ClienteBancario() {
    }

    public ClienteBancario(String id, String nombre, char genero) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "ClienteBancario{" +
                "Id='" + id + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Genero=" + genero +
                '}';
    }
}
