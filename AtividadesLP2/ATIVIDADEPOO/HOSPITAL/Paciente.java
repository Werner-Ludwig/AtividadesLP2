package AtividadesLP2.ATIVIDADEPOO.HOSPITAL;

public class Paciente extends Pessoa {
    private Prontuario prontuario;

    public Paciente(String nome, String cpf) {
        super.cpf = cpf;
        super.nome = nome;  
        this.prontuario = new Prontuario(); // Composicao, prontuario é parte do paciente, não existe sem paciente
    }

    public void exibirPerfil(){
        System.out.println("Paciente exibindo perfil:");
    }

    //Agregacao, prontuario pode existir sem paciente, mas paciente tem um prontuario
    //public Prontuario getProntuario() {
    //    return prontuario;
    //}
    //public void setProntuario(Prontuario prontuario) {
    //    this.prontuario = prontuario;
    //}

    
    
}
