package AV1;

public class Computador {
    String marca;
    float preco;
    SistemaOperacional so;
    HardwareBasico[] hws;
    MemoriaUSB usb;

    public Computador(String marca, float preco, SistemaOperacional so, HardwareBasico[] hws) {
        this.marca = marca;
        this.preco = preco;
        this.so = so;
        this.hws = hws;
    }

    public void mostraPCConfigs() {

        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);

        System.out.println("Hardware: ");
        for (HardwareBasico hw : hws) {
            System.out.println(hw.nome + " - Capacidade: " + hw.capacidade);
        }

        System.out.println("Sistema Operacional: " + so.nome + " - " + so.tipo);
        if (usb != null) {
            System.out.println("Memória USB: " + usb.nome + " - Capacidade: " + usb.capacidade);
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        usb = musb;
    }

}
