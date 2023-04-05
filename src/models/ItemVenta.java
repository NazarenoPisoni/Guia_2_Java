package models;

public class ItemVenta {
    int id;
    String descripcion;
    int cantidad;
    double precioUnitario;

    public ItemVenta(){};
    public ItemVenta(int id, String descripcion, int cantidad, double precioUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioTotal(){
        return precioUnitario * cantidad;
    }

    public void mostrarItemVenta(){
        System.out.println("ItemVenta [id = " + getId() + " , Descripción = " + getDescripcion()
                + " , Cantidad = " + getCantidad() + " , Precio Unitario = $" + getPrecioUnitario() +
                " , Precio Total = $" + getPrecioTotal());
    }
}



