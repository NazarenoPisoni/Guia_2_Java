
import models.*;
public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        autor1.mostrarAutor();

        Libro libro1 = new Libro("Effective Java", 450, 150, autor1);
        libro1.mostrarLibro();

        libro1.setPrecio(500);
        libro1.incrementarStock(50);
        libro1.mostrarLibro();

        libro1.mostrarAutor();

        Cliente cliente1 = new Cliente("Juan Perez", "juan@hotmail.com", 25);
        System.out.println(cliente1.toString());

        Factura factura1 = new Factura(1000, cliente1);

        factura1.crearItem(4373, "Parlante Bluetooth", 1, 30000);
        factura1.crearItem(4374, "Teclado", 2, 15000);
        factura1.mostrarItems();

        System.out.println(factura1.toString());

        ClienteBancario cl1 = new ClienteBancario("1234SHSDGJH", "Jorge Rodriguez", 'M');
        System.out.println(cl1.toString());

        CuentaBancaria cuenta1 = new CuentaBancaria("1234SHSDGJH", 10000, cl1);
        System.out.println(cuenta1.toString());
        cuenta1.depositar(20000);
        cuenta1.extraer(5000);
        System.out.println(cuenta1.toString());    }
}

