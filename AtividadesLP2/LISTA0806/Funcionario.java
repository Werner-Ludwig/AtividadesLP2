package AtividadesLP2.LISTA0806;

public class Funcionario {
    public String nome, cpf, rg;
    private int matricula, dataContratacao;
    private float salario, salarioBase, horasTrabalhadas;
    public static int geraMatricula = 0;

    public Funcionario(String nome, float salarioBase, float horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataContratacao = 2026;
        geraMatricula++;
        this.matricula = geraMatricula;
    }
    
    public void calcularSalario() {
        Calculo calculo = new Calculo();
        calculo.calculaSalario(salarioBase, horasTrabalhadas);
        this.salario = calculo.getTotalSalario();
    }

    //GETTERS encapsulados
    public float getSalarioBase() {
        return salarioBase;
    }

    public void imprimeDados() {
        
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Data de Contratação: " + dataContratacao);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Salário Total: R$ " + salario);
    }
    
}
