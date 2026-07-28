package AtividadesLP2.LISTASALA2107.QUESTAO3;

public class Coordenador extends Funcionario {
    private float adicionalGratificacao;

    @Override
    public void calcularSalario() {
        this.salarioTotal = this.salarioBase + this.adicionalGratificacao;
    }
    
}
