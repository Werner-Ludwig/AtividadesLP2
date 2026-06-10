package AtividadesLP2.ATIVIDADEPOO.HOSPITAL;

public class Enfermeiro extends Pessoa {
    private int coren;  

    public Enfermeiro(String nome, String cpf, int coren) {
        super.cpf = cpf;
        super.nome = nome;
        this.coren = coren;
    }

    public void exibirPerfil(){
        System.out.println("Enfermeiro exibindo perfil:");
    }

    
}
