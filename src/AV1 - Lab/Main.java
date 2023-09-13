import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Academia academia = new Academia();
        academia.nome = "Academia do LeoLu";
        academia.numTelefone = "0800-000-0000";

        int opcao = 0;

        do {
            System.out.println("-------------------------");
            System.out.println("1 - Cadastrar equipamento");
            System.out.println("2 - Mostrar informacoes da academia");
            System.out.println("3 - Mostrar quantidade e porcentagem de equipamentos em manutencao");
            System.out.println("4 - Mostrar informacoes do equipamento mais caro e mais barato");
            System.out.println("0 - Sair");
            System.out.println("-------------------------");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Equipamento equipamento = new Equipamento();

                    System.out.println("Digite o número de série do equipamento:");
                    equipamento.numSerie = scanner.nextInt();

                    System.out.println("Digite o nome do equipamento:");
                    equipamento.nome = scanner.next();

                    System.out.println("Digite a marca do equipamento:");
                    equipamento.marca = scanner.next();

                    System.out.println("Digite o valor de aquisição do equipamento:");
                    equipamento.valorAquisicao = scanner.nextDouble();
                    scanner.nextLine();

                    String status = "";
                    do {
                        System.out.println("Digite o status do equipamento (Funcionamento ou Manutencao):");
                        status = scanner.nextLine();

                        if (status.equals("Funcionamento") || status.equals("Manutencao")) {
                            equipamento.status = status;
                        } else {
                            System.out.println("Status inválido!");
                        }

                    } while (!status.equals("Funcionamento") && !status.equals("Manutencao"));
                    equipamento.status = status;

                    academia.cadastrarEquipamento(equipamento);
                    break;
                case 2:
                    academia.mostrarInfos();
                    break;
                case 3:
                    academia.infosEquipamentoManutencao();
                    break;
                case 4:
                    academia.mostrarMaisCaroMaisBarato();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}