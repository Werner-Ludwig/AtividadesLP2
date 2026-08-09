package AtividadesLP2.EXCEPTION;

public class CalculadoraSeguro {

    public double calcularSeguro(Condutor condutor, Veiculo veiculo) {
        int idade = condutor.getIdade();
        double valorVeiculo = veiculo.getValor();
        double fatorIdade;

        if (idade >= 18 && idade <= 25) {
            fatorIdade = 0.07;
        } else {
            fatorIdade = 0.05;
        }
        
        return valorVeiculo * fatorIdade;
    }
    
}
