package AtividadesLP2.LISTA1.EXERCICIO7;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        float peso, altura, imc;        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o peso: ");
        peso = teclado.nextFloat();
        System.out.println("Informe a altura: ");
        altura = teclado.nextFloat();

        imc = peso / (altura * altura);

        if(imc > 30){
            System.out.println("Você está obeso!");
        }      
     
        teclado.close();
    }
    
}
