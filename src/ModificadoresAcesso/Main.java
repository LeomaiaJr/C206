package ModificadoresAcesso;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setId(1);
        cliente.setCont(0);

        Conta conta = new Conta();
        conta.setCliente(cliente);
        conta.deposita(1000);
        conta.extrato();
        conta.saca(500);
        conta.extrato();
    }

}
