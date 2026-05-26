package AtividadesLP2.ESTUDODECASO1Q1;

public class Carro {

    public String modelo;
    public float velocidade;
    public float aceleracao;
    public int marcha;

    void ligar() {
        System.out.println("Carro Ligado");
    }
    void desligar() {
        System.out.println("Carro Desligado");
    }
    void acelerar() {
        System.out.println("Carro Acelerando");
    }
    void desacelerar() {
        System.out.println("Carro Desacelerando");
    }
    void virarEsquerda() {
        System.out.println("Carro Virando à Esquerda");
    }
    void virarDireita() {
        System.out.println("Carro Virando à Direita");
    }
    void passarMarcha() {
        marcha++;
        System.out.println("Carro Passando Marcha para: " + marcha);        
    }
    void reduzirMarcha() {
        marcha--;
        System.out.println("Carro Reduzindo Marcha para: " + marcha);
    }
    
}
