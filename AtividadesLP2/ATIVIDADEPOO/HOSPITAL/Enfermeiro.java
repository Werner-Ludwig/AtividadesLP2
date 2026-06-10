package AtividadesLP2.ATIVIDADEPOO.HOSPITAL;

public class Enfermeiro extends Pessoa {

    public Enfermeiro(String nome, String cpf) {
        super.cpf = cpf;
        super.nome = nome;  
    }

    public void exibirPerfil(){
        System.out.println("Enfermeiro exibindo perfil:");
    }

    
}
