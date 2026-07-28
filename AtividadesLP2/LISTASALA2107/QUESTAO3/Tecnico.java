package AtividadesLP2.LISTASALA2107.QUESTAO3;

public class Tecnico extends Funcionario {
    private float adicionalInsalubridade;

    @Override
    public void calcularSalario() {
        this.salarioTotal = this.salarioBase + this.adicionalInsalubridade;
    }
    
}
