package AtividadesLP2.LISTAEXERCICIO3;

public class App {
    
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Horista();
        Funcionario func3 = new Mensalista();

        func1.calcularPagamento();
        func2.calcularPagamento();
        func3.calcularPagamento();
    }
    
}
