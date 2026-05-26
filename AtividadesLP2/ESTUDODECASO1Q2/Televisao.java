package AtividadesLP2.ESTUDODECASO1Q2;

public class Televisao {

    public int tamanhoTela;
    public int volume;
    public int voltagem;
    public String marca;
    public float canal;

    void ligar() {
        int consumoEnergia = voltagem * tamanhoTela;
        System.out.println("Televisão Ligada e o consumo de energia é: " + consumoEnergia);
    }
    void desligar() {
        System.out.println("Televisão Desligada");
    }
    void aumentarVolume() {
        volume++;
        System.out.println("Volume Aumentado para: " + volume);
    }
    void diminuirVolume() {
        volume--;
        System.out.println("Volume Diminuído para: " + volume);
    }
    void subirCanal() {
        canal++;
        System.out.println("Canal Subido para: " + canal);
    }
    void descerCanal() {
        canal--;
        System.out.println("Canal Diminuído para: " + canal);
    }
}
