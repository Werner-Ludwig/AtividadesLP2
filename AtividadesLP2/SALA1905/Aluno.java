package AtividadesLP2.SALA1905;

public class Aluno {
   
    public String nome;
    public int matricula;
    public static int geraMatricula = 0;

    public Aluno(String nome) {
        this.nome = nome;
        this.matricula = ++geraMatricula;
        
    }



}
