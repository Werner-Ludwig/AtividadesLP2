package AtividadesLP2.ESTUDODECASO1Q2;

public class Usotv {

    public static void main(String[] args) {
        Televisao tv1 = new Televisao();
        tv1.tamanhoTela = 42;
        tv1.volume = 5;
        tv1.voltagem = 220;
        tv1.marca = "Samsung";
        tv1.canal = 101;

        tv1.ligar();
        tv1.aumentarVolume();
        tv1.subirCanal();
        tv1.descerCanal();
        tv1.diminuirVolume();
        tv1.desligar();
    }
    
}
