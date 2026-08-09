package AtividadesLP2.EXCEPTION;

import java.util.Scanner;

public class App { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Condutor condutor = new Condutor();
        Veiculo veiculo = new Veiculo();
        CalculadoraSeguro calculadoraSeguro = new CalculadoraSeguro();
        
        try {
            System.out.print("Digite a idade do condutor: ");
            int idade = scanner.nextInt();
            condutor.setIdade(idade);
            
            System.out.print("Digite o valor do veículo: ");
            double valorVeiculo = scanner.nextDouble();
            veiculo.setValor(valorVeiculo);
            
            double seguro = calculadoraSeguro.calcularSeguro(condutor, veiculo);
            System.out.println("O valor do seguro é: " + seguro);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Processo encerrado.");
        }
    }

    
}
