package ExemploArray;

public class ContaBancaria {
    private Cliente cliente;
    private String agencia;
    private double saldo;


    public ContaBancaria(Cliente cliente, String agencia, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.saldo = saldo;

        cliente.setContas(this);
    }

    // Getter e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ExemploArray.ContaBancaria{" +
                "cliente=" + cliente.toString() +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
