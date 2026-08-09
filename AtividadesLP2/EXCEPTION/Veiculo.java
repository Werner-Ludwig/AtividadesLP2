package AtividadesLP2.EXCEPTION;

public class Veiculo {
    private double valor;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do veículo inválido. Por favor, insira um valor válido.");
        }
        this.valor = valor;
    }
}
