package AtividadesLP2.LISTASALA2107.QUESTAO4;

public class ContaPoupanca extends Conta {

    @Override
    public void depositar() {
        System.out.println("Depósito realizado com sucesso na conta poupança.");
    }

    @Override
    public void sacar() {
        System.out.println("Saque realizado com sucesso na conta poupança.");
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo da conta poupança: " + this.saldo);
    }
    
}
