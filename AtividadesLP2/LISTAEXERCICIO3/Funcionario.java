package AtividadesLP2.LISTAEXERCICIO3;

public class Funcionario {
    private String nome, cpf;    
    private float salario, horasTrabalhadas, valorHora;


    public void calcularPagamento(float valorHora, float horasTrabalhadas){
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salario = valorHora * horasTrabalhadas;

        System.out.println("Salario: " + this.salario);

    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public float getSalario() {
        return salario;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }   

    public float getValorHora() {
        return valorHora;
    }
    
}
