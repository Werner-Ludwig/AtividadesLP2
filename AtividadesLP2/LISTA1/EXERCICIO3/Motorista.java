package AtividadesLP2.LISTA1.EXERCICIO3;

import java.util.Scanner;

public class Motorista {
    public static void main(String[] args) {
        int idade;        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a idade: ");
        idade = teclado.nextInt();
        
        if(idade < 18){
            System.out.println("Você não pode dirigir");
        } else {
            System.out.println("Você pode dirigir");
        }        
        
        teclado.close();
    }
    
}
