package AtividadesLP2.LISTA1.EXERCICIO8;

import java.util.Scanner;

public class Circunferenca {

    public static void main(String[] args) {
        float area, raio, pi = 3.14f;        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o raio da circunferência: ");
        raio = teclado.nextFloat();

        area = pi * raio * raio;
        System.out.println("A área da circunferência é: " + area);

        teclado.close();
    }
    
}


