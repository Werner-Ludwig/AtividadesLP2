package AtividadesLP2.ATIVIDADEPOO.HOSPITAL;

public class Pessoa {

    private int id;
    
    protected String nome, cpf;
    protected int idade;

    public void exibirPerfil(){
        System.out.println("Pessoa exibindo perfil:");
    }

    public int getId() {
        return id;
    }

    
}
