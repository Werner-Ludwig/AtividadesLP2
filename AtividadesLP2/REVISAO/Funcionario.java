package AtividadesLP2.REVISAO;

public abstract class Funcionario {

    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) throws IdadeInvalidaException, SalarioInvalidoException {
        this.nome = nome;
        setIdade(idade);
        setSalario(salario);
    }
    
    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }   

    public void setIdade(int idade) {
        if(idade < 18) {
            throw new IllegalArgumentException("Idade inválida. O funcionário deve ter pelo menos 18 anos.");
        }else{
            this.idade = idade;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws SalarioInvalidoException {
        if (salario >= 1000 && salario <= 20000) {
            this.salario = salario;
            
        }else{
            throw new SalarioInvalidoException("Salário inválido. O salário deve estar entre 1000 e 20000.");
        }
    }
}
