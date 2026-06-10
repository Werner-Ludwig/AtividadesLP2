package AtividadesLP2.ESTUDOKAKAU;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno ("Kakau", 3.5f, 4.0f);
        Aluno aluno2 = new Aluno ("João", 7.0f, 8.5f);
        Aluno aluno3 = new Aluno ("Maria", 9.0f, 9.5f);
        Aluno aluno4 = new Aluno ("Ana", 5.0f, 4.5f);
        aluno1.calcularMedia();
        aluno2.calcularMedia();
        aluno3.calcularMedia();   
        aluno4.calcularMedia();

        aluno1.imprimirDados();
        aluno2.imprimirDados();
        aluno3.imprimirDados();
        aluno4.imprimirDados();
    }
    
}
