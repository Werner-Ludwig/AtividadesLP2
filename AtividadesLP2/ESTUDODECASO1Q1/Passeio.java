package AtividadesLP2.ESTUDODECASO1Q1;

public class Passeio {
    
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.modelo = "Esportivo";
        carro1.velocidade = 120.0f;
        carro1.aceleracao = 10.0f;
        carro1.marcha = 3;

        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Velocidade: " + carro1.velocidade + " km/h");
        System.out.println("Aceleração: " + carro1.aceleracao + " m/s²");
        System.out.println("Marcha: " + carro1.marcha);

        carro1.ligar();
        if (carro1.aceleracao >0){
            carro1.acelerar();
        }else{
            carro1.desacelerar();
        }      
        carro1.virarEsquerda();
        carro1.virarDireita();
        carro1.passarMarcha();
        carro1.reduzirMarcha();
        carro1.desligar();
    }
    
}
