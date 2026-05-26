package AtividadesLP2.SALA1;
import java.util.Scanner;

public class App{
        public static void main(String n[]){
            Scanner teclado = new Scanner(System.in);
            Pessoa pessoa = new Pessoa();
            //pessoa.andarDeCarro();
            pessoa.pararOCarro();

            System.out.println("Informe a cor");
            Carro carro = new Carro();
            carro.cor = teclado.next();

            System.out.println("A cor do carro é " + carro.cor);
            teclado.close();
        }
}