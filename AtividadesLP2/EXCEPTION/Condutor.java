package AtividadesLP2.EXCEPTION;

public class Condutor {
    private int idade;
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IdadeInvalidaException {
        if (idade < 18 ) {
            throw new IdadeInvalidaException("Idade do condutor inválida.");
        }
        this.idade = idade;
    }
}
