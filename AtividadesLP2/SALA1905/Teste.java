package AtividadesLP2.SALA1905;

public class Teste {

    public String nome;
    public int matricula;
    public static int geraMatricula = 0;

        public static void main (String[] args) {

        //Aluno aluno1 = new Aluno("Cleber");

        //Aluno aluno2 = new Aluno("Ana");

        Aluno aluno3 = new Aluno("João");

        System.out.println(aluno3.matricula);

        System.out.println(Aluno.geraMatricula);

    }
}
