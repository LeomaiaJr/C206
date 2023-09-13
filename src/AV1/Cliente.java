package AV1;

public class Cliente {
    String nome;
    long cpf;
    Computador[] computadores;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra() {
        float total = 0;

        for (Computador computador : computadores) {
            if (computador != null) {
                total += computador.preco;
            }
        }

        return total;
    }

}
