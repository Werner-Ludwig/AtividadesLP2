package AtividadesLP2.ATIVIDADEPOO.HOSPITAL;

public class Medico extends Pessoa{
    private int crm;

    public Medico(String nome, String cpf, int crm) {
        super.cpf = cpf;
        super.nome = nome;
        this.crm = crm;
    }

    public void exibirPerfil(){
        System.out.println("Medico exibindo perfil:");
    }

    
}
