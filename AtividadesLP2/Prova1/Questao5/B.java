package AtividadesLP2.Prova1.Questao5;

public class B extends A {

    B() {
        super("Chamado pelo B");
        System.out.println("Construtor de B");
    }

    B(int x) {
        this();
        System.out.println("B recebeu: " + x);
    }
}