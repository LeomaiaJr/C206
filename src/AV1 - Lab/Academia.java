public class Academia {
    String nome;
    String numTelefone;
    Equipamento[] equipamentos = new Equipamento[40];

    void mostrarInfos() {
        System.out.println(
                "Nome: " + nome + ", Numero de telefone: " + numTelefone);
        System.out.println("Equipamentos:");

        for (int i = 0; i < equipamentos.length; i++) {
            if (equipamentos[i] != null) {
                equipamentos[i].mostrarInfos();
            }
        }
    }

    void cadastrarEquipamento(Equipamento equipamento) {
        for (int i = 0; i < equipamentos.length; i++) {
            if (equipamentos[i] == null) {
                equipamentos[i] = equipamento;
                break;
            }
        }
    }

    void infosEquipamentoManutencao() {
        int equipamentosManutencao = 0;
        int numeroEquipamentos = 0;

        for (int i = 0; i < equipamentos.length; i++) {
            if (equipamentos[i] != null) {
                numeroEquipamentos++;
                if (equipamentos[i].status.equals("Manutencao")) {
                    equipamentosManutencao++;
                }
            }
        }

        if (numeroEquipamentos < 2) {
            System.out.println(
                    "Não há equipamentos suficientes para mostrar a porcentagem de equipamentos em manutencao");
            return;
        }

        int porcentagemEquipamentosManutencao = (equipamentosManutencao * 100) / numeroEquipamentos;

        System.out.println("Quantidade de equipamentos em manutencao: " + equipamentosManutencao);
        System.out.println("Porcentagem de equipamentos em manutencao: " + porcentagemEquipamentosManutencao + "%");

    }

    void mostrarMaisCaroMaisBarato() {
        int maisBaratoIndex = 0;
        int maisCaroIndex = 0;
        int numeroEquipamentos = 0;

        for (int i = 0; i < equipamentos.length; i++) {
            if (equipamentos[i] != null) {
                numeroEquipamentos++;
                if (equipamentos[i].valorAquisicao < equipamentos[maisBaratoIndex].valorAquisicao) {
                    maisBaratoIndex = i;
                }

                if (equipamentos[i].valorAquisicao > equipamentos[maisCaroIndex].valorAquisicao) {
                    maisCaroIndex = i;
                }
            }
        }

        if (numeroEquipamentos < 2) {
            System.out.println("Não há equipamentos suficientes para mostrar o mais caro e o mais barato");
            return;
        }

        System.out.println("Equipamento mais barato:");
        equipamentos[maisBaratoIndex].mostrarInfos();

        System.out.println("Equipamento mais caro:");
        equipamentos[maisCaroIndex].mostrarInfos();
    }
}
