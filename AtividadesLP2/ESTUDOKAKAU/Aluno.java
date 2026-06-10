package AtividadesLP2.ESTUDOKAKAU;

public class Aluno {
    private String nome;
    private float nota1, nota2, media;
    private static int geraMatricula=0;
    private int matricula;

    public Aluno(String nome, float nota1, float nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.matricula = ++geraMatricula; // Gerar matrícula automaticamente
    }
    
    public void calcularMedia() {
        this.media = (nota1 + nota2) / 2;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Matrícula: " + matricula);
    }
}
