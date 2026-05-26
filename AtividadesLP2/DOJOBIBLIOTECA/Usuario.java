package AtividadesLP2.DOJOBIBLIOTECA;

public class Usuario {
    private String nome;
    private int idUsuario;
    private String curso;


    //GETTERS
    public String getNome() {
        return nome;
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public String getCurso(){
        return curso;
    }


    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }


    //Método para exibir as informações do usuário
    public void exibirUsuario() {
        System.out.println("Nome: " + nome);
        System.out.println("ID do Usuário: " + idUsuario);
        System.out.println("Curso: " + curso);
    }
}
