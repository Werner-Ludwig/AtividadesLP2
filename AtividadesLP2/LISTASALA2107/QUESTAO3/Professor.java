package AtividadesLP2.LISTASALA2107.QUESTAO3;

public class Professor extends Funcionario {
    private float adicionalHoraAula;

    @Override
    public void calcularSalario() {
        this.salarioTotal = this.salarioBase + this.adicionalHoraAula;
        
    }
    
}
