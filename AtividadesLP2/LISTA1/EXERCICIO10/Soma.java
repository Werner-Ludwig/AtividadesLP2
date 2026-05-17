package AtividadesLP2.LISTA1.EXERCICIO10;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        int num1, num2, soma;        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor 1: ");
        num1 = teclado.nextInt();
        System.out.println("Informe o valor 2: ");
        num2 = teclado.nextInt();

        soma = num1 + num2;

        if(soma > 10){
            System.out.println(soma);
        } 
        teclado.close();
    }
    
}
