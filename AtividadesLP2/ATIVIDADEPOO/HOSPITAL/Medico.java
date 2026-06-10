package AtividadesLP2.ATIVIDADEPOO.HOSPITAL;

public class Medico extends Pessoa{

    public Medico(String nome, String cpf) {
        super.cpf = cpf;
        super.nome = nome;
    }

    public void exibirPerfil(){
        System.out.println("Medico exibindo perfil:");
    }

    
}
