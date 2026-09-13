package AtividadesLP2.REVISAO;
import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do funcionario: ");
        String nome = scanner.nextLine();

        try {

            System.out.print("Digite a idade do funcionario: ");
            int idade = scanner.nextInt();            

            System.out.print("Digite o salário do funcionario: ");
            double salario = scanner.nextDouble();
            
            Funcionario repositor = new Repositor(nome, idade, salario);
            System.out.println("Funcionario " + repositor.getNome() + " cadastrado com sucesso!");
            System.out.println("Idade: " + repositor.getIdade());
            System.out.println("Salário: " + repositor.getSalario());


        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (SalarioInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            
        }
        


    }
    
}
