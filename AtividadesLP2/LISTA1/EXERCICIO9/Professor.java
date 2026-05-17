package AtividadesLP2.LISTA1.EXERCICIO9;

import java.util.Scanner;

public class Professor {

    public static void main(String[] args) {
        float valorHoraAula, horasTrabalhadas, descontoInss, salarioBruto, salarioLiquido;        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor da hora-aula: ");
        valorHoraAula = teclado.nextFloat();
        System.out.println("Informe o número de horas trabalhadas: ");
        horasTrabalhadas = teclado.nextFloat();
        System.out.println("Informe o desconto do INSS: ");
        descontoInss = teclado.nextFloat();

        salarioBruto = valorHoraAula * horasTrabalhadas;
        salarioLiquido = salarioBruto - (salarioBruto * descontoInss);
        System.out.println("O salário líquido do professor é: " + salarioLiquido);

        teclado.close();
    }
    
}
