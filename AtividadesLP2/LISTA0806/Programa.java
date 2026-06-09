package AtividadesLP2.LISTA0806;

public class Programa {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ze", 25.0f, 44);
        f1.rg = "12345678";
        f1.cpf = "123456789";
        //f1.salario=380.0f;
        //f1.maticula=123;
        f1.calcularSalario();
        f1.imprimeDados();

        Funcionario f2 = new Funcionario("Maria", 60.0f, 150);
        f2.rg = "12345678";
        f2.cpf = "123456789101";
        f2.calcularSalario();
        f2.imprimeDados();
    }
    
}
