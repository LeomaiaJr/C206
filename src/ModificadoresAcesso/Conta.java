package ModificadoresAcesso;

public class Conta {

    private double saldo = 0;
    private int qntClientes;
    Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        qntClientes = 1;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }

    public void extrato() {
        System.out.println("Saldo: R$" + saldo);
    }

}
