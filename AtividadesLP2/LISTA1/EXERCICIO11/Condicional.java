package AtividadesLP2.LISTA1.EXERCICIO11;

import java.util.Scanner;

public class Condicional {

     public static void main(String[] args) {
        int num1, num2, soma;        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor 1: ");
        num1 = teclado.nextInt();
        System.out.println("Informe o valor 2: ");
        num2 = teclado.nextInt();

        soma = num1 + num2;

        if(soma > 10){
            System.out.println(soma + 5);
        } else {
            System.out.println(soma - 7);
        }
        teclado.close();
    }
    
    
}
