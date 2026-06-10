package AtividadesLP2.ATIVIDADEPOO.ATIVIDADE3;

public class Pessoa {

    protected String nome;

    public Pessoa() {
    
    }   

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void estacioa(){
        System.out.println("Pessoa estacionando o carro");
    }
    
    public void estaciona(int vaga) {
        System.out.println("Pessoa estacionando o carro na vaga " + vaga);
    }

}
