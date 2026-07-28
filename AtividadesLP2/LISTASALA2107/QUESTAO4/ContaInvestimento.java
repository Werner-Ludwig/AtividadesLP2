package AtividadesLP2.LISTASALA2107.QUESTAO4;

public class ContaInvestimento extends Conta implements Operacoes {
    
    @Override
    public void depositar() {
        System.out.println("Depósito realizado com sucesso na conta de investimento.");
    }

    @Override
    public void sacar() {
        System.out.println("Saque realizado com sucesso na conta de investimento.");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo da conta de investimento: " + saldo);
    }

    public void renderJuros() {
        System.out.println("Rendimentos aplicados na conta de investimento.");
    }
    
}
