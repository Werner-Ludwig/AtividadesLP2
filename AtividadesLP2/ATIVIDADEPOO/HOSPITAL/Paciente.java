package AtividadesLP2.ATIVIDADEPOO.HOSPITAL;

public class Paciente extends Pessoa {
    private Prontuario prontuario;

    public Paciente(String nome, String cpf) {
        super.cpf = cpf;
        super.nome = nome;  
    }

    public void exibirPerfil(){
        System.out.println("Paciente exibindo perfil:");
    }


    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    
    
}
