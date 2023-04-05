package models;

public class CuentaBancaria {
    private String id;
    private double balance;
    private ClienteBancario cliente;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String id, double balance, ClienteBancario cliente) {
        this.id = id;
        this.balance = balance;
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ClienteBancario getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBancario cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "Id='" + id + '\'' +
                ", Balance=" + balance +
                ", Cliente=" + cliente.getNombre() +
                '}';
    }

    public void depositar(int dinero){
        balance += dinero;
    }

    public void extraer(int dinero) {
        if (balance >= dinero) {
            balance -= dinero;
        } else {
            System.out.println("No posee dinero suficiente para efectuar la operación");
        }
    }
}
