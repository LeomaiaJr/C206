public class Equipamento {
    int numSerie;
    String nome;
    String marca;
    double valorAquisicao;
    String status;

    void mostrarInfos() {
        System.out.println("Número de serie: " + numSerie + ", Nome: " + nome + ", Marca: " + marca
                + ", Valor de aquisicao: " + valorAquisicao + ", Status: " + status);
    }
}
