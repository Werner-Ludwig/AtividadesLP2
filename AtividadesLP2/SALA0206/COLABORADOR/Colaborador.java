package AtividadesLP2.SALA0206.COLABORADOR;

public class Colaborador {
    protected String nome;
    protected int rg;
    protected int cpf;

    public Colaborador(String nome, int rg, int cpf) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }
    //sobrecarga de construtor
    public Colaborador(String nome){ 
        this.nome = nome;
    }
    public Colaborador(){
        this("Cleber"); 
    }

    public int participarCirugia(String nome) {        
            System.out.println("Colaborador realizando da cirurgia");
            return 10;
    }

    public void participarCirugia() {        
            System.out.println("Colaborador realizando da cirurgia");        
    }
    
}
