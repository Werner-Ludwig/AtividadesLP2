package AtividadesLP2.REVISAO;

public class Principal{
    public static void main(String[] args) throws ArithmeticException {
        int numero1 = 10;
        int numero2 = 0;
        try {
            int resultado = numero1 / numero2;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível realizar divisão por zero");
        }
    }
}