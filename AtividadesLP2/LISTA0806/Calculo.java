package AtividadesLP2.LISTA0806;

public class Calculo {

    private float totalSalario;  

    public void calculaSalario(float salarioBase, float horasTrabalhadas) {
        totalSalario = salarioBase * horasTrabalhadas;
        System.out.println("Salário total: R$ " + totalSalario);
    }

    //GETTERS
    public float getTotalSalario() {
        return totalSalario;
    }
    
}
