package AtividadesLP2.LISTA1.EXERCICIO5;

import java.util.Scanner;

public class Comparador {

    public static void main(String[] args) {
        int num1, num2;        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        num1 = teclado.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = teclado.nextInt();
        
        if(num1 > num2){
            System.out.println("O maior numero é " + num1);
        } else {
            System.out.println("O maior numero é " + num2);
        }       
        
        teclado.close();
    }
    
}
