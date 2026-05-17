package LISTA1.EXERCICIO1;

import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        int horasTrabalhadas;        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe as horas trabalhadas: ");
        horasTrabalhadas = teclado.nextInt();
        
        System.out.println("Seu salario é " + horasTrabalhadas*20);
        
        teclado.close();
    }
}

