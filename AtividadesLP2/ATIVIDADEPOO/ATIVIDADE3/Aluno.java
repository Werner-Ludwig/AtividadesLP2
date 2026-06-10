package AtividadesLP2.ATIVIDADEPOO.ATIVIDADE3;

public class Aluno extends Pessoa {
    
    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public void estacioa() {
        System.out.println("Aluno estacionando o carro");
    }

    
}
