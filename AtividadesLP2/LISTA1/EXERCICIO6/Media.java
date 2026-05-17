package AtividadesLP2.LISTA1.EXERCICIO6;

import java.util.Scanner;

public class Media {
      public static void main(String[] args) {
        float prova1, prova2, trab, media;        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a nota da primeira prova: ");
        prova1 = teclado.nextFloat();
        System.out.println("Informe a nota da segunda prova: ");
        prova2 = teclado.nextFloat();
        System.out.println("Informe a nota do trabalho: ");
        trab = teclado.nextFloat();

        media = (prova1 + prova2 + trab) / 3;
        if(media >= 7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }        

        teclado.close();
    }
    
}
