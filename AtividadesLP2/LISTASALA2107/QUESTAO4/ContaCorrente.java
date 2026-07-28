package AtividadesLP2.LISTASALA2107.QUESTAO4;

public class ContaCorrente extends Conta implements Operacoes {

    @Override
    public void depositar() {
        System.out.println("Depósito realizado com sucesso na conta corrente.");
    }

    @Override
    public void sacar() {
        System.out.println("Saque realizado com sucesso na conta corrente.");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo da conta corrente: " + saldo);
    }
    
}
