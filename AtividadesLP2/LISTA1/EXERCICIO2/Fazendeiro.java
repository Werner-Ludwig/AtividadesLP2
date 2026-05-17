package AtividadesLP2.LISTA1.EXERCICIO2;

import java.util.Scanner;

public class Fazendeiro {
    public static void main(String[] args) {
        float distanciaPercorrida, precoDoLitro, valorGasto;        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a distancia percorrida: ");
        distanciaPercorrida = teclado.nextFloat();

        System.out.println("Informe o preco do litro: ");
        precoDoLitro = teclado.nextFloat();

        valorGasto = (distanciaPercorrida / 12) * precoDoLitro;
        
        System.out.printf("O valor gasto com combustível é " + valorGasto);
        
        teclado.close();
    }
    
}
