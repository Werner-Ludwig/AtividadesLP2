package AtividadesLP2.LISTAEXERCICIO3;

public class App {
    
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Horista();
        Funcionario func3 = new Mensalista();

        func1.calcularPagamento(10,20);
        func2.calcularPagamento(20,30);
        func3.calcularPagamento(30,40);
    }
    
}
