package AtividadesLP2.Prova1.Questao2;

public class App {

    public static void main(String[] args) {
        Veiculo veiculoC = new Carro();
        Veiculo veiculoM = new Moto();
        Veiculo veiculoO = new Onibus();
        
        ControleVeiculos controleVeiculos = new ControleVeiculos();
        
        controleVeiculos.controleVeiculo(veiculoC);
        controleVeiculos.controleVeiculo(veiculoM);
        controleVeiculos.controleVeiculo(veiculoO);
    }
    
}
