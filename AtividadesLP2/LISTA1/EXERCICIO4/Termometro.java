package AtividadesLP2.LISTA1.EXERCICIO4;

import java.util.Scanner;

public class Termometro {
    public static void main(String[] args) {
        int temperatura;        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a temperatura: ");
        temperatura = teclado.nextInt();
        
        if(temperatura > 37){
            System.out.println("Está com febre");
        } else {
            System.out.println("Sua temperatura está normal");
        }        
        
        teclado.close();
    }
    
}
