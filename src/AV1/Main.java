package AV1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Computador pc1 = new Computador("Positivo", 2300, new SistemaOperacional("Linux Ubuntu", 32),
                new HardwareBasico[] {
                        new HardwareBasico("Pentium Core i3", 2200),
                        new HardwareBasico("Memória RAM", 8),
                        new HardwareBasico("HD", 500)
                });
        pc1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        Computador pc2 = new Computador("Acer", 5800, new SistemaOperacional("Windows 8", 64),
                new HardwareBasico[] {
                        new HardwareBasico("Pentium Core i5", 3370),
                        new HardwareBasico("Memória RAM", 16),
                        new HardwareBasico("HD", 1000)
                });
        pc2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        Computador pc3 = new Computador("Vaio", 1800, new SistemaOperacional("Windows 10", 64),
                new HardwareBasico[] {
                        new HardwareBasico("Pentium Core i7", 4500),
                        new HardwareBasico("Memória RAM", 32),
                        new HardwareBasico("HD", 2000)
                });
        pc3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        Computador[] pcs = new Computador[] { pc1, pc2, pc3 };

        Cliente cliente = new Cliente("LeoLu", 123456789);
        Computador[] computadoresCliente = new Computador[1000];

        int codigo = 0;
        int index = 0;

        do {
            System.out.println("----------MENU----------");
            System.out.println("Qual PC de qual promoção deseja comprar?");
            System.out.println("--------------------");

            for (int i = 0; i < pcs.length; i++) {
                System.out.println("Código " + (i + 1) + ":");
                pcs[i].mostraPCConfigs();
                System.out.println("--------------------");
            }

            System.out.println("Digite o código (Código 0: Sair):");
            codigo = scanner.nextInt();

            if (codigo != 0) {
                if (codigo > pcs.length || codigo < 0) {
                    System.out.println("Código inválido!");
                } else {
                    computadoresCliente[index] = pcs[codigo - 1];
                    index++;
                    System.out.println("Computador adicionado ao carrinho!");
                }
            }
        } while (codigo != 0);

        cliente.computadores = computadoresCliente;

        System.out.println("Nome do cliente: " + cliente.nome + " - CPF do cliente: " + cliente.cpf);
        System.out.println("--------------------");
        System.out.println("Computadores comprados:");

        for (int i = 0; i < cliente.computadores.length; i++) {
            if (cliente.computadores[i] != null) {
                System.out.println("Computador " + (i + 1) + ":");
                cliente.computadores[i].mostraPCConfigs();
                System.out.println("--------------------");
            }
        }

        System.out.println("Total da compra: R$" + cliente.calculaTotalCompra());

        scanner.close();
    }
}