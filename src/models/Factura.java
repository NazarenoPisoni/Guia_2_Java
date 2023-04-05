package models;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
public class Factura {
    private String id;
    private double montoTotal;

    Date fechaHoraActual = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private String fecha = formato.format(fechaHoraActual);
    private Cliente cliente;
    private List<ItemVenta> items = new ArrayList<ItemVenta>();

    public Factura() {
    }

    public Factura(double montoTotal, Cliente cliente) {
        this.id = getVariableAleatoria();
        this.montoTotal = montoTotal;
        this.cliente = cliente;
    }
    public String getVariableAleatoria() {

        Random aleatorio = new Random();
        String variableAleatoria = "";

        // Genera 8 caracteres aleatorios (4 letras y 4 números)
        for (int i = 0; i < 4; i++) {
            // Genera una letra aleatoria (mayúscula o minúscula)
            char letra = (char) (aleatorio.nextInt(26) + 'a');
            if (aleatorio.nextBoolean()) {
                letra = Character.toUpperCase(letra);
            }
            // Genera un número aleatorio
            int numero = aleatorio.nextInt(10);

            // Concatena la letra y el número generados a la cadena
            variableAleatoria += letra + String.valueOf(numero);

        }
        return variableAleatoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = getVariableAleatoria();
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double calcularMontoFinal(){
        double montoFinal = montoTotal - (montoTotal / 100 * cliente.getDescuento());
        return montoFinal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "Id='" + id + '\'' +
                ", Fecha='" + fecha + '\'' +
                ", Cantidad de Productos= " + items.size() +
                ", Monto Total= $ " + calcularMontoTotalItems() +
                ", Monto Final= $ " + calcularMontoFinalItems() +
                "] [Cliente{" +
                ", Id=" + cliente.getId() +
                ", Nombre= " + cliente.getNombre() +
                ", Email= " + cliente.getEmail() +
                ", Descuento= " + cliente.getDescuento() + " %" +
                " }]";
    }

    public void crearItem(int id, String descripcion, int cantidad, double precioUnitario){
        ItemVenta item = new ItemVenta(id, descripcion, cantidad, precioUnitario);
        items.add(item);
    }

    public void mostrarItems(){
        for(ItemVenta item : items){
            System.out.println("ItemVenta [id = " + item.getId() + " , Descripción = " + item.getDescripcion()
                    + " , Cantidad = " + item.getCantidad() + " , Precio Unitario = $" + item.getPrecioUnitario() +
                    " , Precio Total = $" + item.getPrecioTotal());
        }
    }

    public double calcularMontoTotalItems(){
        double total = 0;
        for(ItemVenta item : items){
            total += item.cantidad * item.precioUnitario;
        }
        return total;
    }

    public double calcularMontoFinalItems(){
        double totalInicial = calcularMontoTotalItems();
        double descuento = totalInicial / 100 * cliente.getDescuento();
        double totalFinal = totalInicial - descuento;

        return totalFinal;
    }
}
